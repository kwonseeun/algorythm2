package algorythm6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class example15 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(
			Arrays.asList(50, 22, 33, 13, 25));
		
		Collections.sort(list);
		
		int min = list.get(0);
		int max = list.get(list.size() - 1);
		
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}

}
