package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	
	private float taux;

	public CompteTaux(int numeroDuCompte, int solde, float taux) {
		super(numeroDuCompte, solde);
		this.taux = taux;
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return super.toString() + "; taux = " + taux;
	}
}
