package algorythm4;

public class example01 {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		int sum=0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		
		System.out.println("초기화된 배열 요소");
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + "");
			sum += num[i];
		};
		
		System.out.println();
		
		System.out.println("전체 배열 요소의 합: " + sum);
	}

}
