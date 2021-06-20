package Java_Advanced_Lab.Day2.Assignment22;

import java.util.Vector;

public class Employee {
    public static void main(String[] args) {
        Vector emptylist = new Vector();
        int empNo= 1000;
        for (int count = 0; count < 5; count++) {
            empNo++;
            emptylist.add((empNo));
        }
        System.out.println(emptylist);
    }
}