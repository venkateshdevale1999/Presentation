package com.torry_harris;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println("enter the 2 numbers");
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum =num1 +num2;
        System.out.println("the sum is"+sum);/
         */

        /*System.out.println("enter the number");
        int num=sc.nextInt();
        if(num%2==0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");/
         */
       /* System.out.println("enter the 3 number");
        int n1=sc.nextInt();
        double n2=sc.nextDouble();
        long n3=sc.nextLong();
        double lar1=(n1>n2)?n1:n2;
        double lar2=(n3>lar1)?n3:lar1;
        System.out.println("largest is ::"+lar2);*/
	
	/* float a=23.4567;
	   double b=a;    //implicit conversion
	   int c = int(a)  // exiplict conversion
 


        /*int a=23;
        int x = ++a;
        int y = a++;
        int z = --a;
        int g = a--;
        System.out.println(x+" "+y+" "+z+" "+g);*/

       /* System.out.println("enter the number");
        int num = sc.nextInt();
        int revnum = reverseNum(num);
        System.out.println("the reversed number is : "+revnum);*/


       /*System.out.println("enter a integer value");
        int num =sc.nextInt();
        if(isprime(num))
            System.out.println("it is prime");
        else
            System.out.println("it is not prime");*/


        /*System.out.println("enter the number");
        int num =sc.nextInt();
        long fact = factorial(num);
        System.out.println("the factorial of given number is : "+fact);*/


        /*System.out.println("enter the month number");
        int mno = sc.nextInt();
        String days = tofinddays(mno);
        System.out.println("no of days"+days);*/



        /*int[] arr={10,20,30,40,50};

        System.out.println("printing the elements");
        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }*/

        System.out.println("enter the length");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements");
        for(int i=0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("printing the elements");
        for( int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + " ");
        }
        int sum=0;
        for( int i=0;i<arr.length;i++) {
            sum=sum+arr[i];
        }
        System.out.println("summation of element"+sum);


    }
    public static String tofinddays(int mno) {
        String msg;
        
        switch (mno) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                msg = "it has 31 days";
                break;
            case 2:
                msg = "it has 28 or 29 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                msg = " it has 30 days";
                break;
            default:
                msg = "invalid no";

        }
        return msg;

    }




    public static long factorial(int n){
        long fact=1;
        for( int i=1;i<=n;i++){
            fact=fact*i;

        }
        return fact;

    }
    public static int reverseNum(int n)
    {
        int rem=0,revnum=0;
        while(n!=0)
        {
            rem = n % 10;
            revnum = revnum*10 + rem;
            n = n / 10;
        }
        return revnum;


    }
    public static boolean isprime(int n){
        boolean flag = true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
