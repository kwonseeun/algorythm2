package algorythm3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class example05 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C","A","B","A"));
		System.out.println("원본: " + list );
		
		// ArrayList 빈도수를 Map에 저장 
		Map<String,Integer> map = new HashMap<String,Integer>();
		for (String str : list) {
			Integer count = map.get(str);
			if (count == null) {
				map.put(str,1);
			}else {
				map.put(str, count +1);
			}
		}
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
	}

}
