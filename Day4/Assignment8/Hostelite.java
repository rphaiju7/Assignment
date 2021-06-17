package Day4.Assignment8;

public class Hostelite extends Student {
    private String hostelName;
    private int roomNumber;


    public Hostelite(){
        super();
    }

    public Hostelite(int id, char type, String fname, String lname, double fees, String hostelName, int roomNumber){
        super(id,type,fname,lname);
        calculateFees(fees);
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
        System.out.print(", Hostel name: "+hostelName);
        System.out.print(", Room number: "+roomNumber);
    }

    public void calculateFees(double semesterFees){
        super.feesPerMonth = semesterFees/6.0;
        //Add hostel fees Rs. 1200
        super.feesPerMonth = super.feesPerMonth+1200;
    }
}