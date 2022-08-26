package algorythm6;

import java.util.StringTokenizer;

public class example16 {

	public static void StringTokenizerTest (String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		for (int i = 0; st.hasMoreTokens(); i++) {
			System.out.println(i + "번쨰: " + st.nextToken());
			
		}
	}

}
