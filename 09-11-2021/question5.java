package th84;

import java.util.Scanner;

public class question5 {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the binary number");
		long l = sc.nextLong();
		System.out.println(convertBinaryToDecimal(l));
		
		
		
		
	}
	public static int convertBinaryToDecimal(long num) {
	    int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;
	      decimalNumber += remainder * Math.pow(2, i);
	      ++i;
	    }
	    
	    return decimalNumber;
	  }

}
