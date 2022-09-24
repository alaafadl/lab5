public class BankAccount {

private  double balance;

   
         public BankAccount(double initialbalance){
        balance=initialbalance;}
    public BankAccount(){
     this(0);}
    public void mystery(BankAccount that,double amount)
    {this.balance=this.balance-amount;
    that.balance=that.balance+amount;
    }

    public void  deposit(double balance){
   this. balance=this.balance+balance;

    }

    public void  withdraw(double amount){

balance=balance-amount;
    }



    public double  getbalance(){
return balance;
    }
    public  void addInsert(double rate)
    {
        balance=balance+balance*(rate/100);
    }
public  void deduct(int n)
{   if (n>5)
    balance=balance-n+5;}
}
