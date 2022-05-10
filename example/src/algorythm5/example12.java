package algorythm5;

import java.util.Arrays;
import java.util.Collections;

public class example12 {

	public static void main(String[] args) {
		String word = "ABCDEF";
		String[] array_world; // 스트링을 담을 배열 
		
		array_world= word.split(""); //배열에 한글자씩 저장하
		
		for (int i = 0; i < array_world.length; i++) {
			System.out.println(array_world[i]);
		}
	}

}
