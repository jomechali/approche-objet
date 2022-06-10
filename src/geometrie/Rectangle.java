package geometrie;

public class Rectangle implements ObjetGeometrique {

	private double longueur;
	private double largueur;
	
	@Override
	public double perimetre() {
		return longueur + largueur;
	}

	@Override
	public double surface() {
		return longueur * largueur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargueur() {
		return largueur;
	}

	public void setLargueur(double largueur) {
		this.largueur = largueur;
	}

	public Rectangle(double longueur, double largueur) {
		this.longueur = longueur;
		this.largueur = largueur;
	}

}
