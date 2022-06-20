package fr.diginamic.recensement;

/**
 * Classe qui implemente le service rechercher la population totale d une region
 * @author Joseph
 *
 */
public class RechercherPopulationRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {

		view.afficher("Entrer le code de la region ou le nom de la region");

		String entreeUtilisateur = view.getEntreeUtilisateur();

		int populationTotale = 0;
		try {
			int codeRegion = Integer.parseInt(entreeUtilisateur);

			populationTotale = OutilsDemographiques.calculerPopulation(recensement.villesDansRegion(codeRegion));

		} catch (NumberFormatException e) {

			populationTotale = OutilsDemographiques
					.calculerPopulation(recensement.villesDansRegion(entreeUtilisateur));

		}
		
		view.afficher("La population de la region " + entreeUtilisateur + " est de " + populationTotale);

	}

}
