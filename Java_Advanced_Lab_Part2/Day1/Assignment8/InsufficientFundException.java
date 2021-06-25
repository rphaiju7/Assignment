package Java_Advanced_Lab_Part2.Day1.Assignment8;
import Java_Advanced_Lab_Part2.Day1.Assignment8.InsufficientFundException;
import Java_Advanced_Lab_Part2.Day1.Assignment8.BankFund;
public class LoanTransaction implements Runnable{
    private BankFund bankFund;
    private int customerId;
    private double loanAmount;
    public LoanTransaction(BankFund bankFund, int customerId, double loanAmount){
        this.bankFund = bankFund;
        this.customerId= customerId;
        this.loanAmount = loanAmount;
    }
    public synchronized void startTH(){
        try{
            //checking if the bank has sufficient fund
            bankFund.checkFund(loanAmount);
            //document verification delay
            Thread.sleep((long)(2000*Math.random()));
            //disbursing the loan
            double fundAvailable = bankFund.debitFund(loanAmount);
            //displaying the success message
            System.out.println(customerId+" The loan is disbursed. Please collect the cash from the Teller");
            System.out.println("Fund left in the bank "+fundAvailable);

        }
        catch (InsufficientFundException | InterruptedException insufficientBalanceException){
            //displaying error message
            System.out.println("Sorry!! "+customerId+" Please try some days later as we are short of funds");
        }
    }


    @Override
    public void run() {
        System.out.println("Running Thread: "+Thread.currentThread().getName());
        startTH();
    }
}