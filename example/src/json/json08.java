package json;

import java.util.Arrays;

public class json08 {

	public static void main(String[] args) {
		
		// 원본 배열
		String[] arr = {"A","B","D"};

		// 추가할 value, Index
		String newValue = "C";
		int position =2;
		
		// 새로운 배열의 길이
		int newArrLength = arr.length +1;
		
		// 새로운 배열 생성
		String[] newArr = new String[newArrLength];
		
		// 지정된 위치에 새로운 값 추가하며, 새로운 배열에 담기
		for (int i = 0; i < newArr.length; i++) {
			if (i < position) {
				newArr[i] = arr[i];
			} else if(i == position) {
				newArr[i] = newValue;
			}else {
				newArr[i] = arr[i - 1];
			}
		}
		// 결과 출력 
		System.out.println(Arrays.toString(newArr));
	}
}
