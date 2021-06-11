//Day 2 Assignment 4
public class CourseManagement {
    public static void main(String[] args) {
        Student st = new Student();
        st.setStudentId(25);
        st.setStudentType('M');

        System.out.println("Student ID is " + st.getStudentId());
        System.out.println("Student type is: " + st.getStudentType());
    }
}