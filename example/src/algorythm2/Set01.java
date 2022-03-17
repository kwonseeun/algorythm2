package algorythm2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**타입 선언은 인터페이스 타입으로 하고 객체생성은 HashSet이나 LinkedHash Set를 사용  */
public class Set01 {

	public static void main(String[] args) {
		// create set
		Set<String> s1 = new HashSet<>();
		Set<String> s2 = Set.of("three","four");
		
		
		// add element to Set
		s1.addAll(Arrays.asList("one","two"));
		s1.addAll(s2);
		s1.add("five");
		s1.add("two");
		s1.remove("five");
		
		System.out.println("## element in set");
		System.out.println(s1);
		
		// print all elements using stream api
		s1.stream().forEach(System.out::println);
		
		System.out.println("## check exist element");
		System.out.println(s1.contains("one"));
		
		// create new LinkedHashSet and add element
		Set<String> lset = new LinkedHashSet<>();
		lset.addAll(Arrays.asList("one","two","three","four"));
		lset.add("five");
		
		System.out.println("\n## element in LinkedHashSet");
		System.out.println(lset);
		
		// get Iterator from LinkedHashSet
		System.out.println("## print element using");
		Iterator<String> iter = lset.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
