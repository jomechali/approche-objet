package fr.diginamic.recensement;

import java.util.List;

/**
 * Classe qui implemente le service : afficher les 10 plus grandes villes d une
 * region
 * 
 * @author Joseph
 *
 */
public class AfficherVillesMajeuresRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {

		String entreeUtilisateur = view.getRegion();
		try {

			Region region;
			try {
				int codeRegion = Integer.parseInt(entreeUtilisateur);

				region = recensement.trouverRegion(codeRegion);

			} catch (NumberFormatException e) {

				region = recensement.trouverRegion(entreeUtilisateur);
			}

			List<Ville> villes = region.getVilles();
			villes.sort(new ComparatorPopulationVille());

			view.afficher("Les villes les plus peuplees de la " + region + " sont :");

			view.afficherCollection(villes.subList(Math.max(villes.size() - 11, 0), villes.size()));

		} catch (NullPointerException e) {

			System.err.println("région non trouvée");
			return;
		}
	}

}
