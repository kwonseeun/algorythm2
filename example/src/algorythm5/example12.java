package algorythm5;

import java.util.Scanner;

public class example12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력해주세요:");
		String word =sc.next();
		
		String[] array_word = new String[word.length()]; //스트링을 담을 배열 
		String result = ""; // 출력할 스트링변수 
		
		for (int i = 0; i < array_word.length; i++) { //string 한글자씩 끊어 배열에 저장 
			array_word[i]=Character.toString(word.charAt(i));
		}
		
		for (int i = array_word.length-1; i>=0; i--) {
			result+=array_word[i];
		}
		
		System.out.println(result);
		
	}

}
