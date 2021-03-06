package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DupplicateInArray {

	public static void numberOfDupplicates (int [] intArray){
		
		
		LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap();
		for(int i=0; i < intArray.length; i++){
		
			if(linkedHashMap.containsKey(intArray[i]))
			{
				linkedHashMap.put(intArray[i], linkedHashMap.get(intArray[i])+1);
			}
			else
				linkedHashMap.put(intArray[i], 1);
		}
		Set<Entry<Integer, Integer>> entries = linkedHashMap.entrySet();
		for (Entry<Integer, Integer> entry : entries){
			
			System.out.println(entry.getKey()+"-"+entry.getValue()+"\n");
		}
	}
	
	
	public static void main (String args [])
	{
		int [] intArray = {22,28,30,31,30,28};
		Arrays.sort(intArray);
		LinkedHashSet< Integer> noDuplicates = new LinkedHashSet<>();
		for (int i = 0; i < intArray.length ; i++)
		{
			System.out.println(intArray[i]);
			noDuplicates.add(intArray[i]);
		}
		Iterator<Integer> it = noDuplicates.iterator();
		System.out.println("\n---------------------");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("\n -----------------------");
		System.out.println("check for duplicates");
		numberOfDupplicates(intArray);
	}
	
}
