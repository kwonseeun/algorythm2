package algorythm;

import java.util.Arrays;
import java.util.Comparator;

public class example10 {
	public static void main(String[] args) {
		
	/** String 배열,문자열 길이 순서로 정렬하기 */
		
		String[] arr = {"Apple", "Kiwi", "Orange", "Banana", "Watermelon", "Cherry"};
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		
		System.out.println("Sorted arr[] :" + Arrays.toString(arr));
	}
}

/** Lambda를 사용하여 간결하게 구현하기 
 * 
 * String[] arr = {"Apple", "Kiwi", "Orange", "Banana", "Watermelon", "Cherry"};
 * 
 * Arrays.sort(arr, (s1, s2) - > s1.length() - s2.length());
 * 
 * System.out.println("Sorted Arr[] " + Arrays.toString(arr));
 * */
