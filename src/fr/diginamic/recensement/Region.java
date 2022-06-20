package fr.diginamic.recensement;

import java.util.List;

public class Region extends ZoneDemographique {
	
	private int code;
	private String nom;
	
	/**
	 * @param villes
	 * @param code
	 * @param nom
	 */
	public Region(List<Ville> villes, int code, String nom) {
		super(villes);
		this.code = code;
		this.nom = nom;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}
		
		if(!(obj instanceof Region)) {
			return false;
		}
		return code == ((Region) obj).code;
	}
	
	@Override
	public String toString() {
		return "Region [code=" + code + ", nom=" + nom + "]";
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

}
