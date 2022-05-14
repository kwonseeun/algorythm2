package selectSort;

import java.util.Scanner;

public class example04 {	
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		
		int i, j, min, index, temp;
		
		for (int k = 0; k < 10; k++) {
			min = 9999;
			index = 0;
			for (j=k; j <10; j++) {
				if (min > arr[j]) {
					min = arr[j];
					index = j;
				}
			}
			temp = arr[k];
			arr[k] = arr[index];
			arr[index] = temp;
		}
		
		for (int k = 0; k < 10; k++) {
			System.out.println(arr[k] + "");
		}
	}
}
