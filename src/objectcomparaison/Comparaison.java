package objectcomparaison;

import java.util.Objects;

public class Comparaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comparaison comparaison = new Comparaison();
		
		Pays var1 = comparaison.new Pays("France", 33);
		Pays var2 = var1;
		Pays var3 = comparaison.new Pays("France", 33);
		
		//Comparaison référence
		System.out.println("************************Comparaison référence : ");
		System.out.println(var2 == var1);
		System.out.println(var3 == var1);
		
		//Comparaison valeur
		System.out.println("************************Comparaison valeur : ");
		System.out.println(var2.equals(var1));
		System.out.println(var3.equals(var1));
		
		//Comparaison hashCode
		System.out.println("************************Comparaison hashCode : ");
		System.out.println(var2.hashCode() == var1.hashCode());
		System.out.println(var3.hashCode() == var1.hashCode());
	}

	public class Pays{
		
		private String nom;
		private int code;
		
		public Pays(String nom, int code) {
			this.nom = nom;
			this.code = code;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}
		
		@Override
		public boolean equals(Object o) {
			if(this == o) return true;
			if(o == null || getClass() != o.getClass()) return false;
			Pays pays = (Pays)o;
			return nom.equals(pays.nom) && code == pays.code;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(nom, code);
		}
	}
}
