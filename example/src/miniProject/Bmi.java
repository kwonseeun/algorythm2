package miniProject;

import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		// 신체 지표판정(BMI) 자신의 몸무게를 키의 제곱으로 나눈다.
		// 몸무게(kg)와 키(cm)의 String 데이터를 받는다.
				
				// 입력 객체를 선언하고 생성(new)해서 넣는다.
				Scanner scanner = new Scanner(System.in);
				
				// 초기 화면 입력
				System.out.println("BMI 계산기");
				
				// 몸무게 입력을 받는 문구 출력
				System.out.print("몸무게를 입력하시오. ");
				
				// String 변수 weight을 선언하고 입력받은 값을 저장 (몸무게)
				String weight = scanner.nextLine();
				
				// 키(신장)의 입력을 받는 문구 출력
				System.out.print("키를 입력하시오. ");
				
				// String 변수 height을 선언하고 입력받은 값을 저장 (키)
				String height = scanner.nextLine();
				
		// String -> double
				
				// 입력받은 값(weight)의 타입(String)을 double 타입으로 변환한다.
				double w = Double.parseDouble(weight);
				
				// 입력받은 값(height)의 타입(String)을 double 타입으로 변환한다.
				double h = Double.parseDouble(height);
				
				// bmi 계산을 위해 입력받은 신장을 미터(m)단위로 바꿔준다.
				h /= 100;
				
		//BMI 공식을 이용하여 지수를 계산한다.(* / 를 이용)
				
				// BMI수치를 계산하고 double타입 변수로 저장한다.
				double bmi = w / (h * h);
				
				// bmi 의 소숫점을 2자리 까지만 표현한다. (반올림x)
				bmi = (int)(bmi*100)/100.0;
				
		//BMI 지표에 따른 판정을 해낸다. 키와 몸무게를 출력하고 BMI 지수와 판정을 출력한다.

		// 저체중 20미만 // 정상 20.00 ~ 24.00 // 과체중 24.01 ~ 29.00 // 비만 29.01 ~
				
	}
}
