package th84;

import java.util.Scanner;

public class question3 {
	private static boolean isPerfectSquare(int i) {
	    int n =(int) Math.sqrt(i);
	    return (i==n*n);
	}
	
	private static boolean checkFibonacci(int num) {
	    return  ( isPerfectSquare(5*num*num+4) || isPerfectSquare(5*num*num-4) );

	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find in fibnocci");
		int n = sc.nextInt();
		boolean ans = checkFibonacci(n);
        System.out.println(ans);
		
	}	

}
