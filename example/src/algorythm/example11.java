package algorythm;

public class example11 {

	/** 버블정렬 알고리즘 */
	public static void main(String[] args) {
		
		int[] arr = {39,24,41,52,10};
		
		System.out.println("정렬 전 ");
		for (int i : arr) 
		{
			System.out.print(i + " ");
		}
		System.out.println("\n 정렬 후 ");
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = 0; j < arr.length-1-i; j++) 
			{
				if (arr[j] > arr[j+1]) 
				{
					int temp=arr[i];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
}
