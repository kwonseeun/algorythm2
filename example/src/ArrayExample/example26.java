package ArrayExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class example26 {
	public static void main(String[] args) throws IOException {
		// BufferedReader 및 StringBuilder 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 반복할 갯수 및 반복할 문자열 선언
		int N = Integer.parseInt(br.readLine());
		String str;
		
		// N만큼 반복 
		for(int i = 0; i < N; i++) {
			// 문자열 입력
			str = br.readLine();
			
			// 입력한 문자열 하나씩 처리
			for(int j = 2; j < str.length(); j ++)
			{
				// 문자열 반복입력
				for(int k = 0; k < str.charAt(0) - 48; k++)
				{
					sb.append(str.charAt(j));
				}
			}
			
			// Enter처리
			sb.append("\n");
		}
		
		// 결과 출력
		System.out.print(sb);
	}
}
