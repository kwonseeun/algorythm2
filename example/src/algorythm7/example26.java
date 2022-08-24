package algorythm7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example26 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(); // 입력받은 문자열을 저장할 변수
		//String str = "103하8811 차량의 등록일 2022-11-11 완료일 2023-12-22";
		
		// 1번째 방식
		int firstIdx = str.indexOf("등록일"); //등록일이 나오는 시작 인덱스 구하기
		int lastIdx = str.indexOf("완료일"); // 완료일의 시작인덱스 구하기
		
		//등록일 은 빼야하니까 firstIdx +4해주기 (안해주면 등록일도 나와)
		for(int i = firstIdx+4; i <lastIdx; i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	
		
	}

}
