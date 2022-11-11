
public class nested_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		/*   1 2 3 4 
		 *   5 6 7 
		 *   8 9
		 *   10 
		 
		int k=1;
		int n =4;
		for (int i=1;i<=n;i++)
		{
			for (int j=i;j<=n;j++)
			{
				System.out.print( " "+k);
				k++;
			}
			System.out.println("");
		}
	
		     1 
		 * 	 2 3 
		 *   4 5 6 
		 *   7 8 9 10 
		 
	
		int k=1;
		int n =4;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" " + k);
				k++;
			}
			System.out.println("");
			
		}
		*/
		
		int n= 4;
		int k=3;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" " + k);
				k=k+3;
				
			}
			System.out.println("");
		
		}
		
				
	}

}
