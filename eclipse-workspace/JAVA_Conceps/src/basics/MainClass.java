package basics;

public class MainClass {

	public static void main(String[] args) {
		
		/*Person p1 =new Person(); //obj created
		p1.name="Ruplal"; //obj calling
		p1.age=25; */
		Person p1 =new Person(33,"mahto"); 
		System.out.println(p1.age+" "+p1.name );
		
		Person p2 = new Person();
		p2.name = "Kumar";
		p2.age = 24;
		System.out.println(p2.age+ " " + p2.name );
		p1.eat(); //method calling
		p1.walk(); //method calling
		p2.walk(5);
		System.out.println(Person.count);
	}

}
class Person{
	String name;
	int age; 
	static int count;
	
	public Person(){
		count++; 
	System.out.println("constructor called") ;  //default constructor
	}
	
	void walk() { 
		//method showing behavior
		System.out.println(name + " walking");
	}
	void eat() {	
		//method showing behavior
		System.out.println(name + " eating");
	}
	void walk(int steps){
		
		System.out.println(name + " walked " + steps);
		
	}
	public Person(int newAge, String newName) {
		this();
		name=newName;
		age=newAge;
	}
	}
	


