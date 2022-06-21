package fr.diginamic.recensement;

/**
 * Represente une ville
 * 
 * @author Joseph
 *
 */
public class Ville {

	private int codeCommune;
	private String nomCommune;
	private int populationTotale;

	private Region region;
	private Departement departement;

	/**
	 * @param codeCommune
	 * @param nomCommune
	 * @param populationTotale
	 */
	public Ville(int codeCommune, String nomCommune, int populationTotale) {
		super();
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}

	@Override
	public String toString() {
		return "Ville [codeCommune=" + codeCommune + ", nomCommune=" + nomCommune + ", populationTotale="
				+ populationTotale + ", getCodeRegion()=" + getCodeRegion() + ", getNomRegion()=" + getNomRegion()
				+ ", getCodeDepartement()=" + getCodeDepartement() + "]";
	}

	/**
	 * @return the codeRegion
	 */
	public int getCodeRegion() {
		return region.getCode();
	}

	/**
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return region.getNom();
	}

	/**
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return departement.getCode();
	}

	/**
	 * @return the codeCommune
	 */
	public int getCodeCommune() {
		return codeCommune;
	}

	/**
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/**
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}

	/**
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
	}

	/**
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/**
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

	/**
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * @return the departement
	 */
	public Departement getDepartement() {
		return departement;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}

	/**
	 * @param departement the departement to set
	 */
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

}
