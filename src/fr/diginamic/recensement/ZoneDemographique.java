package fr.diginamic.recensement;

import java.util.List;

/**
 * Classe generique pour designer un regroupement de villes
 * 
 * @author Joseph
 *
 */
public class ZoneDemographique {

	private List<Ville> villes;

	/**
	 * @param villes
	 */
	public ZoneDemographique(List<Ville> villes) {
		super();
		this.villes = villes;
	}

	/**
	 * Ajoute une ville
	 * 
	 * @param nouvelleVille
	 */
	public void ajouterVille(Ville nouvelleVille) {
		villes.add(nouvelleVille);
	}

	/**
	 * Calcule la population totale
	 * 
	 * @return
	 */
	public int populationTotale() {

		int popTotale = 0;

		for (Ville ville : villes) {
			popTotale += ville.getPopulationTotale();
		}
		return popTotale;
	}

	/**
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

}
