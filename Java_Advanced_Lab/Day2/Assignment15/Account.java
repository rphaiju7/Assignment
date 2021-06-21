package Java_Advanced_Lab.Day2.Assignment15;

public class Account  {
    private int accountNo;
    private Customer customer;
    double balance;
    public Account(){}


    public Account(int accountNo, Customer customer, double balance){
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance=balance;

    }

    public Customer getCustomer() {
        return customer;
    }
    public double balanceEnquiry(){
        return balance;
    }
    public void deposit(double amount){
        balance = balance+amount;
        System.out.println("Available Balance: "+balance);
    }
}