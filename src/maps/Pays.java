package maps;

public class Pays {

	private String nom;
	private int nbHab;
	private String continent;
	/**
	 * @param nom
	 * @param nbHab
	 * @param continent
	 */
	public Pays(String nom, int nbHab, String continent) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.continent = continent;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the nbHab
	 */
	public int getNbHab() {
		return nbHab;
	}
	/**
	 * @return the continent
	 */
	public String getContinent() {
		return continent;
	}
	
}
