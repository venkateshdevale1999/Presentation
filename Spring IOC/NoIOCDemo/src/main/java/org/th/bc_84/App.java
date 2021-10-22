package org.th.bc_84;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
            // using setter method
//        Address address = new Address();
//        address.setDoorNo("17");
//        address.setStreet("Mahanadi street");
//        address.setCity("Ballari");
//        address.setState("karnataka");
//        address.setPin("583101");
        //using constructor
        Address address = new Address("10","street","ballari","karanataka","583101");

//        Customer cust = new Customer();
//        cust.setCustId(100);
//        cust.setCustName("venky");
//        cust.setAddress(address);
        Customer cust = new Customer(100,"venky",address);

        System.out.println(cust);


    }
}
