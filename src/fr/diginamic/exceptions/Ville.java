package fr.diginamic.exceptions;

public class Ville {
	
	private int hab;
	private String nom;
	/**
	 * @param hab
	 * @param nom
	 */
	public Ville(int hab, String nom) {
		super();
		this.hab = hab;
		this.nom = nom;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ville [hab=");
		builder.append(hab);
		builder.append(", nom=");
		builder.append(nom);
		builder.append("]");
		return builder.toString();
	}

}