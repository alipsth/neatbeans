package gajian1;
import java.util.Scanner;
public class Gajian1 {
    public static void main(String[] args) {
  
    pegawai p1 = new pegawai();
    staff p2 = new staff();
    dosen p3 = new dosen();
    int pil,kehadiran,sks;
    String nip,nama,alamat;
        Scanner cuk = new Scanner(System.in);
        System.out.println("PROGRAM PENGAJIAN");
        System.out.println("1.PEGAWAI");
        System.out.println("2.STAFF");
        System.out.println("3.DOSEN");
        System.out.println("MASUKAN PILIHAN ANDA : ");
        pil = cuk.nextInt();
        switch (pil){
            case 1:
                System.out.println("Anda masuk sebagai Pegawai");
                System.out.print("Masukan nip anda : ");
                nip = cuk.nextLine();
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
                nip = cuk.nextLine();
                System.out.print("Masukan nama anda : ");
                nama = cuk.nextLine();
                System.out.print("Masukan alamat anda : ");
                alamat = cuk.nextLine();
                p2.toString();
                System.out.println(p2);        
                break;
          
            case 3:
                System.out.println("Anda masuk sebagai Dosen");
                System.out.print("Masukan nip anda : ");
                nip = cuk.nextLine();
                System.out.print("Masukan nama anda : ");
                nama = cuk.nextLine();
                System.out.print("Masukan alamat anda : ");
                alamat = cuk.nextLine();
                p3.toString();
                System.out.println(p3);        
                break;
                
                    
                
                
                
        }
    }
    
}
