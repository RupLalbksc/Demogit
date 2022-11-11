
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6,8};
		int m=a[0];
		for(int i=0;i<a.length;i++)
		{
			
			//System.out.println(a[i]);
			if (a[i]>m)
			{
				m=a[i];
			}
			
			
		}
		System.out.println(m);

	}

}
