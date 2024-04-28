package thread;

public class MyObject {

	public synchronized void synchronizedMethod() {
		
		System.out.println(Thread.currentThread().getName() + " Entrée dans la méthode");
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " Sortie dans la méthode");
		
	}
	
}
