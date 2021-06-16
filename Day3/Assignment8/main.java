public class main {
    public static void main(String[] args) {
        Student student = new Student(29, 'M', "Suresh", "Thapa");
        student.setResidentialStatus("Day Scholar");
        if (student.getResidentialStatus() == "DayScholar") {
            student.calculateFees(5000);
        } else {
            student.calculateFees(10000, 5000);
        }
        System.out.println(student.getStudentType());
        System.out.println(student.getStudentId() + " " + student.getStudentType() + " "
                + student.getResidentialStatus() + " " + student.getStudentName() +
                " " + student.getFeesPerMonth() + " ");
    }

}
