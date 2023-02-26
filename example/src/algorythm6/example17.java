package algorythm6;

import java.util.Arrays;
import java.util.Scanner;

public class example17 {
	 public static void main(String[] args) {
		 example17 T = new example17();
		    Scanner kb = new Scanner(System.in);
		    int n = kb.nextInt();
		    int[] arr = new int[n];
		    for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
		    System.out.println(T.solution(n, arr));
		  }

		  // 해결방법
		  // 배열을 하나 복사한다
		  // 복사한 배열을 정렬하여 원래의 순서를 맞춰준다
		  // 두 배열을 비교하여 서로 다른 값을 찾아 리턴해준다
		  public String solution(int n, int[] arr) {
		    String answer = "";

		    int[] tmp = arr.clone(); // 배열 복사
		    Arrays.sort(tmp); // 복사한 배열 정렬

		    for (int i = 0; i < n; i++) {
		      // 정렬된 순서와 다른 값을 문자열에 추가
		      if (tmp[i] != arr[i]) answer += (i + 1) + " ";
		    }
		    return answer;
		  }
}
