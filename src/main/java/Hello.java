import hr.Salary;

public class Hello
{
    public void checkUserDetails()
    {
        System.out.println("2. Checking details for user");
    }
    public void checkDetails()
    {
        System.out.println("4. Checking the details of the attendees");
    }
    public void displayDetail(){
        System.out.println("3. Thanks for attending the session");
        Hello hello = new Hello();
        hello.checkDetails();
    }
    public static void main(String args[])
    {
        System.out.println("1. Our first program");
        Hello hello = new Hello();
        hello.checkUserDetails();
        hello.displayDetail();
        System.out.println("5. Hello and Welcome to Revature");
        Customer customer = new Customer();
        customer.displayCustomerDetails();
        hr.Salary salary = new Salary();
        salary.calculateSalary();
    }
}




