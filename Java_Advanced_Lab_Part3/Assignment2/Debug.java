package Java_Advanced_Lab_Part3.Assignment2;

import java.io.*;

public class Debug {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //creating a customer object
        Customer customer = new Customer(1001, "Tan");
        //creating a savingAccount object
        SavingsAccount savingsAccount = new SavingsAccount(9001,
                customer,
                2000, 5, 1000);
        //serializing the above object
        try {
            String fileName = "data.ser";
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(savingsAccount);
            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Data serialized to file: "+fileName);
        } catch (IOException i) {
            i.printStackTrace();
            System.out.println("Error!");
        }
        //deserializing the Savings Account object
        FileInputStream fileInput=new FileInputStream("data.ser");
        // BufferedInputStream bufferedStream=new BufferedInputStream(fileInput);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInput);
        SavingsAccount de = (SavingsAccount) objectInputStream.readObject();
        System.out.println("Deserialization info: from a file data.ser");
        System.out.println("Customer Id: "+de.getAccountNo());
        System.out.println("Account no: "+de.getAccountNo());
        System.out.println("Rate of interest: "+de.getRateOfInterest());
        System.out.println("Minimum Balance: "+de.getMinimumBalance());
    }
}