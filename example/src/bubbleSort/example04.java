package bubbleSort;

public class example04 {

	public static void main(String[] args) {
		int temp = 0; // 값을 바꾸기 위해 담을 변수 : temp 선언 
		int a = 5;
		int b = 3;
		System.out.println("바꾸기 전: ["+a+"]"+"["+b+"]");
		
		temp = a ; // temp 에 a를 넣어준다.
		a = b;// b를 a에 넣어준다. a에 들어간 값 =b >> 즉 3 
		b = temp ; // temp를 b에 넣어준다. b에 들어간 값 => temp 즉 원래 a가 가지고 있떤 값 5
		
		System.out.println("바꾸 후: ["+a+"]"+"["+b+"]");
		
	}

}
