
public class Arrayin_JAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Creating an new integer array
		int [] arr = new int[5]; // static array with index of 5 with no value
		int [] arr2 = {1,2,3,4,5}; // static array with 5 assigned value
		
		//assigning value to the 1st array
		
		arr[0]=2;
		arr[1]=4;
		arr[2]=5;
		arr[3]=6;
		arr[4]=7;
		
		// how to access an array
		System.out.println("Index 4 value");
		System.out.println(arr2[4]);
		
		//printing all value in array using loop
		System.out.println("array");
		for(int i=0;i<arr2.length;i++)
		{
			
			System.out.println(arr2[i]);
		}
		
		//reverse printing of array 
		
		System.out.println("Reverse array");
		for(int i=arr2.length-1;i>=0;i--)
		{
			
			System.out.println(arr2[i]);
		}
		
		//to print each element in array
		
		for(int i: arr)
		{
			System.out.println(i);
		}
		
				
				
		

	}

}
