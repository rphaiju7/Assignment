package Day4.Assignment3;

public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;

    public Hostelite(){
        super();
    }

    public Hostelite(int id, char type, String fname, String lname, double fees, String hostelName, int roomNumber){
        super(id,type,fname,lname);
        this.feesPerMonth = fees;
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public String getHostelName(){
        return hostelName;
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public void displayStudentDetails(){
        super.displayStudentDetails();
        System.out.print(" Room number: "+roomNumber);
    }
}