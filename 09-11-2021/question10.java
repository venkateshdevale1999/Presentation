package th84;



import java.util.Scanner;



public class question10 {

public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value X");
	int x = sc.nextInt();
	System.out.println("enter the value N");
	int N = sc.nextInt();
	int total=1;
	for(int i=0;i<N;i++)
	{
		
		total=total*x;
	}
	System.out.println("Value of "+x+" power "+N+" is  "+total);
}

}
