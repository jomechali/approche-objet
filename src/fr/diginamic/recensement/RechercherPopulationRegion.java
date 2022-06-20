package fr.diginamic.recensement;

/**
 * Classe qui implemente le service rechercher la population totale d une region
 * 
 * @author Joseph
 *
 */
public class RechercherPopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {

		view.afficher("Entrer le code de la region ou le nom de la region");

		String entreeUtilisateur = view.getEntreeUtilisateur();
		try {

			int populationTotale = 0;
			try {
				int codeRegion = Integer.parseInt(entreeUtilisateur);

				populationTotale = recensement.trouverRegion(codeRegion).populationTotale();

			} catch (NumberFormatException e) {

				populationTotale = recensement.trouverRegion(entreeUtilisateur).populationTotale();

			}
			view.afficher("La population de la region " + entreeUtilisateur + " est de " + populationTotale);

		} catch (NullPointerException e) {

			System.err.println("région non trouvée");
			return;
		}

	}

}
