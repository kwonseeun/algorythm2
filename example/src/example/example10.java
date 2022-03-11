package example;

import java.util.Arrays;

public class example10 {

	public static void main(String[] args) {
		String str = "this island is beautiful";
		
		String [] result = str.split("is");
		String [] result2 = str.split("\\bis\\b");
		
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result2));
	}

}
