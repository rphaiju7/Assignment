package Java_Advanced_Lab.Day1.Assignment10.Assignment10a;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade employ = new EmployeeGrade(101, "Manish",4.1f, 4.0f, 4.3f);
       employ.calculateAverageFeedback();
       employ.calculateGrade();
       employ.displayInfo();
    }
}