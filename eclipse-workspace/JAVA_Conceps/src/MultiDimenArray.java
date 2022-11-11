
public class MultiDimenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,3,2},{2,3,6},{8,6,5}};
		int min = a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if (a[i][j]>min)
				{
					min=a[i][j];
				}
			}
		}
		System.out.println(min);
	}

	

}
