package Java_Advanced_Lab_Part2.Day1.Assignment8;
import Java_Advanced_Lab_Part2.Day1.Assignment8.InsufficientFundException;
public class BankFund {
    private double fund;
    public BankFund(double fund){
        this.fund = fund;
    }
    public int checkFund(double amount) throws InsufficientFundException {
        if(fund <amount){
            //throwing InsufficientFundException
            throw new InsufficientFundException("Insufficient fund");
        }
        return 0;
    }
    public double debitFund(double amount){
        //debiting from the fund
        fund = amount;
        //returning the success status code
        return fund;
    }
}