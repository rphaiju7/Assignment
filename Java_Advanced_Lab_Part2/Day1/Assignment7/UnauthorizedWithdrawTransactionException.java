package Java_Advanced_Lab_Part2.Day1.Assignment7;

public class UnAuthorizedWithdrawTransactionException extends Exception{
    public  UnAuthorizedWithdrawTransactionException(){
        super("The user is not authorized for the withdrawal");
    }
}