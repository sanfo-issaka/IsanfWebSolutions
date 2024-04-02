package string3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String var1 = "Les JO ";
		String var2 = "2024";
		System.out.println(var1.concat(var2));
		System.out.println(var1);
		
	/***********************************************************/
		System.out.println("************************************************************");
		StringBuilder variable1 = new StringBuilder();
		variable1.append("Europe ");
		System.out.println("Valeure initiale : "+variable1.toString());
		variable1.append(var1);
		variable1.append(var2);
		System.out.println("Valeure finale : "+variable1.toString());
		
	/************************************************************/
		System.out.println("************************************************************");
		StringBuffer variable2 = new StringBuffer();
		variable2.append("Europe ");
		System.out.println("Valeure initiale : "+variable2.toString());
		variable2.append(var1);
		variable2.append(var2);
		System.out.println("Valeure finale : "+variable2.toString());
	}

}
