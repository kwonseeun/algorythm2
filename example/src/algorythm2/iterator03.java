package algorythm2;

import java.util.ArrayList;
import java.util.ListIterator;

public class iterator03 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		System.out.println("while문 지나기 전 리스트에 들어있던 값" + list);
		
	ListIterator<String> listIterator = list.listIterator();
	while (listIterator.hasNext()) {
		Object element = listIterator.next();
		listIterator.set(element + "+");
	}
	System.out.println("while문을 지난 후 수정된 결과" + list);
	
	//리스트에 들어있는 값을 역순으로 표시
	System.out.println("역순 출력 결과");
	while (listIterator.hasPrevious()) {
		
		Object element = listIterator.previous();
		System.out.println(element + " " );
		}
	}
}
