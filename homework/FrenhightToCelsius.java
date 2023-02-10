package homework;
//Conversion between Farenheit and Celsius;
import java.util.Scanner;

public class FrenhightToCelsius {

	public static void main(String[] args) {
		int choose, degree;
		float result;
		Scanner scanner=new Scanner(System.in);
		System.out.println("1 Celsius to Fahrenheit\t\r\n2, Fahrenheit to Celsius");
		System.out.println("please select one of them");
		choose=scanner.nextInt();
		System.out.println("please enter the choise ");
		 degree=scanner.nextInt();
				 if(choose==1) {
					 result=(degree*9/5)+32;
					 System.out.println(degree +"celsius is equal to t"+result+"Farenheit");
				 }else if (choose==2) {
					 result=(degree-32)*5/9;
					 System.out.println( degree+" fahrenheit eqia tp "+result+" Celsius");
					 
				 }else {
					 System.out.println("you entered invalid entry");
				 }
	}

}
