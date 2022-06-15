package miniProject;

import java.util.Scanner;

public class jap {
	public static final int MAX = 10; //메뉴의 최대 개수 
	
	// 전역변수 선언
	static String[] box = new String[MAX];
	static int[] price = new int[MAX];
	static int[] stock = new int[MAX];
	static int count = 3; // 메뉴의 개수 
	static int admin = 1004; // 관리자 메뉴로 가는 비밀번호 
	static int profit = 0; // 총 수익 
	static Scanner sc = new Scanner(System.in);
	
	// 처음 자판기를 초기화 하는 함수
	public static void initialize() {
		box[0] = "장미";
		price[0] = 500;
		stock[0] = 3;
		box[1] = "프리지아";
		price[1] = 1000;
		stock[1] = 3;
		box[2] = "국화";
		price[2] = 3000;
		stock[2] = 3;
			
		
		
	}
}
