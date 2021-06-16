public class Student {
    public static int studentId=550;
    private char studentType;
    private String studentName;
    public Student(){
        studentId ++;

    }
    public Student(char sType, String fname, String lname){
        this();
        this.studentName = fname+" "+lname;
        this.studentType =sType;
    }
    public void displayDetails(Student obj){
        System.out.println(studentId+" "+studentType+" "+studentName);

    }
}