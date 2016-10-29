package Arrays;

import java.util.*;
public class Dir{
	
	public static int count_spaces(String line){
		int spaces = 0;
		char[] arr = line.toCharArray();
		for(char c : arr){
			if(c != ' '){
				break;
			}
			else{
				spaces++;
			}
		}
		return spaces;

	}
	public static void main(String[] agrs){
		String main = "dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n file1.jpeg\ndir2\n file2.gif";
		String[] arr = main.split("\n");
		//System.out.print(main);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+" "+count_spaces(arr[i]));

		}

		int max = 0;
		int max_pos =0;
		for(int i=0;i<arr.length;i++){
			if(count_spaces(arr[i])> max){
				max = count_spaces(arr[i]);
				max_pos = i;
			}
		}

		System.out.println(max_pos);

		String path = arr[0];
		for(int i=1; i<max_pos;i++){
			if((count_spaces(arr[i-1])+1) == count_spaces(arr[i]) ){
				path+=arr[i];
			}
		}
		System.out.println(path+arr[max_pos]);
		
	}
}