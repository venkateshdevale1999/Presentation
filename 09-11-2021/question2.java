package th84;

import java.util.Scanner;

public class question2 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find factorial");
		int n = sc.nextInt();
		int fact=1;
		
		for(int i=n;i>=1;i--) 
		{
			
			fact=fact*i;
			
			
		}
		
		System.out.println("the factorial of given number is "+fact);
		
		
		
		
	}

}
