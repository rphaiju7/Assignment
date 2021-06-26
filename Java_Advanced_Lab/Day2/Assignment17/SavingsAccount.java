package Java_Advanced_Lab.Day2.Assignment17;

public class SavingsAccount extends Account {
    private double minimumBalance;
    private int interestRate;

    public SavingsAccount() {
        minimumBalance = 500;
        interestRate = 12;
    }

    public SavingsAccount(int accountNo, Customer customer, double balance) {
        super(accountNo, customer, balance);
    }
    public void withdraw(double amount) {
        if (balance > 500) {
            this.balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else
            System.out.println("Insufficient Balance: to withdraw " + balance);
    }
    public void calculateInterest(){
        int intrest;
        intrest = (int) ((balance*12)/100);
        System.out.println("The interest is: "+intrest);
    }
}