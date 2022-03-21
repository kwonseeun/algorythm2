package algorythm3;

/** 0부터 10까지 더한값을 출력하고 홀수인 값만 더하기*/
public class example08 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10 ; i++) {
			if (i%2==1) {
				sum += i;
			}
		}
		System.out.println("더한 총 값 " + sum );
	}

}
