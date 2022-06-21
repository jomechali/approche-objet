package fr.diginamic.recensement;

import java.util.Comparator;

/**
 * Comparator pour trier les villes en fonction du nom de leur region, puis de
 * leur departement
 * 
 * @author Joseph
 *
 */
public class ComparatorRegion implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		int comparaisonNomRegion = o1.getNomRegion().compareTo(o2.getNomRegion());
		int comparaisonCodeDepartement = o1.getCodeDepartement().compareTo(o2.getCodeDepartement());
		return (comparaisonNomRegion != 0) ? comparaisonNomRegion : comparaisonCodeDepartement;
	}

}
