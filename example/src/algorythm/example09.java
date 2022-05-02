package algorythm;

import java.util.Arrays;
import java.util.Collections;

/**배열 역순 정렬 */
public class example09 {

	public static void main(String[] args) {
		Integer arr[] = {1,53,23,9,44};
		
		Arrays.sort(arr,Collections.reverseOrder());
		//Collections.reverseOrder() 는 채ㅡㅔㅁㄱㅁ색 rorcpdlek. 
		
		System.out.println(Arrays.toString(arr));
	}
}
	
/**배열 오름차순 정렬  
 * 
 * int arr[] = {1,53,23,9,44};
 * arrays.sort(arr)
 * 
 * System.out.println(Arrays.toString(arr));
 *
 * */


/** Lambda를 사용하여 짧게 구현 
 * 
 * Integer[] arr = {1, 26, 17, 25, 99, 44, 303};
 * 
 * Arrays.sort(arr, (i1, i2) -> i2 -i1);
 * 
 * System.out.println(Arrays.toString(arr));
 * 
 * */

