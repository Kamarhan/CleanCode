package homework;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
	int num,sum=0, q ,t;
    Scanner scanner=new Scanner(System.in);
    System.out.println("please enter the number");
    num=scanner.nextInt();
    t=num;
    while(num!=0) {
    	q=num%10;
    	sum+=q*q*q;
    	num/=10;
    }
    if(sum==t) {
    	System.out.println(t+" is arm strong number");
    	  }else{
    		  System.out.println(t+"is not armstrong number");
    	  }
	}

}
