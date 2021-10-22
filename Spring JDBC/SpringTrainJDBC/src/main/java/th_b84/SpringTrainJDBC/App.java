package th_b84.SpringTrainJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/th_b84/SpringTrainJDBC/beans.xml");
        
        
        
        
        BookDAO1 b1 = (BookDAO1) context.getBean("bookDAO");
        
        //System.out.println(b1.selectAll());
       
//       
//        Book b2 = new Book();
//        
//       
//        b2.setTrain_no(1111);
//        b2.setTrain_name(" express");
//        b2.setSource_name("ballari");
//        b2.setdestination("mysore");
//        b2.setTicket_price(500);
//        
//        b1.insert(b2);
        
        
        System.out.println(b1.select(1001));
        
        ((AbstractApplicationContext) context).close();
        
        
        
        

    }
}
