package th84;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class question6 {
	public static void main(String[] args) 
	{
		
		 Map<Integer, String> map=new HashMap<Integer, String>();  
		   
		    map.put(1,"one");  
		    map.put(2,"two");  
		    map.put(3,"three");  
		    map.put(4,"four"); 
		    map.put(5,"five");
		    map.put(6,"six");
		    map.put(7,"seven");
		    map.put(8,"eight");
		    map.put(9,"nine");
		    map.put(0,"zero");  
		     
		    Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			int n = sc.nextInt();
			
			int reverse = 0;  
			while(n != 0)   
			{
				//System.out.println("qwerty");
			int remainder = n % 10;  
			reverse = reverse * 10 + remainder;  
			n = n/10;  
			}
			
			System.out.println(reverse);
			
			
			String s = "";
			
			while(reverse != 0)   
			{  
			int remainder = reverse % 10;  
			s=s+map.get(remainder);
			s=s+" ";
			reverse = reverse/10;  
			}
			
			
			
			
			
			System.out.println("the string is "+s);
			
			
			
			
		    }  
		
		
		
}


