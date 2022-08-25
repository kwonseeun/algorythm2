package algorythm6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class example15 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(
			Arrays.asList(50, 22, 33, 13, 25));
		
		int min = Collections.max(list);
		int max = Collections.min(list);
		
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}

}
