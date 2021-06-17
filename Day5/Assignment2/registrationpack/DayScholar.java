package Day5.Assignment2.registrationpack;

import Day5.Assignment2.studentpack.Student;

class DayScholar extends Student {
    private String residentialAddress;
    public void setResidentialAddress(String address){
        this.residentialAddress=address;
    }
    public void getDetails(){
        System.out.println("Student ID: "+studentID);
        System.out.println("Student type: "+studentType);
        System.out.println("Student name: "+studentName);
    }
}

class Registration{
    public static void main(String[] args) {
        DayScholar dayScholar = new DayScholar();
        dayScholar.setStudentID(1001);
        dayScholar.setStudentType('A');
        dayScholar.setStudentName("Dinil");
        dayScholar.getDetails();
    }
}