package Day5.Assignment1.courseregistration;

class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void getDetails(){
        System.out.println("Student iD: "+studentId);
        System.out.println("Student Type: "+studentType);
        System.out.println("Student Name: "+studentName);
    }
}
class PackageEx{
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1001);
        student.setStudentType('D');
        student.setStudentName("Thomas");
        student.getDetails();
    }
}