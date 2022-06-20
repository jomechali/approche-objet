package fr.diginamic.recensement;

public class Ville {

	private int codeRegion;
	private String nomRegion;
	private String codeDepartement;
	private int codeCommune;
	private String nomCommune;
	private int populationTotale;
	/**
	 * @param codeRegion
	 * @param nomRegion
	 * @param codeDepartement
	 * @param codeCommune
	 * @param nomCommune
	 * @param populationTotale
	 */
	public Ville(int codeRegion, String nomRegion, String codeDepartement, int codeCommune, String nomCommune,
			int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}
	
	@Override
	public String toString() {
		return "Ville [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDepartement=" + codeDepartement
				+ ", codeCommune=" + codeCommune + ", nomCommune=" + nomCommune + ", populationTotale="
				+ populationTotale + "]";
	}

	/**
	 * @return the codeRegion
	 */
	public int getCodeRegion() {
		return codeRegion;
	}
	/**
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}
	/**
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
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
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}
	/**
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	/**
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
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
	
}
