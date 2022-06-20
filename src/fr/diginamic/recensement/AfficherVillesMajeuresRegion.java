package fr.diginamic.recensement;

import java.util.List;

public class AfficherVillesMajeuresRegion extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {

		view.afficher("Entrer le code de la region ou le nom de la region");

		String entreeUtilisateur = view.getEntreeUtilisateur();
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
			
			for (int i = 0; i < 10; i++) {
				view.afficher(villes.get(villes.size() - 1 - i).toString());
			}

		} catch (NullPointerException e) {

			System.err.println("région non trouvée");
			return;
		}
	}

}
