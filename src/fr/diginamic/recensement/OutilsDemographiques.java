package fr.diginamic.recensement;

import java.util.List;

/**
 * Classe qui offre des operations sur les listes de villes
 * 
 * @author Joseph
 *
 */

public class OutilsDemographiques {

	public static int calculerPopulation(List<Ville> villes) {
		int popTotale = 0;

		for (Ville ville : villes) {
			popTotale += ville.getPopulationTotale();
		}

		return popTotale;
	}
}
