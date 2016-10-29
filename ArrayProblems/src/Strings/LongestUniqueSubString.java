package Strings;

import java.util.HashSet;

public class LongestUniqueSubString {

	static String string = "aabcdefgguhjklmnbvvwertyuioplkj";
	static HashSet<Character> set = new HashSet<>();
	public static void main (String args[])
	{
		//String string = "aabcdefgguhjklmnbv";
		HashSet<Character> set = new HashSet<>();
		
		int frontIndex = 0;
		int maxSubLength = 0;
		int curSubLength = 0;
		int lastIndex = 0;
		int firstIndex = 0;
		for (int i = 0; i < string.length(); i++){
			 //if char is already present in the set
				 //then check whether
			if (set.contains(string.charAt(i)) || i == string.length() -1 ){
				if(i == string.length() -1)
				{
					curSubLength = (i+1) - frontIndex;
				}
				else
					curSubLength = i - frontIndex;
				if(maxSubLength < curSubLength)
				{
					maxSubLength = curSubLength;
					firstIndex = frontIndex;
					lastIndex = i+1;
				}
				set = new HashSet<>();
				frontIndex = i;
				
				set.add(string.charAt(i));
			}
			else
			{
				set.add(string.charAt(i));
			}
		}
		System.out.println(maxSubLength + " -- "+string.substring(firstIndex,lastIndex));
	}
	
	
}
