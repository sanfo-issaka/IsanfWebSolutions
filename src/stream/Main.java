package stream;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> stream = Stream.of("apple", "banana", "orange", "grape");
		
		boolean anyMatch = stream.anyMatch(s -> s.startsWith("z"));
		
		if(anyMatch) {
			System.out.println("Au moins une valeur correspond");
		} else {
			System.out.println("Aucune valeur correspond");
		}
		
	}

}
