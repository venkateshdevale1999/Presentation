package th84;

import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lower limit");
		int n = sc.nextInt();
		System.out.println("enter the upper limit");
		int m = sc.nextInt();
		int sump=0;
		System.out.println("prime numbers are");
		int Arr[] = new int[m];
		
		for(int i=n;i<=m;i++)
		{
			int flag=0;
			
			for(int j=2;j<=i/2;j++) 
			{
				if(i%j==0) 
				{
					flag=1;
					break;
				}
				
				
			}
			
			if(flag==0) { 
				sump=sump+i;
				System.out.println(i);
				
				
			}
			
			
		}
		
		System.out.println("the sum of prime number in given range is "+sump);
		
		
		
	}
	
	

}
