package homework;

import java.security.acl.LastOwnerException;
import java.util.Scanner;

import javax.swing.plaf.multi.MultiInternalFrameUI;

import loop.forLop;

public class PositiveandaverageNumbers {

	public static void main(String[] args) {
		int num, sum = 0,count=0;
		Scanner  scanner=new Scanner(System.in);
//         int number  = scanner.nextInt();
//		int hundred =100;
//         int ten =10;
//         
//         int N1=(number/hundred);
//         int N2 =(number-hundred*N1)/ten;
//         int N3 =number-hundred*N1-N2*ten;
//         int reversed = N3*hundred+N2*ten+N1;
//         System.out.println(reversed);
//         
    	    /*SECOND WAY DO IT*/
//	    int lastN=number%ten;
//	    int middleN= (number%100)/ten;
//	    int firstN=number/hundred;
//	    final int rev =lastN*hundred+middleN*ten+firstN;
//	    System.out.println(rev);
         /*THIRD WAY TO DO*/
         String input =scanner.next();
         String reverString=new StringBuilder(input).reverse().toString();
         int solution =Integer.parseInt(reverString);
         System.out.println(solution);
      
		

		}
}
