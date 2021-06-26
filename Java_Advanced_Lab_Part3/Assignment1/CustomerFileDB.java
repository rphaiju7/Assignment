package Java_Advanced_Lab_Part3.Assignment1;

import java.io.*;

public class CustomerFileDB {
    String file= "customer.dat";
    public int saveCustomer(Customer customer){
        //creating status for return
        int status = -1;
        //creating reference for readers amd writers
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            //creating the data string to be saved
            String data = customer.getCustomerId() + ": " + customer.getCustomerName() + "\n";
            //writing the data to the file
            bufferedWriter.write(data);
            //flushing the buffered writer
            bufferedWriter.flush();
            status = 0;
        }
        catch (IOException ioException){
            status = 2;
            ioException.printStackTrace();}
        finally {
            //closing the writers
            if(null!= bufferedWriter){
                try{
                    bufferedWriter.close();
                }
                catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }
            if (null!=fileWriter){
                try{
                    fileWriter.close();
                }
                catch (IOException ioException){
                    ioException.printStackTrace();
                }
            }
        }
        //returning the status
        return status;
    }

    public Customer getCustomer(int cusomerId){
        Customer customer = null;
        //creating reference for readers and writers
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader =  new BufferedReader(fileReader);
            String []data=null;
            //reading the data from the file
            String input = bufferedReader.readLine();
            while (input!=null){
                //spilitting the data according to the delimiter
                data = input.split(":");
                if(Integer.parseInt(data[0])==cusomerId){
                    // if the customer id's are equal then populate the bean
                    customer = new Customer();
                    customer.setCustomerId(Integer.parseInt(data[0]));
                    customer.setCustomerName(data[1]);
                    break;
                }
                //reading the data from the file
                input = bufferedReader.readLine();
            }
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
        finally {
            //Close the reader
            if(null!=bufferedReader){
                try {
                    bufferedReader.close();
                } catch (IOException ioException)
                { ioException.printStackTrace();
                }
            }
            if(null!=fileReader){
                try {
                    fileReader.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        }
//returning the customer bean
        return customer;
    }
}