package fr.diginamic.recensement;

import java.util.List;

public class Departement extends ZoneDemographique {

	private String code;

	/**
	 * @param villes
	 * @param code
	 */
	public Departement(List<Ville> villes, String code) {
		super(villes);
		this.code = code;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}
		
		if(!(obj instanceof Departement)) {
			return false;
		}
		return code.equals(((Departement) obj).code);
	}

	@Override
	public String toString() {
		return "Departement [code=" + code + "]";
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	

}
