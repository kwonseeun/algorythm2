package example;

import java.util.Arrays;

public class example06 {

	public static void main(String[] args) {
		
		int array[] = {4,1,2,3,5,6,8,9,10};
		
		int max = array[0];
		int min = array[0];
		
		Arrays.sort(array);
		
		System.out.println("최소값 :" + array[0]);
		System.out.println("최대값 :" +array[array.length - 1]);
	}
}
