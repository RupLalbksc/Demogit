
public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*for(int i=0;i<4;i++)
		{
			System.out.println("Outer loop started");
			for (int j=0;j<4;j++)
			{
				System.out.println("Inner loop");
			}
			System.out.println("Outer loop finished");
		}
		
		//WAP to print pyramid triangle
		int k=1;
		for (int i=1;i<=4;i++)
		{
			//System.out.println(i);
			for (int j=1;j<=5-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
				
			}
			System.out.println("");
		}
		int k=1;;
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}*/
		
		for(int i=1;i<=4;i++)
		{
			for (int j=0;j<=4-i;j++)
			{
				System.out.print("*");
				System.out.print("\t");
				
				
			}
			System.out.println(" ");
		}
		
	}
		
}
