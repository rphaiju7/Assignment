package Java_Advanced_Lab_Part2.Day1.Assignment7;

public class DepositTransaction extends Thread{
    private int transactionId;
    private Account account;
    private double amount;
    private int customerId;
    public DepositTransaction(int transactionId, Account account, int customerId, double amount){
        this.transactionId = transactionId;
        this.account = account;
        this.customerId = customerId;
        this.amount = amount;

    }
    public void deposit(Account account, double amount){
        // deposit the amount
        account.setBalance((account.getBalance())+amount);
    }
    public void run(){
        //synchronized
        //deposit the amount
        deposit(account,amount);
        // displaying the success message
        System.out.println(transactionId+" transaction completed. "+customerId
                +" thank you for depositing the account"
                +" "+account.getAccountNo());

    }
}