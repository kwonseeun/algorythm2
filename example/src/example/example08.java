package example;

import java.util.Arrays;

public class example08 {

	public static void main(String[] args) {
		String str = "apple banana orange grape";
		
		String[] strArr = str.split("\\s");
		
		System.out.println(Arrays.toString(strArr));
	}
}
