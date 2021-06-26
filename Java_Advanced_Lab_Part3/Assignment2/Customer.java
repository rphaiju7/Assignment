package Java_Advanced_Lab_Part3.Assignment2;


import java.io.Serializable;

public class Customer implements Serializable {
    private int customerId;
    private String customerName;
    /**
     * <h3>Description :</h3>This overloaded constructor is used to
     * initialize the Customer object
     * * @param customerId The customer Id of the customer
     * * @param customerName The name of the customer
     * * @param loanAvailed The status of the customer if he has
     * * availed the loan
     * */
    public Customer(){}
    public Customer(int customerId, String customerName){
        this.customerId=customerId;
        this.customerName=customerName;
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

}