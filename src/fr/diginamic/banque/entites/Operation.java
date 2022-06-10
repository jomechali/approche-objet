package fr.diginamic.banque.entites;

public abstract class Operation {

	private String date;
	private int montant;
	
	public Operation(String date, int montant) {
		this.date = date;
		this.montant = montant;
	}
	
	@Override
	public String toString() {
		return "montant : " + montant + "; date : " + date + "; type : " + this.getType() ;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public abstract String getType();
}
