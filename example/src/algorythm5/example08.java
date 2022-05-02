package algorythm5;

/**1에서 20까지의 정수 중 2와 3의 배수가 아닌 수를 더하기*/
public class example08 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 20; i++) {
			sum += (i % 2 == 0 || i % 3 == 0 ) ? 0 : i;
		}
		System.out.println("2의 배수도 3의 배수도 아닌 수의 합 " + sum);
		
	}

}
