package algorythm;

import java.util.Scanner;

public class example08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행 하시겠습니까 ? Y/ N ");
		String sel = sc.nextLine();
		
		if (sel.equals("Y") || sel.equals("y")) {
			System.out.println("실행할 단을 입력해주세요 ");
			int dan = sc.nextInt();

				for (int j = 1; j <= 9 ; j++) {
					System.out.println(dan + " * " + j + " = " + dan * j);
				}
		} else {
			System.out.println("다시 입력해주세요.");
		}
	}
}
