package fr.diginamic.recensement;

import java.util.List;

/**
 * Classe qui implemente le service : afficher les 10 plusu grandes villes de
 * France
 * 
 * @author Joseph
 *
 */
public class AfficherPlusGrandesVillesDeFrance extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {

		List<Ville> villes = recensement.getVilles();

		villes.sort(new ComparatorPopulationVille());

		view.afficher("Les plus grandes villes de France sont :");

		view.afficherCollection(villes.subList(Math.max(villes.size() - 11, 0), villes.size()));
	}

}
