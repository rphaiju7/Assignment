//Day 2 Assignment 6
public class UserType {
    String name;

    UserType(String parameterVal)
     {
        name = parameterVal;

    }

    UserType() 
    {
        this("student");
    }

    public static void main(String[] args) {
        UserType userType1 = new UserType("Faculty");
        UserType userType2 = new UserType();

        System.out.println(userType1.name);
        System.out.println(userType2.name);
    }
}