package ATM;

import java.util.Scanner;

public class atm {

	public static void main(String[] args) {
		// *** ATM 시뮬레이터 ***
		// 1.잔액조회
		// 2.입금하기
		// 3.출금하기
		// 4.종료하기

		System.out.println("*** ATM 시뮬레이터 ***");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cost = 0;


		while(true) {
			System.out.println("---------------");
			System.out.println("1 . 잔 액 조  회");
			System.out.println("2 . 입 금 하 기");
			System.out.println("3 . 출 금 하 기");
			System.out.println("4 . 종 료 하 기");
			System.out.print(">> ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("---------------");
			if(num == 4) {
				System.out.println("==== 이용해주셔서 감사합니다. ====");
				break;
			}if(num == 1) {
				System.out.println("귀하의 잔액은 " + sum +" 원  입니다.");

			}else if(num == 2) {
				System.out.println("==== 얼마를  입금 하시겠습니까? ====");
				System.out.print(">> ");
				cost = Integer.parseInt(sc.nextLine());
				cost +=sum;
				System.out.println("정상적으로" + cost +"원 이 입금되었습니다.");
				sum = cost;
				System.out.println("귀하의 잔액은 총" + sum + " 원 입니다.");

			}else if(num == 3) {
				System.out.println("얼마를 출금 하시겠습니까?");
				System.out.print(">> ");
				cost=Integer.parseInt(sc.nextLine());
				cost -= sum;
				System.out.println("귀하의 잔액은 총 "+ sum + " 원 입니다.");
			}if(sum < cost) {
				System.out.println("귀 하 의 잔액이 부족합니다.");
			}else {
				System.out.println("==== 잘못 입력하셨습니다 확인 후 다시 입력해주세요. ====");
			}continue;
		}
	}
}
