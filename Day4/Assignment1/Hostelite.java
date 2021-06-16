public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;

    public Hostelite(){
    super();
    }
    public Hostelite(int studentId, char tStudentType, String firstName, String lastName,
                     double feesPerMonth, String hostelName, int roomNumber){
        super(studentId,tStudentType,firstName,lastName,feesPerMonth);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
        }
    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

}