package bubbleSort;

public class example05 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		System.out.println("정렬 전: ");
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 45);
			System.out.print("["+arr[i]+ "]");
		}
		System.out.println();
		
		// 여기까지가 정렬 전, 랜덤값 6개 뽑을 때 
		
		for (int z= 0; z < arr.length; z++) { // j는 몇 회전을 할 것인가 표기 
			for (int j = 0; j < arr.length-z-1; j++) { // j는 값을 비교하고 자리를 바꿔주는 역
				if (arr[j] > arr[j+1]) { // 만약 앞에 수가 뒤에 방 숫자보다 크다면 
					
					int temp = arr[j]; // 자리를 가뿨군다 
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		} // 회전 이후 모든 비교가 다 끝나면 
		
		System.out.println("\n 정럴 후: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("["+arr[i]+"]");
		}
	}

}
