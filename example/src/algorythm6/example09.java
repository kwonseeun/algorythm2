package algorythm6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**replaceAll 사용*/
public class example09 {
	public static void main(String[] args) throws IOException {		
		//BufferedReader를 사용하기 위해 throws IOException 예외처리 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// StringTokenizer 인자값에 문자열 추가 (한줄 읽기)
		int a = Integer.parseInt(st.nextToken()); //쪼개기 
		int b = Integer.parseInt(st.nextToken()); //쪼개기 

		
		System.out.println(a);
		System.out.println(b);

		
		br.close();
	}
}
  