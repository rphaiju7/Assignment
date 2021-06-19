package Java_Advanced_Lab.Day1.Assignment11;

public class Wells {
    public static void main(String[] args) {
        EmployeeGrade[] employ = new EmployeeGrade[3];
       for(int i = 0;i< employ.length;i++){
          employ[i]= new EmployeeGrade(101, "Manish",4.1f, 4.0f, 4.3f);

           employ[i].calculateAverageFeedback();
           employ[i].calculateGrade();
           employ[i].displayInfo();
    }
    }
}