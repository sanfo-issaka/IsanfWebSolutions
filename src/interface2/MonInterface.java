package interface2;

public interface MonInterface {
	void method1();
	
	default void method2() {
		System.out.println("Ceci est une méthode par défaut");
	}
	
	static void method3() {
		System.out.println("Ceci une méthode statique");
	}
}
