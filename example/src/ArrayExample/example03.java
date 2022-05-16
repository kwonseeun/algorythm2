package ArrayExample;

/**1~100000 사이 모든 소수들을 찾아서 출력하라 */
public class example03 {

	public static void main(String[] args) {
		//1은 소수가 아니다 
		for(int n = 2; n < 100000; n++) {
		
		boolean isPrime = true;

		// n 이 소수인지 아닌지 판별 	
		for (int i = 2; i <= 2/n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}	

		if(isPrime == true)
			System.out.println(n);
		}
	}
}
