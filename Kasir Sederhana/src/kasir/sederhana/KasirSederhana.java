
package kasir.sederhana;

import java.util.Scanner;

import javax.swing.JOptionPane;
public class KasirSederhana {


    public static void main(String[] args) {
    Scanner r = new Scanner (System.in);
    int e,f;
    int harga=0;
    int buku=3000,kertas=2000,Pulpenbiru=2500,Pulpenhitam=1000,Penggaris=1500;
    String rr;
    
        System.out.println("");
        
        System.out.println("MENU ALAT TULIS : ");
        System.out.println("");
        System.out.println("_______________________________________________");
        
        System.out.println("No Nama                            Harga");
        System.out.println("1. Buku Tulis                     Rp.3000");
        System.out.println("2. Kertas HVS 10 lmbr             Rp.2000");
        System.out.println("3. Pulpen Tinta Biru              Rp.2500");
        System.out.println("4. Pulpen Tinta Hitam             Rp.1000");
        System.out.println("5. Penggaris 15 cm                Rp.1500");
        
        System.out.println("_______________________________________________");
        do{
        
        System.out.print("Masukan Nomor Pesanan : ");
        e = r.nextInt();
        System.out.println("________________________________________________");
        int pilihan=0;
        if (e == 1){
            System.out.println("Pilihan Anda Nomor 1 Buku Tulis ");
            harga=harga+buku;
            
        }
        else if (e == 2){
            System.out.println("Pilihan Anda Nomor 2 Kertas HVS 10 lmbr");
            harga=harga+kertas;
        }
        else if (e == 3){
            System.out.println("Pilihan Anda Nomor 3 Pulpen Tinta Biru");
            harga=harga+Pulpenbiru;
        }
        else if (e == 4){
            System.out.println("Pilihan Anda Nomor 4 Pulpen Tinta Biru");
            harga=harga+Pulpenhitam;
        }
        else if (e == 5){
            System.out.println("Pilihan Anda Nomor 5 Penggaris");
            harga=harga+Penggaris;
        }
        else {
            System.out.println("KODE ANDA SALAH");
        
        }
           System.out.println("Apakah Anda Mau Melanjutkan ? Y/ T : ");
           rr = r.next();
       
       }while(rr.equalsIgnoreCase("y"));
       if (harga >= 5000 ){
           int dis = harga*3/100;
           int total = harga-dis;
           JOptionPane.showMessageDialog(null,"Selamat anda mendapatkan diskob 3% \n"
                   + "total pembayaran sebesar "+total);
    }
       else{
           JOptionPane.showMessageDialog(null,"total belanjaan anda Rp. "+rr);
       }   
     
}
}