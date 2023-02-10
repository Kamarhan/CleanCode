package homework;

import java.util.Scanner;

import loop.forLop;

public class PrimeNm {

	public static void main(String[] args) {
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the number");
		num=scanner.nextInt();
		 int i;
		for( i=2; i<=num/2; i++) {
			if(num%i==0) {
				
				break;
			}
			
	}
		if(i>num/2) {
		System.out.println(num+"is a prime number");
		}
	else {
		System.out.println(num+"is not a prime number");
	}
}
}