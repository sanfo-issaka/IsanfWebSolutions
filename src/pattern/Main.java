package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = "Azebt";
		
		String regex = "z.*t?";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(input);
		
		if(matcher.matches()) {
			System.out.println("Correcte!");
		} else {
			System.out.println("Ne respecte pas l'expression regulière!");
		}
		
	}

}
