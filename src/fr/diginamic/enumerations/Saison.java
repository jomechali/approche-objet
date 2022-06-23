package fr.diginamic.enumerations;

public enum Saison {

	PRINTEMPS("Printemps", 1), ETE("Ete", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	private String nom;
	private int ordre;

	/**
	 * @param nom
	 * @param ordre
	 */
	private Saison(String nom, int ordre) {
		this.nom = nom;
		this.ordre = ordre;
	}

	/**
	 * @param libelle
	 * @return
	 */
	public static Saison saisonParLibelle(String libelle) {
		Saison[] saisons = Saison.values();
		int index = 0;

		while (index < saisons.length && !(saisons[index].nom.equals(libelle))) {
			index++;
		}

		return (saisons[index].nom.equals(libelle)) ? saisons[index] : null;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the ordre
	 */
	public int getOrdre() {
		return ordre;
	}

}
