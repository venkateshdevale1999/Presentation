package th84;

import java.util.Scanner;

public class question7 {
	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		System.out.println( numberToWord(n));
		
		
	}
	
	private static String numberToWord(int number) {
	    String words = "";
	    String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six",
	            "seven", "eight", "nine", "ten", "eleven", "twelve",
	            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
	            "eighteen", "nineteen" };
	    String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
	            "sixty", "seventy", "eighty", "ninety" }; if (number == 0) {
	        return "zero";
	    }
	    if (number < 0) {
	        String numberStr = "" + number;
	        numberStr = numberStr.substring(1);
	        return "minus " + numberToWord(Integer.parseInt(numberStr));
	    }
	    if ((number / 1000000) > 0) {
	        words += numberToWord(number / 1000000) + " million ";
	        number %= 1000000;
	    }
	    if ((number / 1000) > 0) {
	        words += numberToWord(number / 1000) + " thousand ";
	        number %= 1000;
	    }
	    if ((number / 100) > 0) {
	        words += numberToWord(number / 100) + " hundred ";
	        number %= 100;
	    } if (number > 0) {
	        if (number < 20) {
	            words += unitsArray[number];
	        } else {
	            words += tensArray[number / 10];
	            if ((number % 10) > 0) {
	                words += "-" + unitsArray[number % 10];
	            }
	        }
	    }
	    return words;
	}



}
