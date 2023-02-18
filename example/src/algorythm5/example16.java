package algorythm5;

import java.util.Arrays;
import java.util.StringTokenizer;

public class example16 {

	public static void main(String[] args) {
		
		String str ="a;;b;c";
		
		String[] str1 = str.split(";");
		
		StringTokenizer st = new StringTokenizer(str,";");
		
		System.out.println(Arrays.toString(str1));
		System.out.println(str1[1].length());
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken()+" ");
		}
		
		//현재 있는값이랑 max 랑 비교 현재있는게 맥스보다 크면
		// max = 현재있는값
	}
}
