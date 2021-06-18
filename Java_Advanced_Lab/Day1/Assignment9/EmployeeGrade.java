package Java_Advanced_Lab.Day1.Assignment9;

public class EmployeeGrade {
    private int empolyeeNo;
    private String employeeName;
    private float customer1Feedback;
    private float customer2Feedback;
    private float customer3Feedback;
    private float averageFeedback;
    private char grade;

    public void initilizeEmployee(int empolyeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback) {
        this.empolyeeNo = empolyeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;
        this.customer3Feedback = customer3Feedback;

    }
    //Method overridind
    public void initilizeEmployee(int empolyeeNo, String employeeName, float customer1Feedback, float customer2Feedback) {
        this.empolyeeNo = empolyeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;

    }
    public void calculateAverageFeedback(float customer1Feedback, float customer2Feedback, float customer3Feedback) {
        averageFeedback = (this.customer1Feedback + this.customer2Feedback +this.customer3Feedback) / 3;
    }
    public void calculateAverageFeedback(int customer1Feedback, int customer2Feedback) {
        averageFeedback = (this.customer1Feedback + this.customer2Feedback + this.customer3Feedback) / 2;
    }
    public void calculateGrade() {
        if (averageFeedback >= 4)
            grade = 'A';
        else if (averageFeedback < 4 && averageFeedback >= 3.5)
            grade = 'B';
        else if (averageFeedback < 3.5 && averageFeedback >= 3.0)
            grade = 'C';
        else if (averageFeedback < 3.0 && averageFeedback >= 2.5)
            grade = 'D';
        else
            grade = 'F';
    }

    public void displayInfo() {
        System.out.println("Employee number: " + empolyeeNo);
        System.out.println("Employee name: " + employeeName);
        System.out.println("Employee's average feedback: " + averageFeedback);
        System.out.println("Student grade: " + grade);
    }
}

class wells{
    public static void main(String[] args) {
        EmployeeGrade employeeGrade = new EmployeeGrade();
        employeeGrade.initilizeEmployee(7777,"Manish Maharjan", 4.1f,3.4f,3.8f);
        employeeGrade.calculateAverageFeedback(4.1f,3.4f,3.8f);
        employeeGrade.calculateGrade();
        employeeGrade.displayInfo();
    }
}