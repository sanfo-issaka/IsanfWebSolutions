package threadlocal;

public class Main {

	private static ThreadLocal<Integer> threadLocalValue = new ThreadLocal<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		threadLocalValue.set(43);
		
		Thread thread1 = new Thread(() -> {
			threadLocalValue.set(44);
			System.out.println("Thread 1 : "+threadLocalValue.get());
		});
		
		Thread thread2 = new Thread(() -> {
			threadLocalValue.set(45);
			System.out.println("Thread 2 : "+threadLocalValue.get());
		});
		
		thread1.start();
		thread2.start();
		
		
		System.out.println("Thread global : "+threadLocalValue.get());
		
	}

}
