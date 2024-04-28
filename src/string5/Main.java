package string5;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is a string\nThis is the next line.\nHello world.";
		
		Stream<String> strStream = str.lines();
		
		strStream.forEach(strVar -> {
			System.out.println(strVar);
		});
		
		System.out.println("*************************************************");
		
		String[] strTableau = str.split("\n");
		
		for(String strVari : strTableau) {
			System.out.println(strVari);
		}
	}

}
