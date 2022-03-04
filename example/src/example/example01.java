package example;

import java.util.Iterator;

public class example01 {
	public static void main(String[] args) {
		int[] array = {3,24,1,55,17,43,5 };
		
		for (int i = 0; i < array.length -1 ; i++) {
			for (int k = 0; k < array.length-1; k++) {
				
				int temp01 = array[k];
				int temp02 = array[k +1];
				
				if (array[k] > array[k +1]) {	
					array[k] = temp02;
					array[k+1] = temp01;
					
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] + "");
		}
	}

}
