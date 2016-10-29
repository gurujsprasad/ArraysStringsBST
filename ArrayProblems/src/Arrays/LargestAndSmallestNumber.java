package Arrays;

public class LargestAndSmallestNumber {

	
	public static void main(String args[]){
		
		int[] intArray = {3,5,6,1,2,9,6};
		int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
		for(int i=0; i < intArray.length; i++){
			if( intArray[i] < smallest)
			{
				smallest = intArray[i];
			}
			if(intArray[i] >= largest)
			{
				largest = intArray[i];
			}
			
		}
		System.out.println("smallest: "+smallest+" --- largest: "+largest);
		
	}
	
}
