package oopbank;
public class account {
    private int AccountNumber,input;
    private double Balance;
  
    
     account(int AccountNumber){
      this.AccountNumber = AccountNumber;
    }
     account (int AcountNumber,double Balance){
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }
      public void getAccountNumber(int AccountNumber){
        this.AccountNumber = AccountNumber;
    }
    public double getBalance(){
    return Balance;
    }
     public void setBalance(double Balance){
    this.Balance = Balance;
  }
     public void credit(double amount){
         this.Balance=this.Balance+amount;
     }
     public void debit (double amount){
         this.Balance=this.Balance-amount;
     }
    @Override
    public String toString(){
        String s ="";
        if(Balance>=0){
        s="A/C = "+this.AccountNumber  +", Balance : $"+this.Balance;
        }
        else
            System.out.println(" Uangmu Kurang MISKIN ...!!!");
        return s;
}
     
}
