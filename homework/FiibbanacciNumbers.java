package homework;

import java.util.Scanner;

import loop.forLop;



public class FiibbanacciNumbers {
	public static void main(String[]args) {
		int number =10
				;
		getFibonacciNumber(number);


	}	 
public static void getFibonacciNumber(int N) {
	int numb1=0; int numb2=1; int numb3;
	for(int i=0; i<=7; i++) {
		numb3=numb1+numb2;
		numb1=numb2;
		numb2=numb3;
		System.out.println(numb3);
	}
	
}
}
