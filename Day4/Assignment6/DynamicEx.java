package Day4.Assignment6;

public class DynamicEx {
    public static void main(String[] args) {
        Student dayScholar = new DayScholar();
        dayScholar.setStudentID(1001);
        dayScholar.setStudentType('D');
        dayScholar.setStudentName("Thomas");
        ((DayScholar)dayScholar).setResidentialAddress("No 32/3 Vijaynagar");
        dayScholar.getDetails();
    }
}