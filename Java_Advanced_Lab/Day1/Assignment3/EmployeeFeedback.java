package Java_Advanced_Lab.Day1.Assignment3;

public class EmployeeFeedback {
    public static void main(String[] args) {
        int[][] employeeInfo = {{1001,4,5},
                                {1002,2,4,5}};

        for(int i  = 0 ; i < employeeInfo.length; i++){
            System.out.print("Employee ID: "+employeeInfo[i][0]+" ");
            for(int j  = 1; j < employeeInfo[i].length; j++){
                System.out.print(employeeInfo[i][j]+" ");
            }
            System.out.println();
        }
    }
}