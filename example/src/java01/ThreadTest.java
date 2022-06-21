package java01;

class MyThread extends Thread{
	
	public MyThread(String threadName){
		super(threadName);
	}
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(this.getName()+":"+i);
		}
		System.out.println();
	}
}
public class ThreadTest {

	public static void main(String[] ar){
		System.out.println("MainThread Start");
		for(int i=1;i<=3;i++){
			new MyThread("Thread"+i).start();
		}
		System.out.println("MainThread End");	
	}
	
}