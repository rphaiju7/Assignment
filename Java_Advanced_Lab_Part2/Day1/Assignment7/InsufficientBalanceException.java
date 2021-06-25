package Java_Advanced_Lab_Part2.Day1.Assignment7;

public class InsufficientBalanceException  extends Exception{
    public InsufficientBalanceException(){
        super("Insufficient Balance in the Account");
    }
}