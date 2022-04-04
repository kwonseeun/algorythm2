package algorythm4;

import java.util.Arrays;

public class ArrayLength01 {

	public static void main(String[] args) {
		
		String[] arr = {"A","B","C"};
		int arrLength = arr.length;
		
		// 기존 배열을 새로운 배열로 복사( 길이를 늘려준다 )
		String[] newArr = Arrays.copyOf(arr, arrLength+1);
		
		// 새로 늘어난인덱스에 값 추가 
		newArr[arrLength] = "D";
		
		System.out.println("기존 배열 "  + Arrays.toString(arr));
		System.out.println("추가된 배열" +Arrays.toString(newArr));
	}

}
