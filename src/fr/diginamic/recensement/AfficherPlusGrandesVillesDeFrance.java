package fr.diginamic.recensement;

import java.util.List;

public class AfficherPlusGrandesVillesDeFrance extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {

		List<Ville> villes = recensement.getVilles();

		villes.sort(new ComparatorPopulationVille());

		view.afficher("Les plus grandes villes de France sont :");
	
		for (int i = 0; i < 10; i++) {
			view.afficher(villes.get(villes.size() - 1 - i).toString());
		}
	}

}
