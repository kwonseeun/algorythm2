package algorythm5;

/** 반복문 12의 약수 구하기, 어떤 수를 나누어서 0으로 떨어진 수 */
public class example04 {
	public static void main(String[] args) {
		int num = 12;
		
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				System.out.println(i);
			}
		}
	}
	
}
