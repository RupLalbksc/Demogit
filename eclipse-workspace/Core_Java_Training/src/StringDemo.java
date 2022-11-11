
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello";
		String b = "Hello";
		a.concat(b);
		String c ="Hello";
		System.out.println(a);   // not possible because String are immutable
		
		
		//Mutable Strings // it is thread safe
		
		StringBuffer sb = new StringBuffer("Kumar");
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder SB = new StringBuilder("Mahto");
		SB.insert(3, "a");
		System.out.println(SB);
		
		System.out.println(a.equals(c));
		

	}

}
  