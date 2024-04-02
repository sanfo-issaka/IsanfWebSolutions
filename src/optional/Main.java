package optional;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = null;
		
		Optional<String> optionalStr = Optional.ofNullable(str);
		
		if(optionalStr.isPresent()) {
			System.out.println("Valeur présente : "+optionalStr.get());
		} else {
			System.out.println("Valeur absente!");
		}
	}

}
