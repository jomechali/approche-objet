package fr.diginamic.enumerations;

public enum Continent {

	EUROPE("Europe"),
	ASIE("Asie"),
	OCEANIE("Oceanie"),
	AFRIQUE("Afrique"),
	AMERIQUE("Amerique");

	private String libelle;

	/**
	 * @param libelle
	 */
	private Continent(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
}
