package org.th.b84;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context =new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
        Customer customer = (Customer)context.getBean("customer");
        customer.setCustId(100);
        customer.setCustName("venky");

        Address address =(Address)customer.getAddress();
        address.setDoorNo("10");
        address.setStreet("abc");
        address.setCity("ballari");
        address.setState("karnataka");
        address.setPin("12345");

        Accounts account = (Accounts)customer.getAccount();
        account.setAccId("1234");
        account.setAcctype("abcd");


        System.out.println(customer);

        ClassPathXmlApplicationContext cpc = (ClassPathXmlApplicationContext) context;
        cpc.close();
    }
}
