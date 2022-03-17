package algorythm3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class example04 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("A","B","C","A"));
		
		int count = Collections.frequency(list, "A");
		
		System.out.println(count);
		
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "C", "A","B","A"));
		System.out.println("원본: " + list); 
		
		Set<String> set = new HashSet<String>(list);
		for (String str : set) {
			System.out.println(str + ":" + Collections.frequency(list2, str));
		}
	}

}
