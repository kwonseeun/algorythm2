package algorythm5;

import java.util.Iterator;

public class example10 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10}; 
		//[0][1][2][3][4][5][6][7][8][9]
		//[0][0][0][0][0][0][0][0][0][0]
		
		for (int i = 0; i < arr.length-1; i++) {
		
			for (int j = 1; j < arr.length; j++) {
				if (i < j ) {
					
					System.out.println( "i의 arr["+i+"] "+ "j의 arr["+j+"] ");
				}
			}
		} 
		
	}
}

// arr[0] == 1  arr[1] +1 === 1
//????
//arr[1] == 1  arr[2] +1 === 3
//arr[2] == 3  arr[3] +1 === 4
//arr[3] == 4  arr[4] +1 === 5
//arr[4] == 5  arr[5] +1 === 6
//arr[5] == 6  arr[6] +1 === 7
//arr[6] == 7  arr[7] +1 === 8
//arr[7] == 8  arr[8] +1 === 9
//arr[8] == 9  arr[9] +1 === 10
