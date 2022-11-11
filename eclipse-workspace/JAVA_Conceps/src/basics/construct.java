package basics;

public class construct {

	public static void main(String[] args) {
		employee e1 = new employee();
		employee e2 = new employee();
		e1.age=24;
		e1.name="ruplal";
		e1.salary=38000;
		System.out.println(e1.name+" "+"'s age is "+e1.age+" and salary is " + e1.salary);
		

	}

}
class employee{
	String name;
	int age;
	int salary;
	//public employee() {
		//System.out.println("construtor is called");
	//}
	
	
}
