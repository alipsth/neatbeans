
package bank;

public class Rekening {
    public int accountNumber;
    private double balance =0;
    
    
    Rekening (int accountNumber , double balance){
        this.accountNumber = accountNumber;
        this.balance =balance; 
    }
    Rekening (int accountNumber){
        this.accountNumber = accountNumber;
    }
    private void getaccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void getbalance(int balance){
        this.balance = balance;
    }
    public void setbalance(double balance){
        this.balance = balance;
    }
    public void credit(double amount){
        this.balance = balance + amount;
    }
    public void debit(double amount){
        if (balance < amount) {
            System.out.println(this.balance +" - "+ amount + " = ");
            System.out.println("UANG TIDAK CUKUP");
        }
        else{
           this.balance =balance - amount;
        }
    }
    @Override
    public String toString(){
        String s ="No Rekening Anda : " + this.accountNumber + "\nSaldo anda adalah : "+ this.balance;
        return s;
    }
    
}
