import java.lang.reflect.Method;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class String_in_JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] name = {"Mohit","Rohit","Sumit","Amit"};
		
		//Printing all values of String
		
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		//Reversing the string array
		
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
		
		for(String s1:name)
		{
			System.out.println(s1);
		}
		
		//Some operations in String JAVA
		
		String s= "This is me ";
		String [] s1 = s.split("i");
		
		System.out.println(s1[0]);
		System.out.println(s1[1]);
		System.out.println(s1[2]);
		for (int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i].trim());
		}
		for (int i=s1.length-1;i>=0;i--)
		{
			System.out.println(s1[i].trim());
		}
		
		for(int i=0;i<s.length();i++) //print each letter in a string
		{
			System.out.println(s.charAt(i));
		}
		for (int i=s.length()-1;i>=0;i--) //reverse print each letter in a string
		{
			System.out.println(s.charAt(i)); 
		}
	
		Method_in_JAVA d = new Method_in_JAVA();
		d.chara();
		
		

	}

}
