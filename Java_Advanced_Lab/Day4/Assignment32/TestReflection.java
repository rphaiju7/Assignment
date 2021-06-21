package Java_Advanced_Lab.Day4.Assignment32;

import java.lang.reflect.*;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        try{
            Class classObj = Class.forName("Java_Advanced_Lab.Day4.Assignment32.Employee");
            System.out.println(classObj.getName());
            System.out.println(Modifier.toString(classObj.getModifiers()));
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}