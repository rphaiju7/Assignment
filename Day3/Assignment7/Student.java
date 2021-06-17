package Day3.Assignment7;

public class Student {
    private int studentId;
    private String studentName;
    private String residentialStatus;
    private long feesPerMonth;

    public Student() {
    }


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String firstName, String lastName) {
        this.studentName = firstName + " " + lastName;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }

    public void setFeesPerMonth(long feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }

    public String getStudentName() {
        return studentName;
    }


    public int getStudentId() {
        return studentId;
    }

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public long getFeesPerMonth() {
        return feesPerMonth;
    }

}
