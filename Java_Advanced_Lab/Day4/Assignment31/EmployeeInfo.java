package Java_Advanced_Lab.Day2.Assignment31;

import java.util.ArrayList;

public class EmployeeInfo {
    public static void main(String[] args) {
        ArrayList<Integer>employeeId = new ArrayList<Integer>();
        employeeId.add(1001);
        employeeId.add(1002);
        employeeId.add(1003);
        for (int count = 0; count < employeeId.size(); count++) {
            int val = employeeId.get(count);
            System.out.println(val);

        }

    }
}