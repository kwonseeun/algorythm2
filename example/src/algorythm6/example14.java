package algorythm6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class example14 {

	// key 기준 최대 / 최소값 찾기 
	public static void main(String[] args) {
		
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	
	map.put(1, 5);
	map.put(2, 70);
	map.put(3, 30);
	
	// Max Key
	Integer maxKey = Collections.max(map.keySet());
	
	// Min Key
	Integer minKey = Collections.min(map.keySet());
	
	// 결과 출력 
	System.out.println(maxKey);
	System.out.println(minKey);
	}

}
