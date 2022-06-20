package fr.diginamic.recensement;

/**
 * Classe implementant le service : rechercher la population totale d un
 * departement
 * 
 * @author Joseph
 *
 */

public class RechercherPopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {

		view.afficher("Entrer le code du departement : ");

		String codeDepartement = view.getEntreeUtilisateur();

		try {
			int popTotale = recensement.trouverDepartementParCode(codeDepartement).populationTotale();

			view.afficher("la population du departement %s est de %d".formatted(codeDepartement, popTotale));

		} catch (NullPointerException e) {

			System.err.println("departement non trouv�");
			return;
		}
	}

}
