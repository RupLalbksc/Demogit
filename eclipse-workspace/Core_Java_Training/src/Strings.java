
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to define Strings
		//1. Method --String literals
		
		String s = "My name is Ruplal";
		
		//2. Method --String object
		
		String s1= new String("I live in Bokaro");
		
		
		//String Class and thier methods
		
		System.out.println(s.charAt(0));
		System.out.println(s.concat(s1));
		System.out.println(s.contains("a"));
		System.out.println(s.endsWith("l"));
		System.out.println(s.getBytes());
		System.out.println(s.indexOf("l"));
		System.out.println(s.replace("l", "m"));
		String [] arr  = s.split(" ");
		System.out.println(arr[0]);
		String n = s.toLowerCase();
		String k = s.toUpperCase();
		String kk =s.substring(2,8);
		System.out.println(kk);
		
		
		
		
		
		

	}

}
