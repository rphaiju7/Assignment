public class Hostelite extends Student{
    private String hostelName;
    private int roomNumber;

    public Hostelite(){

    }
    public Hostelite(int id, char type, String studentName,double feesPerMonth,
                     String hostelName, int roomNumber){
        studentId = id;
        studentType = type;
        this.studentName =studentName;
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
        this.feesPerMonth = feesPerMonth;
    }
    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

}