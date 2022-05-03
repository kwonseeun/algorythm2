package algorythm;

public class example01 {

	/** 배열을 이용한 로또 출력 */
	public static void main(String[] args) {
	 
		int[] score;
		score = new int[10];
		for (int i = 0; i < score.length; i++) {
			score[i] = i+1;
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] = i+1);
		}
	}
}