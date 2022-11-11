
public class Method_in_JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//creating object for method
		Method_in_JAVA M = new Method_in_JAVA();
		M.mathscalc();
		M.english();
		String s = M.chara();
		System.out.println(s);
		
		
		

	}
	// method1
	public void mathscalc() 
	{
		System.out.println(1+1);
	}
	public void english()
	{
		System.out.println("ABC");
	}
	public String chara()
	{
		System.out.println("xyz");
		return "abc";
	}
}
