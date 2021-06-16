public class Student {
    private int studentId;
    private String studentName;
    private char studentType;
    private String residentialStatus;
    private double feesPerMonth;

    public Student() {
    }

    public Student(int id, char type, String firstName, String lastName) {
        studentId = id;
        studentName = firstName + " " + lastName;
        studentType = type;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String firstName, String lastName) {
        this.studentName = firstName + " " + lastName;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public String getStudentName() {
        return studentName;
    }


    public int getStudentId() {
        return studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public double getFeesPerMonth() {

        return feesPerMonth;
    }

    public void calculateFees(double semesterFees) {
        feesPerMonth = semesterFees / 6.0;
    }

    public void calculateFees(double semesterFees, double hostelFees) {
        feesPerMonth = semesterFees / 6.0;
        feesPerMonth = feesPerMonth + hostelFees;
    }

}
