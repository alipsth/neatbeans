
package gajian;
import java.util.Scanner;
public class Gajian {

    public static void main(String[] args) {
       
          
    Pegawai p1 = new Pegawai();
    Staff p2 = new Staff();
    Dosen p3 = new Dosen();
    int pil,nip,kehadiran,sks;
    String nama,alamat;
    
    
        Scanner cuk = new Scanner(System.in);
        System.out.println("PROGRAM PENGAJIAN");
        System.out.println("1.PEGAWAI");
        System.out.println("2.STAFF");
        System.out.println("3.DOSEN");
        System.out.print("MASUKAN PILIHAN ANDA : ");
        pil = cuk.nextInt();
        switch (pil){
            case 1:
                System.out.println("Anda masuk sebagai Pegawai");
                System.out.print("Masukan nip anda : ");
                nip = cuk.nextInt();
                System.out.print("Masukan nama anda : ");
                nama = cuk.nextLine();
                System.out.print("Masukan alamat anda : ");
                alamat = cuk.nextLine();
                p1.getGaji(1500000);
                System.out.println(p1);        
                break;
            
            case 2:
                System.out.println("Anda masuk sebagai Staff");
                System.out.print("Masukan nip anda : ");
                nip= cuk.nextInt();
                System.out.print("Masukan nama anda : ");
                nama = cuk.nextLine();
                System.out.print("Masukan alamat anda : ");
                alamat = cuk.nextLine();
                p2.toString();
                p2.setjumlahkehadiran(5);
                System.out.println(p2);        
                break;
          
            case 3:
                System.out.println("Anda masuk sebagai Dosen");
                System.out.print("Masukan nip anda : ");
                nip = cuk.nextInt();
                System.out.print("Masukan nama anda : ");
                nama = cuk.nextLine();
                System.out.print("Masukan alamat anda : ");
                alamat = cuk.nextLine();
                p3.toString();
                p3.setjumlahsks(5);
                System.out.println(p3);        
                break;
             
        }
    }    
}
