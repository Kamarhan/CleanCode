package homework;

public class OOPHOMEWORK1 {
	

	public static void main(String[] args) {
		Employee emp1=new Employee("Robert	");
		emp1.age=24;
		emp1.gender='f';
		emp1.adderes="3303 westberry sq joplin mo";
		emp1.toString();

		Employee emp2=new Employee("ssam",2000);
		emp2.age=25;
		emp2.gender='m';
		emp2.adderes="3304 westberry sq joplin mo";
		emp2.toString();
		Employee emp3=new Employee("llobert",234, 'f',"3305 westberry lane");
		
		System.out.println( emp3.toString());
	}

}
 class Employee{
	 String name;
	 int age;
	 char gender;
	 String adderes;
 Employee(String name	) {
	 this.name=name;}
  Employee( String name, int age ) {
     this.name=name;
     this.age=age;
}
Employee(String name, int age, char gender, String addere) {
	 this.name=name; this.age=age; this.gender=gender; this.adderes=addere;
}
    public String  toString() {
    	return name+"\t"+age+"\t"+gender+"\t"+adderes;
		
	}
 }