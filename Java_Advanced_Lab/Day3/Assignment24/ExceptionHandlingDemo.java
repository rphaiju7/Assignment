package Java_Advanced_Lab.Day2.Assignment24;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        String name="john";
        int total =100, count =0;
        try {
            int average = total/count;
            System.out.println(average);
            System.out.println(name.length());
            System.out.println("End of try block");
        }
        catch (ArithmeticException exception){
            System.out.println("Arithmetic Exception "+exception.getMessage());
        }
        catch (NullPointerException exception){
            System.out.println("Object is null");
        }
        finally {
            System.out.println("within finally block");
        }
        System.out.println("Continuing the execution..");

    }
}