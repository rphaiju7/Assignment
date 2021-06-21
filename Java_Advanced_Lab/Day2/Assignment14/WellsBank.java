package Java_Advanced_Lab.Day2.Assignment14;

public class WellsBank {
    public static void main(String[] args) {
        Customer customer1 = new Customer(100, "customer1", "Bhaktapur", 7777);
        SavingAccount customer2 = new SavingAccount(101, customer1, 1567);
        customer2.deposit(1000);
        customer2.withdraw(1200);
        System.out.println("Remaining Balance is: " + customer2.balanceEnquiry());
        System.out.println("Customer3 Overdraft account");
        Customer customer3 = new Customer(101, "customer3", "Austin", 5567);
        CurrentAccount customer4 = new CurrentAccount(102, customer3,
                700, 1850);
        customer4.deposit(1000);
        customer4.withdraw(2000);
        customer4.withdraw(3000);
        customer4.withdraw(4000);


    }
}