public class Student {
    private int studentId;
    private char studentType;
    private String studentName;
    private double feesPerMonth;
    public Student(){
        this.studentId =29;
    }
    public Student(int id, char type, String firstName, String lastName, double feesPerMonth){
       studentId = id;
       studentType= type;
       studentName = firstName+" "+lastName;
       this.feesPerMonth = feesPerMonth;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String fName, String lName) {
        this.studentName = fName+" "+lName;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }

    public void setFeesPerMonth(double feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }
}