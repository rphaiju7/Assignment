public class main {
    public static void main(String[] args) {
        Hostelite student = new Hostelite(29,'M',"Suresh","Thapa",
                5000,"Shres",3136);
        System.out.print(student.getStudentId()+" ");
        System.out.print(student.getStudentType()+" ");
        System.out.print(student.getStudentName()+" ");
        System.out.print(student.getFeesPerMonth()+" ");
        System.out.print(student.getHostelName()+" ");
        System.out.print(student.getRoomNumber()+" ");



    }
}