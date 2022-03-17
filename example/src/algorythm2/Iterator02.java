package algorythm2;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator02 {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();
		cars.add("a");
		cars.add("b");
		cars.add("c");
		cars.add("d");
		
		// iterator 획득 
		Iterator<String> iterator = cars.iterator();	
		
		// while문을 사용한 경우 
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		// for-each 문을 사용한 경우
		for (String str : cars) {
		     System.out.println(str);
		}		
	}
}
