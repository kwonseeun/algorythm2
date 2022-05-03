package algorythm;

import java.util.Scanner;

public class example13 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("구구단을 시작합니다.");
	boolean confirm = true;
	while (confirm) {
		System.out.println("실행할 단을 입력해주세요: ");		
		int dan = sc.nextInt();
		
		for (int i = 0; i <= 9; i++) {
			System.out.println(dan + "*" + i + "=" + dan * i );
		}
		System.out.println("계속 진행 - Y / 종료 - N");
		String sel = sc.next();
		if (sel.equals("n")) {
			confirm = false; 
		}
  	  }
		System.out.println("종료합니다.");
		sc.close();
   }
}