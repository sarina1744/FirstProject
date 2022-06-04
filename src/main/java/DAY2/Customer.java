package DAY2;

public class Customer {
    String customerName="Ananda";

    public Customer()
    {
        System.out.println("Customer cons called");
        customerName="Daniel";
    }
    public void changeName(){
        customerName="Andrew";
    }
    public static void main(String args[]){
        Customer cust1 = new Customer();
        cust1.changeName();
        System.out.println(cust1.customerName);
        Customer cust2 = new Customer();
        System.out.println(cust2.customerName);
    }
}




