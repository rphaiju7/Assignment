//Day 3 Assignment 5
import java.util.*;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String a = input.nextLine();
        System.out.println(a.length());
        System.out.println("Hi " + a);
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.startsWith("a"));
        System.out.println(a.replace(a, "KRISHNA"));
    }
    
}
