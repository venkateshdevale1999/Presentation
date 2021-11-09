package th84;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question9 {
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the last number");
		int n = sc.nextInt();
		
		
		
		System.out.print("0, 1, 1, ");
      int x=1;
      int y=1;
     int sum=x+y;
      System.out.print(sum+", ");
      while (true){
          x=y;
          y=sum;
          sum=x+y;
          if(sum<n)
          System.out.print(sum+", ");
          else{
              break;
          }
      }
		
		int i=1;
		int j=2;
		
		System.out.println();
		System.out.print(i+", "+j);
		while (true)
		{
          if ((i+3)>n || (j+4)>n)
        	  break;
          
          else 
          {
             System.out.print(", "+(i += 3) + ", ");
              System.out.print((j += 4));
          }
     
	}
		
		
		
	  List<Integer> numList=new ArrayList<Integer>();
      numList.add(1);
      numList.add(5);
      numList.add(8);
      for (Integer i1:numList) {
          System.out.print(i1+", ");
      }

      System.out.println();
      System.out.println("enter the limit");
      int num=sc.nextInt();
      int i1= numList.get(numList.size()-1)+numList.get(numList.size()-2)+numList.get(numList.size()-3);;

      while (i1<num){
          System.out.println(i1+", ");
          numList.add(i1);
          i1= numList.get(numList.size()-1)+numList.get(numList.size()-2)+numList.get(numList.size()-3);;
      }
	}

}
