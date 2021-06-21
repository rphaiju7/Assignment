package Java_Advanced_Lab.Day2.Assignment15;

public class SavingAccount extends Account {
    private double minimumBalance;
    private int interestRate;

    public SavingAccount() {
        minimumBalance = 500;
        interestRate = 12;
    }

    public SavingAccount(int accountNo, Customer customer, double balance) {
        super(accountNo, customer, balance);
    }
    public void withdraw(double amount) {
        if (balance > 500) {
            this.balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else{
            System.out.println("Insufficient Balance: to withdraw " + balance);}
        System.out.println("Remaining Balance  is: "+balance);
    }
    public void calculateInterest(){
        int interest;
        interest = (int) ((balance*12)/100);
        System.out.println("The interest is: "+interest);
    }
}