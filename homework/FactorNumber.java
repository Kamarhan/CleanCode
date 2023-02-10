package homework;

import java.util.Scanner;

public class FactorNumber {
	public static void main(String[]args) {
		int num, i=2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the number");
		num=scanner.nextInt();
	
		while(i<=num/2) {
			if(num%i==0) {
				System.out.print("Factorial of "+num +"are");
				System.out.println(i);
			}
	  i++;
		}
			
	}
	

}
