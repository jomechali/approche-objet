package fr.diginamic.recensement;

import java.util.List;

public class AfficherVillesMajeuresDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {

		view.afficher("Entrer le code du departement : ");

		String codeDepartement = view.getEntreeUtilisateur();

		try {
			
			Departement departement = recensement.trouverDepartementParCode(codeDepartement);

			List<Ville> villes = departement.getVilles();

			villes.sort(new ComparatorPopulationVille());

			view.afficher("Les villes les plus peuplees du " + departement + " sont :");
			for (int i = 0; i < 10; i++) {
				view.afficher(villes.get(villes.size() - 1 - i).toString());
			}

		} catch (NullPointerException e) {

			System.err.println("departement non trouvé");
			return;
		}
	}

}
