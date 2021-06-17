package Day3.Assignment7;

public class Main{
   public static void main(String[] args) {
    Student student = new Student();
    student.setStudentId(Integer.parseInt(args[0]));
    student.setStudentName(args[1],args[2]);
    student.setResidentialStatus(args[3]);
    student.setFeesPerMonth(Integer.parseInt(args[4]));
    System.out.println("Student Id: "+student.getStudentId());
    System.out.println("Student Name: "+student.getStudentName());
    System.out.println("Student residential status: "+student.getResidentialStatus());
    System.out.println("Student fees: "+student.getFeesPerMonth());

}
}
