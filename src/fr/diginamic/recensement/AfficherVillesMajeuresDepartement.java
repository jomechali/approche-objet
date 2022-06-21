package fr.diginamic.recensement;

import java.util.List;

/**
 * Classe qui implemente le service : afficher les 10 plus grandes villes d un
 * departement
 * 
 * @author Joseph
 *
 */
public class AfficherVillesMajeuresDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {

		String codeDepartement = view.getCodeDepartement();

		try {

			Departement departement = recensement.trouverDepartementParCode(codeDepartement);

			List<Ville> villes = departement.getVilles();

			villes.sort(new ComparatorPopulationVille());

			view.afficher("Les villes les plus peuplees du " + departement + " sont :");
			
			view.afficherCollection(villes.subList(Math.max(villes.size() - 11, 0), villes.size()));

		} catch (NullPointerException e) {

			System.err.println("departement non trouvé");
			return;
		}
	}

}
