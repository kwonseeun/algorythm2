package algorythm;

public class example07 {
	public static void main(String[] args) {
	 //1~100, 3의 배수이면서 5의 배수 출력 
		for (int i = 1; i <=100; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println(i + "");
			}
		}
		System.out.println("");
	}
}
