package Java_Advanced_Lab_Part3.Assignment2;

import java.io.Serializable;

public class SavingsAccount extends Account implements Serializable {
    //the interest rates for saving account
    private float rateOfInterest;
    //The minimum balance that has to be maintained in the account
    private double minimumBalance;
    /*
     *Description : Parameterized constructor to initialize objects
     * @param account no
     */
    public SavingsAccount(int accountNo, Customer customer, double balance
            , float rateOfInterest, double minimumBalance){
        //calling the parent's constructor
        super(accountNo,customer,balance);
        //initializing the instance members
        this.rateOfInterest = rateOfInterest;
        this.minimumBalance = minimumBalance;
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
}