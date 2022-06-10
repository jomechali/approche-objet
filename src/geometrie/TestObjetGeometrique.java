package geometrie;

public class TestObjetGeometrique {

	public static void main(String[] args) {

		ObjetGeometrique[] objetsGeometriques = new ObjetGeometrique[2];
		
		objetsGeometriques[0] = new Cercle(2.3);
		objetsGeometriques[1] = new Rectangle(5.1, 6.2);
		
		for (int i = 0; i < objetsGeometriques.length; i++) {
			ObjetGeometrique objetGeometriqueActuel = objetsGeometriques[i];
			
			System.out.println("perimetre = " + objetGeometriqueActuel.perimetre() + "; surface = " + objetGeometriqueActuel.surface());
		}

	}

}
