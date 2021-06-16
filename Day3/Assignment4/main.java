public class main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(30);
        student.setStudentType('M');
        student.setStudentName("Suresh","Thapa");
        System.out.print(student.getStudentId()+" ");
        System.out.print(student.getStudentType()+" ");
        System.out.println(student.getStudentName());
        Student student1 = new Student(21,'F',"Dhairya","Shres");
        System.out.print(student1.getStudentId()+" ");
        System.out.print(student1.getStudentType()+" ");
        System.out.println(student1.getStudentName());    }
}
