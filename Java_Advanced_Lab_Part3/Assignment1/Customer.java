package Java_Advanced_Lab_Part3.Assignment1;

import java.security.PublicKey;

public class Customer {
    private int customerId;
    private String customerName;
    private boolean loanAvailed;
    /**
     * <h3>Description :</h3>This overloaded constructor is used to
     * initialize the Customer object
     * * @param customerId The customer Id of the customer
     * * @param customerName The name of the customer
     * * @param loanAvailed The status of the customer if he has
     * * availed the loan
     * */
    public Customer(){}
    public Customer(int customerId, String customerName, boolean
            loanAvailed){
        this.customerId=customerId;
        this.customerName=customerName;
        this.loanAvailed=loanAvailed;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isLoanAvailed() {
        return loanAvailed;
    }

    public void setLoanAvailed(boolean loanAvailed) {
        this.loanAvailed = loanAvailed;
    }
}