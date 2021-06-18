package Day3.Assignment1;

public class Student {

    private static int studentCount;
    private int studentId;
    private char studentType;
    private String studentName;

    static{
        studentCount = 10;
    }

    
    public Student(){
        this.studentCount++;
        this.studentId = this.studentCount;
    }

    
    public Student(char sType, String fname, String lname){
        this();
        this.studentName = fname+" "+lname;
        this.studentType = sType;
    }

    public void displayDetails(Student student){
        System.out.println("Student ID: "+student.studentId+", Name: "+student.studentName+", Student type: "+student.studentType);
    }

    public static int getStudentCount(){
        return studentCount;
    }

  
    public static void main(String[] args) {
        Student studentOne  = new Student('A',"Suresh","Thapa");
        studentOne.displayDetails(studentOne);
        Student studentTwo = new Student('B',"Manish","Maharjan");
        studentTwo.displayDetails(studentTwo);
    }
}