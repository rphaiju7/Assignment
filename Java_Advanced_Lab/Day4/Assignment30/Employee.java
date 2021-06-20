package Java_Advanced_Lab.Day2.Assignment30;

import java.util.*;

public class Employee {
    int employeeId;
    String employeeName;
    String dateOfBirth;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String toString(){
        return employeeName +" " + employeeId+" "+ dateOfBirth;
    }

}
class EmployeeInfo{
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        employee1.employeeId =7777;
        employee1.employeeName= "Manish";
        employee1.setDateOfBirth("1989-12-06");
        employee2.employeeId =7778;
        employee2.employeeName= "Suresh";
        employee2.setDateOfBirth("1992-10-28");
        employee3.employeeId =7779;
        employee3.employeeName= "Shi";
        employee3.setDateOfBirth("1973-09-14");
        employee4.employeeId =7780;
        employee4.employeeName= "Brandon";
        employee4.setDateOfBirth("1984-05-09");
        List list=new ArrayList();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3); list.add(employee4);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj.toString());
        }
    }

}