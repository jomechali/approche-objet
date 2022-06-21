package fr.diginamic.recensement;

import java.util.Comparator;

/**
 * Comparator pour trier des villes en fonction de leur nombre d habitants
 * 
 * @author Joseph
 *
 */
public class ComparatorPopulationVille implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		return o1.getPopulationTotale() - o2.getPopulationTotale();
	}

}
