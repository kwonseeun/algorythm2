package algorythm6;

public class example04 {

	public static void main(String[] args) {

        String  str = "자동차 가격은 300,000,000원 입니다.";
        str = str.replaceAll("[0-9]", "A");
        System.out.println(str); // 결과 : 자동차 가격은 AAA,AAA,AAA원 입니다.

        String str2 = "자동차 가격은 300,000,000원 입니다.";
        str2 = str2.replaceAll("자동차", "CAR");
        System.out.println(str2); // 결과 : CAR 가격은 300,000,000원 입니다.
    }

}
