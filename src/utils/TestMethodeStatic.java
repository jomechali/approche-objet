package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {


		String chaine = "12";
		
		int chaineInt = Integer.parseInt(chaine);
		
		System.out.println(chaine + 4); // ici il y a conversion implicite de int vers string
		System.out.println(chaineInt + 4); // on verifie que c est bien un entier
		
		int a; int b;
		
		a = 25; b = 12;
		
		System.out.println("the max is " + Integer.max(a, b));

	}

}
