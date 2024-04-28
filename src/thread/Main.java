package thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyObject obj1 = new MyObject();
		MyObject obj2 = new MyObject();
		
		
		Thread thread1 = new Thread(() -> {
			obj1.synchronizedMethod();
		}, "Thread-1");
		
		Thread thread2 = new Thread(() -> {
			obj2.synchronizedMethod();
		}, "Thread-2");
		
		thread1.start();
		thread2.start();
		
	}

}
