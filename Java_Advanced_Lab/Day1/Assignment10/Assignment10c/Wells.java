package Java_Advanced_Lab.Day1.Assignment10.Assignment10c;

public class Wells {
    public static void main(String[] args) {
       // EmployeeGrade employ1 = new EmployeeGrade();
        EmployeeGrade employ2 = new EmployeeGrade(101, "Manish",4.1f, 4.0f, 4.3f);
        /* employ1.calculateAverageFeedback();
        employ1.calculateGrade();
        employ1.displayInfo(); */

        employ2.calculateAverageFeedback();
        employ2.calculateGrade();
        employ2.displayInfo();
    }
}