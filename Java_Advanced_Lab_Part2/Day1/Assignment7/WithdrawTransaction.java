package Java_Advanced_Lab_Part2.Day1.Assignment7;

public class WithdrawTransaction extends Security implements Runnable{
    private int transactionId;
    private Account account;
    private Customer customer;
    private double amount;
    /**
     * <h3>Description :</h3> The parameterized constructor is used
     * to initialize the object
     * @param transactionId the transaction id of the transaction
     * @param account the account on which the transaction is done
     * @param customer the customer who is doing the transaction
     * @param amount the amount of withdrawal
     */
    public WithdrawTransaction(int transactionId, Account account,
                               Customer customer, double amount){
        this.transactionId = transactionId;
        this.account =account;
        this.customer = customer;
        this.amount = amount;

    }
    public synchronized double withdraw(Account account, double amount) throws InsufficientBalanceException {
        //checking if the account has sufficient balance
        if(account.getBalance()>=amount){
            account.setBalance(account.getBalance()-amount);
        }else{
            throw  new InsufficientBalanceException();
        }
        return account.getBalance();
    }
    @Override
    public void run() {
        try{
            //checking if the customer is authorized to withdraw
            //from the given account

            authorization(account, customer);
            // withdraw the money after authorization
            double balance = withdraw(account,amount);
            //display the success message

            System.out.println(transactionId+" transaction"+
                    "completed!!! and the balance amount is "
                    +balance);

        }catch(UnAuthorizedWithdrawTransactionException
                unAuthorizedWithdrawTransactionException){
//displaying an appropriate message if the customer is
//not authorized to do the transaction
            System.out.println(transactionId+" transaction "+
                    "failed!!! and "+
                    unAuthorizedWithdrawTransactionException.getMessage());
        }catch(InsufficientBalanceException

                insufficientBalanceException){

//display the error message for insufficient balance
            System.out.println(transactionId+ "transaction failed!!!" +
                    " and your account has insufficient balance ");

        }
    }
}
