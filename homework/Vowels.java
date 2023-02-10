package homework;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.codec.CharEncoding;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.math3.stat.descriptive.StatisticalSummaryValues;
import org.apache.poi.util.SystemOutLogger;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType;

import com.sun.xml.bind.v2.runtime.output.StAXExStreamWriterOutput;

import loop.forLop;

import org.apache.*;
public class Vowels {
   
	public static void main(String[] args) {
	String sim=" JavaUlemduy ";
	int numb=123;
	Integer [] num= {12,23,32,34};
	String[] myArray= {"Monkey","Donkey","HouseKey","andkey"};
	System.out.println("original myArray:"+Arrays.asList(myArray));
	System.out.println("original array:"+Arrays.asList(num));
	  System.out.println("originlal string:"+sim);
       System.out.println("original number:"+numb);
       String stringreviseString=StringRevise(sim);
          System.out.println("Frist revise:"+stringreviseString);
          String secondreviseString=stringRevise1(sim);
          System.out.println("secondrevise:"+secondreviseString);
          String strbString=reverseBuilding( sim);
          System.out.println("using string builder:"+strbString);
          int revisedN=reverseNumber(numb);
          System.out.println("number that reversed:"+revisedN);
          StringBuffer stringBuffer=usestringBuffer(sim);
          System.out.println("String buffer:"+stringBuffer);
          reverseArray(num);
          reverseStringArray(myArray);
        
		};
	
		
	      public static String StringRevise(String input){
	    	  if(input.isEmpty()) {
	    		  return input;
	    	  }
			return StringRevise(input.substring(1))+input.charAt(0);
		       
	      }
		 public static String stringRevise1(String input) {
			 String st1="";
			 for(int i=input.length()-1; i>=0; i--) {
				 st1=st1+input.charAt(i);
			 }
			return st1;
			 
		 }
		 public static String reverseBuilding( String st) {
			 StringBuilder stb=new StringBuilder(st );
			 String stringB=stb.reverse().toString();
			return stringB;
		 }
		public static int reverseNumber(int num) {
			 int sum=0; int remainder=0;
			 while(num!=0) {
				 remainder=num%10;
				 sum=sum*10+remainder;
				 num=num/10;
			 }
			return sum;
			
		}
		 public static StringBuffer usestringBuffer(String st) {
			 StringBuffer stringBuffer=new StringBuffer();
			 char c[]	=st.toCharArray();
			 for(int i=c.length-1; i>=0; i--) {
				stringBuffer.append(c[i]).toString();
			 }
			return stringBuffer;
			 
		 }
		 public static void reverseArray( Integer[] num){
			 
			 Collections.reverse(Arrays.asList(num));
			 System.out.println(Arrays.asList(num));
			
			
		 }
		 public static void reverseStringArray(String myArray[]) {
			 Collections.reverse(Arrays.asList(myArray));
			 System.out.println(Arrays.asList(myArray));
		 }
			 
	}
		



	




	
	

