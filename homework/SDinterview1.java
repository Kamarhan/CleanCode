package homework;

import java.util.Scanner;

import org.apache.commons.collections4.map.CaseInsensitiveMap;
import org.apache.poi.util.SystemOutLogger;
import org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits;
import org.openxmlformats.schemas.drawingml.x2006.main.CTLineJoinBevel;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;

import loop.forLop;

public class SDinterview1 {

	public static void main(String[] args) {

		//stWhitespace();		
	//	maxNumber();
	//	swapNumbers();
	//	primeNumber1();
	//	primeNumber2();
		sumofNumber();
	}
	//Upper case ,Lower case letters and white space
	public static void stWhitespace() {
		String st=" WalUm LayLAU";
		int count=0; 

		Scanner scannner=new Scanner(System.in);
		System.out.println("Please enter the number");
		int a=scannner.nextInt();
		switch (a) {
		case 1:
			System.out.println("The list of upper case letters are:");
			for(int i=0; i<st.length();i++) {
				if(st.charAt(i)>='A'&& st.charAt(i)<='Z') {
				
					System.out.print(st.charAt(i)+",");
					count++;

				}

			}
			System.out.println();
			System.out.println("Total number of: "+count);
			break;


		case 2:	
			System.out.println("The lower case letters are");
			for(int i=0; i<st.length();i++) {
				if (st.charAt(i)>='a' && st.charAt(i)<='z') {
					System.out.print(st.charAt(i)+",");
					count++;
				}

			}
			System.out.println();
			System.out.println("The total number of: "+count);
			break;
		case 3:
			for(int i=0; i<st.length();i++) {
				if(st.charAt(i)==' ') {

					count++;
				}
			}
			System.out.println("total white space is :"+count);
			break;
		}

	}
//looking for largest and smallest number
  public static void maxNumber() {
	  Scanner scanner=new Scanner(System.in);
		int min, max, min1, max1;
	  int []number= {12,13,14,15,16};
	  min=max=min1=max1=number[0];
	  for(int i=0; i<number.length;i++	) {
		  if(max<number[i] ){
			  max1=max;
			max=number[i];
			  
		  }
		  if(number[i]<min) {
			  min1=min;
			  min=number[i];
			  
			  
		  }
		  
		  }
	   System.out.println(max1+"and"+max);
	    System.out.println(min1+"and"+min);
	 
  }
	   
  public static void swapNumbers() {
	  int n1=32; int n2=33;
	  System.out.println(n1+""+n2);
	  int temp=0;
	  temp=n1;
	  n1=n2;
	  n2=temp;
	System.out.println(n1+""+n2);
	
  }
 public static void primeNumber1() {
	  int a=13; int i;
      for( i=2; i<=a/2;i++) {
    	  if(a%i==0) {
    		  break;
    	  }
    	  
      }
      if(i>a/2) {
    	  System.out.println( "a is prime number"+a);
    	
      }  else {
    		  System.out.println("a is not prime"+a);
    	
    	  }
      }
public static void primeNumber2() {
	int i,k,j;
	for( i=1; i<100; i++) {
		k=0;
		for (j = 2; j <i; j++) {
			if(i%j==0) {
				k=1;
				break;
			}
		}
		if(k==0) {
			System.out.println(i);
		}
	}
	
}
public static void sumofNumber() {
	int numb=124; int remainder; int sum=0; 
	while(numb>0) {
	
		remainder=numb%10;
		numb=numb/10;
		sum=sum+remainder;
		
	}
	System.out.println(sum);
}
}



