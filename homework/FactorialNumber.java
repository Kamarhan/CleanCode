package homework;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
	 
		int  numb=7; int fact=1;
		for(int i=1; i<=numb; i++) {
			fact=fact*i;
			System.out.println(fact);
		}
	
}
}