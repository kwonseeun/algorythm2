package bubbleSort;

public class example01 {
	public static void main(String[] args) {
		int[] a = {254,3,213,64,75,56,4,324,65,78,9,5,76,3410,8,342,76};
		int b;
		for(int i = 0 ; i < a.length ; i ++) {
			for(int j = 0 ; j < a.length -i -1 ; j ++) { // 가장 큰 값이 맨 뒤로 간다 
				if(a[j]>a[j+1]) {
					b = a[j];
					a[j] = a[j+1];
					a[j+1] = b;
				}
			}
		}
		
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.print("," +a[i]);
		}
	}
}