package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {


		AdressePostale adr1 = new AdressePostale(23, "rue1", 34000, "Montpellier");

		AdressePostale adr2 = new AdressePostale(68, "rue2", 36000, "Tour");

		Personne personne1 = new Personne("toto", "tototo", adr1);
		
		Personne personne2 = new Personne("titi", "tititi", adr2);
	}

}
