package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeSet;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intArray [] = {1,2,3,5,5};
		HashMap<Integer,Integer> set = new HashMap<>();
		//put the data in to hash set
		for (int i = 0; i < intArray.length; i ++)
		{
			if (set.containsKey(intArray[i]))
				set.put(intArray[i], set.get(intArray[i])+1);
			else
				set.put(intArray[i],1);	
		}
		int check = 0;
		for (Integer value : set.values())
		{
			if(value > 1)
			{
				check = 1;
				break;
			}
		}
		if (check == 1)
		{
			System.out.println("there is a duplicate");
		}
		else
			System.out.println("there is no duplicate");
		
		for (Entry<Integer, Integer> it : set.entrySet())
		{
			System.out.println(it.getKey()+""+it.getValue());
		}
		
		//loop the hash set and check if value is greater than one
		
		
		
	}

}
