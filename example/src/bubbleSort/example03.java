package bubbleSort;

public class example03 {

	public static void main(String[] args) {
		int[] wesleyArr = new int[10];
		for (int i = 0; i < wesleyArr.length; i++) {
			wesleyArr[i] = (int)(Math.random()*10);
			System.out.println(wesleyArr[i]);
		}
		System.out.println();
		for (int i = 0; i < wesleyArr.length-1; i++) {
			boolean change = false;

			for (int j = 0; j < wesleyArr.length-1-i; j++) {
				if (wesleyArr[j] > wesleyArr[j+1]) {
					int temp = wesleyArr[j];
					wesleyArr[j] = wesleyArr[j+1];
					wesleyArr[j+1] = temp;
					change = true;
				}// end if 
			}// end j for 
			if (!change)break; 
			for (int k = 0; k < wesleyArr.length; k++) {
				System.out.println(wesleyArr[k]);
			}  
			System.out.println();
		
		}
	}
}