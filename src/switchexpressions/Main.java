package switchexpressions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		jourSemaine(1);
		jourSemaine(5);
		jourSemaine(10);
		
		System.out.println("************************************************\n\n");
		System.out.println(numPays("France"));
		System.out.println(numPays("Burkina"));
		System.out.println(numPays("Guadeloupe"));
		System.out.println(numPays("Canada"));
		
	}

	public static void jourSemaine(int j) {
		
		switch(j) {
			case 1:
				System.out.println("Lundi");
				break;
			case 2:
				System.out.println("Mardi");
				break;
			case 3:
				System.out.println("Mercredi");
				break;
			case 4:
				System.out.println("Jeudi");
				break;
			case 5:
				System.out.println("Vendredi");
				break;
			case 6:
				System.out.println("Samedi");
				break;
			case 7:
				System.out.println("Dimanche");
				break;
			default:
				System.out.println("Aucun jour!");
		}
		
	}
	
	/********************************************/
	
	public static int numPays(String nom) {
		
		int result = switch(nom) {
			case "France" -> 33;
			case "Burkina" -> 226;
			case "Guadeloupe" -> {
				int test = 0;//vient d'un API
				if(test == 0) {
					test = 590;
				}
				yield test;
			}
			default -> -1;
		};
		
		return result;
	}
	
}
