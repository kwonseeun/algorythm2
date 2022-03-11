package example;

import java.util.Arrays;

/** 배열 일부분 오름차순 정렬*/
public class example07 {

	public static void main(String[] args) {
		
		Integer[] array = {58, 32, 64, 12, 15, 99};
		
		Arrays.sort(array, 1, 4);
		for (int i = 0; i < array.length; i++) {
			System.out.print("["+array[i]+"]");
		}
	}

}
