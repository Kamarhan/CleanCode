package homework;

import java.util.Scanner;

public class MaxMinNumber {

	public static void main(String[] args) {
		 int max, min,  num,  con;
		 Scanner scanner=new Scanner(	System.in);
		  System.out.println("Please enter the number");
		  num=scanner.nextInt();
		  max=min=num;
		  System.out.println("constinue?(1-for yes, 0-for no");
		  con=scanner.nextInt();
		  
		  while(con==1) {
			  System.out.println("please enter your number");
			  num=scanner.nextInt();
			    max=max<num?num:max;
			  min=min>num?num:min;
			  System.out.println("constinue?(1-for yes, 0-for no");
			  con=scanner.nextInt();
			
		  }
		  
         System.out.println( "max"+max+"\tmin="+min);
	}

}
