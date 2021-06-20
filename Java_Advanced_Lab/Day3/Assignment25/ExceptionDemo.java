package Java_Advanced_Lab.Day2.Assignment25;

public class ExceptionDemo {
    static {
        System.out.println("In the static block of Exception....");
    }
}
class checkExceptionDemo{
    public static void main(String[] args) {
        try{
            Class.forName("com.exception.ExceptionDemo");
        }catch (ClassNotFoundException exception){
            System.out.println("Exception: "+exception);
        }
    }
}