package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> strList = new ArrayList<>();
		
		strList.add("Apple");
		strList.add("Amazon");
		strList.add("Meta");
		strList.add("Microsoft");
		strList.add("Google");
		
		
		System.out.println("List Avant tri :");		
		strList.forEach(val -> {
			System.out.println(val);
		});
		
		System.out.println("\n\n\nList après tri :");
		
		Collections.sort(strList);
		strList.forEach(val -> {
			System.out.println(val);
		});
	}

}
