package fr.diginamic.enumerations;

public class Ville {
	
	private int hab;
	private String nom;
	private Continent continent;
	/**
	 * @param hab
	 * @param nom
	 * @param continent
	 */
	public Ville(int hab, String nom, Continent continent) {
		super();
		this.hab = hab;
		this.nom = nom;
		this.continent = continent;
	}
	/**
	 * @return the hab
	 */
	public int getHab() {
		return hab;
	}
	/**
	 * @param hab the hab to set
	 */
	public void setHab(int hab) {
		this.hab = hab;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the continent
	 */
	public Continent getContinent() {
		return continent;
	}
	/**
	 * @param continent the continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "Ville [hab=" + hab + ", nom=" + nom + ", continent=" + continent + "]";
	}
	

}