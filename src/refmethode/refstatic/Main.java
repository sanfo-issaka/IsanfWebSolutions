package refmethode.refstatic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operation addition = MathUtil::add;
		int result = addition.operate(2, 5);
		System.out.println(result);
		
	}

}
