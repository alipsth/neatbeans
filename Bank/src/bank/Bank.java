
package bank;

public class Bank {

    public static void main(String[] args) {
        Rekening sl = new Rekening(12345);
        
        sl.credit(700);
        System.out.println(sl);
        sl.credit(500);
        System.out.println(sl);
        sl.credit(10000);
        System.out.println();
        sl.debit(15000);
        System.out.println(sl);
    }
    
}
