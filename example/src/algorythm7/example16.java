package algorythm7;

import java.util.Random;

public class example16 {
	public static void main(String[] args) {
		int[] lotto = new int[6]; // 로또번호 6개 추출 
		int cnt = 0;
		Random random = new Random();
		
		System.out.println("로또번호 생성: ");
		
		// 로또 랜덤 추천 
		while(cnt < 6) {
			lotto[cnt] = random.nextInt(45)+1; // 45번까지 
			for (int i = 0; i < cnt; i++) {
				if (lotto[i] == lotto[cnt]) { // 중복된 숫자가 있으면 
					cnt -- ; // 중복된 숫자 제거 
					continue; //while문의 처음으로 돌아가 증감식을 수행 
				}
			}
			cnt++; // 계속추첨 
		}
	}
}
