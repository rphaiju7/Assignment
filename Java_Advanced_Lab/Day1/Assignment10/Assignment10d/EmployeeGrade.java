package Java_Advanced_Lab.Day1.Assignment10.Assignment10d;

public class EmployeeGrade {
    private int employeeNo;
    private String employeeName;
    private float customer1Feedback;
    private float customer2Feedback;
    private float customer3Feedback;
    private float averageFeedback;
    private char grade;

     public EmployeeGrade(){
     }

    public EmployeeGrade(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback){
        this.employeeNo = employeeNo;
        this.employeeName = employeeName;
        this.customer1Feedback = customer1Feedback;
        this.customer2Feedback = customer2Feedback;
        this.customer3Feedback = customer3Feedback;
    }

    public void calculateAverageFeedback(){

        this.averageFeedback = (customer1Feedback+customer3Feedback+customer2Feedback)/3.0f;
    }

    public void calculateGrade(){
        if(averageFeedback >= 4.5f){
            this.grade = 'A';
        }
        else if(averageFeedback >=4f && averageFeedback<4.5f){
            this.grade = 'B';
        }
        else if(averageFeedback >=3.5f && averageFeedback<4f){
            this.grade = 'C';
        }
        else if(averageFeedback >= 3f && averageFeedback<3.5f){
            this.grade = 'D';
        }
        else if(averageFeedback>=2f && averageFeedback<3f){
            this.grade = 'E';
        }
        else if(averageFeedback<2f){
            this.grade = 'F';
        }
    }

    public void displayInfo(){
        System.out.println("Employee no. : "+employeeNo+", Name :"+employeeName+", Average feedback: "+averageFeedback+", Grade: "+grade);
    }
}

