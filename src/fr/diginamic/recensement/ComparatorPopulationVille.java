package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorPopulationVille implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		return o1.getPopulationTotale() - o2.getPopulationTotale();
	}

}
