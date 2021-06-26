package Java_Advanced_Lab.Day2.Assignment16;

public class WellsBank {
    public static void main(String[] args) {
        // To-do: Create an instance (john) for Customer class. Call the overloaded constructor
        // To-do: call transaction(johnSA,1000) of WellsBank
        // To-do: call the method to withdraw Rs.1600.
        // To-do: display the balance available.
        // To-do: Create an instance (jenny) for Customer class. Call the overloaded constructor// To-do: call transaction(jennyOA,1500) of WellsBank
        // To-do: display the balance available in account no 201 Note: available balance for Current Account is balance+ Allowed negative amount
        // To-do: call the method to withdraw Rs. 1000 to A/c No 201
        // To-do: display the balance available of 201
        // To-do: call the method to withdraw Rs. 4000 to A/c No 201
        // To-do: display the balance available of 201
        // To-do: call the method to withdraw Rs. 3000 to A/c No 201
        // To-do: display the balance available of 201
        Customer john = new Customer(100, "John", "Fort Worth", 1221);
        SavingsAccount johnSA = new SavingsAccount(101, john, 1000);
        transction(johnSA, 1000);
        johnSA.withdraw(1600);
        System.out.println("=======================");
        System.out.println("Janny Overdraft account");
        Customer jenny = new Customer(101, "jenny", "Irving", 2323);
        CurrentAccount jennyOA = new CurrentAccount(201, jenny,
                500, 2000);
        transction(jennyOA, 1500);
        jennyOA.withdraw(1000);
        jennyOA.withdraw(4000);
        jennyOA.withdraw(3000);

    }
    /*
    Method to deposit transaction
     */
    public static void transction(Account account, double amount) {
        account.deposit(amount);
    }
}