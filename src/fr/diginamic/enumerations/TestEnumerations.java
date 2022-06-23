package fr.diginamic.enumerations;

public class TestEnumerations {

	public static void main(String[] args) {


		for (Saison saison : Saison.values()) {
			System.out.println(saison);
		}
		
		String nom = "ETE";
		
		Saison saisonCorrespondante = Saison.valueOf(nom);

		System.out.println(saisonCorrespondante.getNom() + " " + saisonCorrespondante.getOrdre());
		
		String libelle = "Hiver";
		
		System.out.println(Saison.saisonParLibelle(libelle));
		
	}

}
