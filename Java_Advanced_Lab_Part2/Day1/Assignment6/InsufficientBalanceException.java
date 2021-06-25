package Java_Advanced_Lab_Part2.Day1.Assignment6;


public class InsufficientBalanceException  extends Exception{
    public InsufficientBalanceException(){
        super("Insufficient Balance in the Account");
    }
}