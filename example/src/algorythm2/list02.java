package algorythm2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


/** ArrayList와 LinkedList는 생성 방법만 다르고 사용방법은 동일 , 
 * Collection.sort() 나 List.sort()는 원본 데이터를 정렬된 결과로 바꿈
 * 스트림을 사용하면 원본 데이터는 유지되고, 정렬된 복사본을 사용하는 형태*/

public class list02 {

	public static void main(String[] args) {
		
		// create list
		List<String> l1 = new ArrayList<>();
		List<String> l2 = Arrays.asList("one", "two");
		List<String> l3 = List.of("three" , "four");
		
		// add data to List
		l1.addAll(l2);
		l1.addAll(l3);
		l1.add("five");
		
		System.out.println("## element in list");
		System.out.println(l1);
		
		// create new linkedList and add data
		LinkedList<String> llist = new LinkedList<>();
		llist.addAll(l2);
		llist.addAll(1, l3);
		llist.add("five");
		
		System.out.println("## element in LinkedList");
		System.out.println(l1);
		
		// access data with index
		System.out.println("## first element: [ " + l1.get(0));
		System.out.println("## last index of three:" + l1.lastIndexOf("three"));
		
		// change data in List
		l1.set(0,"zero");
		System.out.println("## after set(): elements LinkedList");
		System.out.println(l1);
		
		// Descending sort
		Collections.sort(l1);
		System.out.println("## Descending sort ");
		System.out.println(l1);
		
		// Ascending sort
		l1.sort(new Comparator<Object>() {
			public int compare(Object o1, Object o2) {
				return o2.toString().compareTo(o1.toString());
			}
		});
		
		System.out.println("## Ascending sort of l1");
		System.out.println(l1);
		
		// Ascending sort with stream api
		System.out.println("## Ascending sort with stream api");
		l1.stream().sorted((o1, o2) -> o2.toString().compareTo(o1.toString())).forEach(System.out::println);
	}

}
