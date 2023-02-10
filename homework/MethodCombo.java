package homework;

import loop.forLop;

public class MethodCombo {

	public static void main(String[] args) {
	  int[][] s= {{73,65,78},{98,75,45},{76,89,62}};
	  outputGrade(s);
	  getAveragendMax(s);
	//  getClassSum(s);
//	  System.out.println("........Math\tEnglish\tJava\tAverage\tMax");
	  
	}
     static void outputGrade(int[][] score) {
    	  System.out.println("........Math\tEnglish\tJava"); 
    	  for(int i=0; i<score.length; i++) {
    		    System.out.print("Student"+(i+1)+"--");
    		     for (int j = 0; j < score.length; j++) {
    		    	  System.out.print(score[i][j]+"\t");
					
				}
    		     System.out.println();
    	  }
     }
     static void getAveragendMax(int[][] st) {
    	 System.out.println("........Math\tEnglish\tJava\tAverage\tMax");
    	 int sum=0;
    	 int max=0;
 	 int average = 0;
    	 for (int i = 0; i < st.length; i++) {
    		    System.out.print("Student"+(i+1)+"--");
    		    for (int j = 0; j < st.length; j++) {
  		    	  System.out.print(st[i][j]+"\t");
  		        
  		    	  sum+=st[i][j];
  		  
  		    
  	    max=max<st[i][j]?st[i][j]:max;
  		    
		}
    	 System.out.println((sum/st[i].length)+"\t"+max);
     }
    
}
//     static void getClassSum(int[][] st) {
//    	 int []sum= {0,0,0};
//    	  for(int i=0; i<st.length; i++) {
//    		   for (int j = 0; j < st[i].length; j++) {
//    			   sum[j]+=st[i][j];
//				
//				
//			}
//    	  }
//    	 System.out.println("sum=\t");
     }
