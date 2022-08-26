package algorythm6;

import java.util.StringTokenizer;

public class example16 {

	public static void StringTokenizerTest (String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		for (int i = 0; st.hasMoreTokens(); i++) {
			System.out.println(i + "번쨰: " + st.nextToken());
			
		}
	}
	
	public static void splitTest(String str) {
		String split[] = str.split(",");
		for (int i = 0; i < split.length; i++) {
			System.out.println(i + "번쨰: " + split[i]);
		}
	}
	public static void main (String[]args) {
		String str = "apple,banana,kiwi";
		
		StringTokenizerTest(str);
		System.out.println();
		splitTest(str);
	}

}
