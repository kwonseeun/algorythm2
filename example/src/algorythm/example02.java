package algorythm;

public class example02 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("i  바깥쪽 ");
			for (int j= 1;  j < 3; j++) {
					System.out.println("j 안쪽 ");
			}
			System.out.println("안쪽 j 반복 ");
		}
		System.out.println("안쪽 i 반복끝 ");
	}
}

