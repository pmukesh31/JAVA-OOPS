/*Java Application to show how Bank transactions run concurrenlty without error*/
//IF synchronized is remove there are chanches that amount varaible is accessed at same time and wrong output is shown
class Account{
    int account;
    int balance;
    void display()
    {
        System.out.println("Account NO. "+ account+" Balance is: "+balance);
    }
    synchronized void withDraw(int amount)
    {
        balance=balance-amount;
        System.out.println("Withdraw amount "+amount );
        display();
    }
    synchronized  void Deposit(int amount)
    {
        balance=balance+amount;
        System.out.println("Deposit amount "+amount );
        display();
    }
}
class TransactionDeposit implements Runnable{
    Account accountx;
    int amount;
    TransactionDeposit(Account y,int amount)
    {
        accountx=y;
        this.amount=amount;
        new Thread(this).start();
}
    public void run()
    {
        accountx.Deposit(amount);
    }
}
class TransactionWithdraw implements Runnable{
    Account accountx;
    int amount;
    TransactionWithdraw(Account y,int amount)
    {
        accountx=y;
        this.amount=amount;
        new Thread(this).start();
}
    public void run()
    {
        accountx.withDraw(amount);
    }
}
public class Bank{
    public static void main(String args[])
    {
        
        Account ABC=new Account();
        ABC.balance=1000;
        ABC.account=111;
        TransactionDeposit t1;
        TransactionWithdraw t2;
        t1=new TransactionDeposit(ABC,500);
        t2=new TransactionWithdraw(ABC,900);
    }
}