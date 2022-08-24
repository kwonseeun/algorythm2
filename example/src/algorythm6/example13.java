package algorythm6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class example13 {

	public static void main(String[] args) {
		
		// HashMap 선언 
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(1, 5);
		map.put(2, 70);
		map.put(3, 50);
		
		// Max
		Entry<Integer,Integer> maxEntry = null;
		
		// Iterator
		Set<Entry<Integer,Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}
		}
		
		// Max Key, Value 출력 
		System.out.println(maxEntry.getKey() + " " + maxEntry.getValue());
		
	}

}
