package algorythm2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Iterator01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("A", "1");
		map.put("B", "2");
		map.put("C", "3");
		
		Iterator<String> iterList = list.iterator();
		Iterator<String> iterSet = set.iterator();
		Iterator<String> iterMap = map.keySet().iterator();
		
		System.out.println(iterList.next());
		iterList.remove();
		System.out.println("REMOVE 테스트");
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
