package fr.diginamic.recensement;

import java.util.List;

public class ZoneDemographique {
	
	private List<Ville> villes;

	/**
	 * @param villes
	 */
	public ZoneDemographique(List<Ville> villes) {
		super();
		this.villes = villes;
	}
	
	public void ajouterVille(Ville nouvelleVille) {
		villes.add(nouvelleVille);
	}
	
	public int populationTotale() {
		return OutilsDemographiques.calculerPopulation(villes);
	}

	/**
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}


}
