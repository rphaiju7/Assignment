//Day 2 Assignment 3
public class SwitchCase {
    public static void main(String[] args) {
        char grade = 'A';
        int marks;
        //incomplete
        switch (grade) {
            case 'A':
                System.out.println("Range of marks is 80-100");
                break;
            case 'B':
                System.out.println("Range of marks is 73-79");
                break;
            case 'C':
                System.out.println("Range of marks  is 65-72");
                break;
            case 'D':
                System.out.println("Range of marks is 55-64");
                break;
            case 'E':
                System.out.println("Range of marks is 0-55");
                break;
            default :
                System.out.println("Grade does not exist");
                break;
        }
    }
}