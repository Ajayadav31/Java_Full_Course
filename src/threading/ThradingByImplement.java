package threading;

class Thread1 implements Runnable{
	public void run() {
		for(int i = 1;i<10;i++) {
			System.out.println("Shubh Diwali");
		}
	}
}
class Thread2 implements Runnable{
	public void run() {
		for(int j=1;j<10;j++) {
			System.out.println("HAppy Diawli");
		}
	}
}
public class ThradingByImplement {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread th1 = new Thread(t1);
		Thread2 t2 = new Thread2();
		Thread th2 = new Thread(t2);
		th1.start();
		th2.start();
	
	}

}
