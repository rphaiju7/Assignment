public class Student {
    private int studentId;
    private char studentType;
    private String studentName;
    public Student(){
    studentId =21;
    studentType='M';
    }
    public Student(int id, char type,String firstName, String lastName){
        this.studentId = id;
        this.studentType = type;
        this.studentName = firstName+" "+lastName;
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

    public void setStudentName(String firstName, String lastName) {
        this.studentName = firstName+" "+lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
