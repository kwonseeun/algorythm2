package algorythm3;

import java.util.HashSet;
import java.util.Set;

public class example02 {

	public static void main(String[] args) {
		
		// 여러개의 set 객체 합치기 
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		// set1 + set2 merge 
		Set<Integer> mergedSet = new HashSet<>();
		mergedSet.addAll(set1);
		mergedSet.addAll(set2);
		
		// 결과 출력 
		System.out.println(mergedSet);
	}

}
