package threading;

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("hello");
		}
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println("Hy...");
		}
	}
}
public class Threading {
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		MyThread2 thread2 = new MyThread2();
		thread1.start();
		thread2.start();
	}
	
}
