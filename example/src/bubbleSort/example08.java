package bubbleSort;

import java.util.Scanner;

public class example08 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정렬할 요소의 수: ");
    
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        //요소 입력받음
        for(int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
                
        bubbleSort(arr, n);
                        
        System.out.println("버블 정렬 완료");
        
        //정렬 후 출력
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    static void bubbleSort(int[] arr, int n) {        
        //n개의 요소 -> n-1번 비교
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[j]<arr[i]) {
                    swap(arr, j, i);
                }
            }
        }
    }
    
    //배열의 요소 두개의 위치를 바꿈 
    static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1]=arr[idx2];    //idx1 : idx1 -> idx2
        arr[idx2]=tmp;            //idx2 : idx2 -> idx1
    }
}
