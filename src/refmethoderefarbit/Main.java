package refmethoderefarbit;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<String, String> reverser = StringUtils::reverse;
		String result = reverser.apply("Hello you :)");
		
		System.out.println(result);
		
	}

}
