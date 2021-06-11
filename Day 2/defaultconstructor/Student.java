//Day 2 Assignment 5

public class Student {
    private int studentId;
    private char studentType;
    public Student(){
        studentId = 10;
        studentType='F';
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public int getStudentId() {
        return studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public static void main(String[] args) {
        Student Student = new Student();
        System.out.println("Student Id is: "+Student.getStudentId()+" and the type is: "+Student.getStudentType());
        Student.setStudentId(25);
        Student.setStudentType('M');
        System.out.println("Student Id is: "+Student.getStudentId()+" and the type is: "+Student.getStudentType());


    }
}
    

