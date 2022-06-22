package maps;

public class Ville implements Comparable<Ville>{

	private String nom;
	private int popTotale;
	

	
	
	/**
	 * @param nom
	 * @param popTotale
	 */
	public Ville(String nom, int popTotale) {
		super();
		this.nom = nom;
		this.popTotale = popTotale;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", popTotale=" + popTotale + "]";
	}

	@Override
	public int compareTo(Ville o) {
		//return nom.compareTo(o.nom); //tri sur le nom
		return popTotale - o.popTotale; //tri sur pop totale
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @return the popTotale
	 */
	public int getPopTotale() {
		return popTotale;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @param popTotale the popTotale to set
	 */
	public void setPopTotale(int popTotale) {
		this.popTotale = popTotale;
	}


	
	
}
