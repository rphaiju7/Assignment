package Java_Advanced_Lab.Day1.Assignment3;

public class EmployeeFeedback {
    public static void main(String[] args) {
        int[][] employeeInfo = {{1001,4,5},{1002,2,4,5}};

        for(int row  = 0 ; row < employeeInfo.length; row++){
            System.out.print("Employee ID: "+employeeInfo[row][0]+", Ratings: ");
            for(int col  = 1; col < employeeInfo[row].length; col++){
                System.out.print(employeeInfo[row][col]+" ");
            }
            System.out.println();
        }
    }
}