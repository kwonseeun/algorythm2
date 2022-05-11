package algorythm5;

/**2016년1월1일은 금요일이다. 2016년 a월 b일은 무슨 요일일까? 
 * 두 수를 a,b 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수 
 * solution을 완성하시오, */
public class example13 {
	public static String solution(int a, int b) {
	
		String answer ="TUE";
		
		int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		String[] date = {"FRI","SAT","SUN", "MON", "TUE", "WED", "THU"};
		
		int clac = 0; 
		
		
		if (a > 0) {
			for (int i = 0; i < a-1; i++) {
				clac += days[i];
			}	
		}
		clac +=(b-1);
		answer = date [(clac%7)];
		return answer;
	}
	
	public static void main(String[] args) {
		example13 e = new example13();
		
		System.out.println(e.solution(5, 24));
	}
}
