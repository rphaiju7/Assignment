package Java_Advanced_Lab_Part3.Assignment1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadData {
    public static String acceptString(){
        //creating the string used to return the input
        String stringData = null;
        //creating a reference for the buffered reader
        BufferedReader input = null;
        try{
            //specifying the input stream
            input = new BufferedReader(new InputStreamReader(System.in));
            //reading data from the console
            stringData = input.readLine();

        }
        catch (IOException ioException){
            //displaying the error message
            System.out.println("Error in accepting data.");

        }
        finally {
            //checking if the reader is closed to close it
            if(input!=null){
                //closing the input
                input = null;

            }
        }
        //returning the read data
        return stringData;
    }

}