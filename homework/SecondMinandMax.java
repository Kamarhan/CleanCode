package homework;

import java.util.Scanner;

import javax.naming.InitialContext;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import loop.forLop;

public class SecondMinandMax {
	public static void main(String[]args) {
		
		
// SecondMinandMax.minNmaxN();
//SecondMinandMax.secondWay();
		SecondMinandMax.loopArray();
	}
	public  static void minNmaxN() {
		int num[]={13,12,14,15,-6}; //{12,11,-9,10,34};
		int min,max, min2,max2; 
		 min=max=min2=max2=num[0];
		 
		 for(int i=0; i<num.length; i++) {
			 if(num[i]<min) min=num[i];
			 if(num[i]>min&& num[i]<min2) min2=num[i];
			 if(num[i]>max) max=num[i];
			 if( num[i]<max&& num[i]>max2)max2=num[i];
			 
			 
		 }
		 System.out.println("min number is "+min+" max number is "+max);
		 System.out.println("second highest number is "+max2);
		 System.out.println("second smalest number is  "+min2);
	}
	public static void secondWay() {
		 int num[]={12,11,-9,10,34};// {13,12,14,15,-6};
		 int min,max, min2,max2; 
		 min=max=min2=max2=num[0];
		 for(int i=0; i<num.length; i++) {
		 if (num[i]<min) {
			 min2=min;
			 min=num[i];
		 }
		 if(num[i]>max) {
			 max2=max;
			 max=num[i];
		 }
		 
		 }	
	 System.out.println(min);
	 System.out.println(min2);
	 System.out.println(max);
	 System.out.println(max2);
			 
	
	}
 public static void loopArray() {
	 int [][] table= {{1,2,3}, {25,37,49}, {55,68,93}};
	 boolean found=false;
	 int loopCycles=0;
	 outer: for(int []rows:table) {
		     for( int row: rows) {
		    	loopCycles++;
    	 if(row==93) {
//		    		 found=true;
//		    		 break outer;  
		    	continue outer;
		    	
		     }
		   System.out.print(row+",");
	 }
	 
	 }
 }
}

 

