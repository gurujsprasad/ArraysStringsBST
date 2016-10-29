package Arrays;

import java.util.Arrays;

public class SearchNumber {

	
	public static void binarySearch (int [] intArray, int key,int low, int high)
	{

		Arrays.sort(intArray);
		
		int mid = (low + high)/2;
		if(intArray[mid] == key)
		{
			System.out.println("key found at position: "+ (mid+1));
			System.exit(0);
		}
		if(intArray[mid] < key)
			binarySearch(intArray, key,mid+1, high);
		else
			binarySearch(intArray, key, low, mid-1);
	}
	
	public static void main (String args[])
	{
		int[] intArray = {3,5,6,1,2,9,6};//1235669
		int key = 6;
		binarySearch(intArray, key, 0, intArray.length );
		
	}
	
	
}