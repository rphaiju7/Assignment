package Java_Advanced_Lab.Day2.Assignment29;

public class Customer {
    private int customerId;
    private  String customerName;
    private String customerAddress;
    private int pinCode;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
}
class WellsBank{
    public static void main(String[] args) {
        Customer john = new Customer();
        john.setCustomerId(101);
        john.setCustomerName("Manish Maharjan");
        john.setPinCode(7777);
        john.setCustomerAddress("Bhaktapur");
        System.out.println(john.getCustomerId()+" "+john.getCustomerName()+" "+
                john.getPinCode()+" "+john.getCustomerAddress());

    }
}