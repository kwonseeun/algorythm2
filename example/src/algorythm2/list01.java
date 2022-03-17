package algorythm2;

import java.util.ArrayList;
import java.util.LinkedList;

public class list01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		LinkedList<String> list2 = new LinkedList<String>();
		
		list2.add("E");
		list.add("A");
		list.add("B");
		list.add("C");
		list.add(0,"D"); // 0번째에 D값을 추가, 동일한값 없으면 밀어낸다.
		System.out.println("list값 확인 " + list);
		System.out.println("list 인덱스 확인 " + list.get(0));
	}

}
