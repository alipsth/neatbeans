package oopbank;
import java.util.Scanner;
public class OOPbank {
    public static void main(String[] args) { 

   Scanner s = new Scanner(System.in);
     int b,xx;
     String xxxx;

        System.out.println("");
        
    System.out.print("Masukan Nomer Rekening anda : ");
     account xx1;
        xx1 = new account(s.nextInt());
    System.out.println(xx1);
        System.out.println("");
        
    do{
        System.out.println("Silahkan Pilih Transaksi");
        System.out.println("1.CREDIT");
        System.out.println("2.DEBIT");
        System.out.print("Masukan Pilihan Anda : ");
        xx=s.nextInt();
        if (xx == 1) {
          System.out.println("Anda Masuk Ke Transaksi Credit");
          System.out.print("Silahkan Masukan Nominal : "); 
          xx1.credit(s.nextDouble());
          System.out.println(xx1);
        }
        else if (xx == 2) {
          System.out.println("Anda Masuk Ke Transaksi Credit");
          System.out.print("Silahkan Masukan Nominal : "); 
          xx1.debit(s.nextDouble());
          System.out.println(xx1);
        } else 
            System.out.println("=============");
            
        System.out.println("APAKAH ANDA  INGIN TRANSAKSI LAGI (Y/T) : ");
        xxxx = s.next();
    }while(xxxx.equalsIgnoreCase("y"));
    }
}
