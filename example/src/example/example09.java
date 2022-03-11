package example;

import java.util.Arrays;

public class example09 {

	public static void main(String[] args) {
		String str = "hi this is split example";
		
		String[] result = str.split(" ");
		String[] result2 = str.split(" ", 2);
		String[] result3 = str.split(" ", 3);
		
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));
		System.out.println(Arrays.toString(result3));
	}
}
