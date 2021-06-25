package Java_Advanced_Lab_Part2.Day1.Assignment6;

public class Security {
    public void authorization(Account account, Customer customer) throws UnAuthorizedWithdrawTransactionException{
        /*
          Testing if the customerId of the customer and the
          customerId of the customer to whom the account belongs are the same
         */
        if (account.getCustomer().getCustomerId() != customer.getCustomerId()){
            throw new UnAuthorizedWithdrawTransactionException();
            // Throwing an exception if the customer Id's doesn't match

        }
    }
}