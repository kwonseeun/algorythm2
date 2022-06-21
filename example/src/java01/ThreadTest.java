package java01;


public class ThreadTest {

	public static void main(String[] ar){
		System.out.println("MainThread Start");
		for(int i=1;i<=3;i++){
			new MyThread("Thread"+i).start();
		}
		System.out.println("MainThread End");	
	}
	
}