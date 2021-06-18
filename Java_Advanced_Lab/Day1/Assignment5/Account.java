package Java_Advanced_Lab.Day1.Assignment5;

public class Account {
    String name;
    int initBal;
    int accNum;
    private String email;
    private String accType;
    private String dateOfBirth;
    private char gender;
    private String maritalStatus;

    public Account() {
        initBal = 0;
    }

    public Account(String fname, String mname, String lname, String email,
                   String accType, String dateOfBirth, char gender, String maritalStatus, int accNum) {
        super();
        this.accType = accType;
        this.name = fname + " " + mname + " " + lname;
        this.email = email;
        this.accType = accType;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.accNum = accNum;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void displayDetails() {
        System.out.println("Account number: " + accNum);
        System.out.println("Customer name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Martial status: " + maritalStatus);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Gender: " + gender);
        System.out.println("Includes ATM: " + atmIncluded());
        System.out.println("Multi city check book: " + isMultiCityCheckAvailable());
    }

    boolean isMultiCityCheckAvailable() {
        return false;
    }

    boolean atmIncluded() {
        return true;
    }

}

class Salary extends Account {
    Salary() {
        super();
    }

    Salary(String fname, String mname, String lname, String email,
           String accType, String dateOfBirth, char gender, String maritalStatus, int accNum) {
        super(fname, mname, lname, email, accType, dateOfBirth, gender, maritalStatus, accNum);
        this.accNum = accNum;
    }

    boolean discountOnShopping() {
        return false;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Account type: " + this.getAccType());
        System.out.println("Beginning balance: " + this.initBal);
        System.out.println("Discount on shopping: " + discountOnShopping());


    }
}

class nonSalary extends Account {
    public int initBal = 10000;
    private int accNum;

    nonSalary() {
    }

    nonSalary(String fname, String mname, String lname, String email,
              String accType, String dateOfBirth, char gender, String maritalStatus, int accNum) {
        super(fname, mname, lname, email, accType, dateOfBirth, gender, maritalStatus, accNum);
        this.accNum = accNum;
    }

    boolean discountOnShopping() {
        return true;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Account type: " + getAccType());
        System.out.println("Beginning balance: " + initBal);
        System.out.println("Discount on shopping: " + discountOnShopping());

    }
}

class Main {
    public static void main(String[] args) {
        Account account = new Account("Suresh", "Thapa", "Maharjan", "abc@def.com", "Salary",
                "12-02-1990", 'M', "Married", 10014577);

        if (account.getAccType().equalsIgnoreCase("Salary")) {
            Salary salary = new Salary("Suresh", "Thapa", "Maharjan", "abc@def.com", "Salary",
                    "12-02-1990", 'M', "Married", 10014577);
            salary.setAccType("Salary");
            salary.displayDetails();
        } else {
            nonSalary nonSalary = new nonSalary("Suresh", "Thapa", "Maharjan", "abc@def.com", "Salary",
                    "12-02-1990", 'M', "Married", 10014577);
            nonSalary.setAccType("Non-Salary");
            nonSalary.displayDetails();
        }

    }
}