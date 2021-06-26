package Java_Advanced_Lab_Part3.Assignment1;

public class CustomerTester {
    public void acceptCustomerInfo(){
        //displaying menu in console
        System.out.println("\n\n\tPlease enter the details of the customer");
        //accepting the customer id
        System.out.println("Customer Id: ");
        String custId = ReadData.acceptString();
        //accepting the customer name
        System.out.println("Customer name: ");
        String custName= ReadData.acceptString();
        //populating the customer bean
        Customer customer = new Customer();
        customer.setCustomerId(Integer.parseInt(custId));
        customer.setCustomerName(custName);
        //saving the data in file through DB class
        int status = new CustomerFileDB().saveCustomer(customer);
        if (status==0){
            //displaying the success message
            System.out.println("Your details are saved");
            ReadData.acceptString();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");

        }
        else {
            //displaying the error message
            System.out.println("Your details could not be saved. Please try again later");
            ReadData.acceptString();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");

        }
    }
    public void displayInfo(){
        //Accepting the custoemr ID
        System.out.println("\n\nPlease enter customer Id");
        String custID = ReadData.acceptString();
        Customer customer = new CustomerFileDB().getCustomer(Integer.parseInt(custID));
        if (customer!=null){
            //displaying the details
            System.out.println("\nCustomer Id: "+customer.getCustomerId());
            System.out.println("Customer name: "+customer.getCustomerName());

        }
        else {
            //displaying the error message if customer id is invalid
            System.out.println("Invalid customer Id!");
            ReadData.acceptString();
            System.out.println("\n\n\n\n\n\n\n\n\n\n");

        }
    }
    //Method to display the customer menu
    public void customerMenu(){
        while (true){
            //Displaying the menu
            System.out.println("\tCustomer Menu");
            System.out.println("--------------------------------------");
            System.out.println("1. Add customer");
            System.out.println("2. Get customer Info");
            System.out.println("3. Exit");
            System.out.print("\nEnter option :");
            String optedValue=ReadData.acceptString();
            int option=Integer.parseInt(optedValue);
            //calling the appropriate method for the entered option

            switch(option){
                case 1: acceptCustomerInfo(); break;
                case 2: displayInfo();break;
                case 3: System.exit(0);break;
                default :System.out.println("Enter a valid option");
                    ReadData.acceptString();
            }
        }
    }}