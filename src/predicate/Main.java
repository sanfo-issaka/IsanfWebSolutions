package predicate;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> estPair = n -> n%2 == 0;
		
		System.out.println(estPair.test(5));
		System.out.println(estPair.test(10));
		
	}

}
