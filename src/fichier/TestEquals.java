package fichier;

public class TestEquals {

	public static void main(String[] args) {

		Ville v1 = new Ville("v1", "code v1", "region v1", 1);
		Ville v2 = new Ville("v1", "code v1", "region v1", 1);

		Ville v3 = new Ville("v3", "code v3", "region v3", 3);
		Ville v4 = v1;

		System.out.println("v1 equals v2 ? " + v1.equals(v2));
		System.out.println("v1 equals v3 ? " + v1.equals(v3));
		
		System.out.println("v1 == v2 ? " + (v1 == v2));
		System.out.println("v1 == v3 ? " + (v1 == v3));
		
		System.out.println("v1 == v4 ? " + (v1 == v4));
	}

}
