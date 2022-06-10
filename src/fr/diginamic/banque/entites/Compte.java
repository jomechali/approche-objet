package fr.diginamic.banque.entites;

public class Compte {

	private int numeroDuCompte;
	private int solde;
	
	public Compte(int numeroDuCompte, int solde) {
		this.numeroDuCompte = numeroDuCompte;
		this.solde = solde;
	}

	public int getNumeroDuCompte() {
		return numeroDuCompte;
	}

	public void setNumeroDuCompte(int numeroDuCompte) {
		this.numeroDuCompte = numeroDuCompte;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}
	
	@Override
	public String toString() {
		return "numero = " + numeroDuCompte + "; solde = " + solde;
	}
}
