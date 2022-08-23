package algorythm7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class example21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		DecimalFormat df = new DecimalFormat("##.00");
		
		int kor = sc.nextInt();
		int mat = sc.nextInt();
		int eng = sc.nextInt();
		
		double sum = (double)(kor+mat+eng)/3.0;
		
		if (sum >= 90) {
			System.out.println(df.format(sum) + " A");
		} else if (sum >= 80) {
			System.out.println(df.format(sum)+ " B");
		} else if (sum >= 70) {
			System.out.println(df.format(sum) + " C");
		} else if (sum >= 60) {
			System.out.println(df.format(sum) + " D");
		} else {
			System.out.println(df.format(sum) + " F");
		}
		
		sc.close();
	}

}
