package refmethode.refinstance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Greeter greeter = new Greeter();
		Greeting greeting = greeter::sayHello;
		greeting.greet();
		
	}

}
