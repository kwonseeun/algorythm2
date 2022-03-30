package algorythm4;

import java.util.HashMap;
import java.util.Map;

public class example05 {

	public static void main(String[] args) {
		Map<String, Object> nameMap = new HashMap<String, Object>();
		
		nameMap.put("sdf", "z");
		

		if (nameMap != null && !nameMap.isEmpty()) {
			System.out.println("맵은 비어있지 않다 ");
		}else {
			System.out.println("비어있다 ");
		}
		
	}

}
