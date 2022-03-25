package algorythm4;

import java.util.Arrays;

public class example04 {
	static int[] sorted = new int[8];
	public static void merge(int a[], int m,int middle, int n) {
		int i = m; // 첫 번째 부분집합의 시작 위치 설정 
		int j = middle+1; // 두 번째 부분집합의 시작 위치 설정 
		int k = m; // 배열 sorted에 정렬된 원소를 지정할 위치 설정 
		
		while (i<middle && j<=n) {
			if (a[i]<=a[j]) {
				sorted[k] = a[i];
				i++;
			}else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}
		if(i>middle) {
			for(int t=j; t<=n; t++ , k++) {
				sorted[k] = a[t];
			}
		
		}else {
			for (int t=i; t<=middle;t++,k++) {
				sorted[k] = a[t];
			}
		}
		for (int t = m; t<=n; t++) {
			a[t] = sorted[t];
		}
		System.out.println("병합 정렬 후:" +Arrays.toString(a));
	}
	
	public static void mergeSort(int a[], int m, int n) {
		int middle;
		if(m<n) {
			middle = (m+n)/2;
			mergeSort(a, m, middle);
			mergeSort(a, middle+1, n);
			merge(a, m, middle, n);
		}
	}
	public static void main(String[] args) {
		int[] list = {58,8,23,3,188,6,33,20};
		int size = list.length;
		System.out.println("정렬 수행 전 "+ Arrays.toString(list));
		System.out.println("====== 병합 정렬 수행 시작 =======");
		mergeSort(list, 0, size-1);
	}

}
