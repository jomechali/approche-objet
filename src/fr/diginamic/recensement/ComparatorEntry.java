package fr.diginamic.recensement;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Classe pour trier une HashMap (zone demographique, nombre d habitants) par valeurs decroissantes
 * @author Joseph
 *
 */
public class ComparatorEntry implements Comparator<Map.Entry<ZoneDemographique, Integer>> {

	@Override
	public int compare(Entry<ZoneDemographique, Integer> o1, Entry<ZoneDemographique, Integer> o2) {
		return -1 * (o1.getValue() - o2.getValue());
	}

}
