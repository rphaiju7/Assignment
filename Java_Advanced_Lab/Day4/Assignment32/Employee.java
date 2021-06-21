package Java_Advanced_Lab.Day4.Assignment32;

import java.util.Vector;
public class Employee {
    public static void main(String[] args) {
        Vector emplist = new Vector();
        int empNo= 1000;
        for (int count = 0; count < 5; count++) {
            empNo++;
            emplist.add((empNo));
        }
        System.out.println(emplist);
    }
}