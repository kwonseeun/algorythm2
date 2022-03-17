package algorythm3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class example06 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 3, 2, 1, 5));
		System.out.println(list); // [0, 3, 2, 1, 5]

		int max = Collections.max(list);
		System.out.println(max);
		
		int min = Collections.min(list);
		System.out.println(min);
	}

}
