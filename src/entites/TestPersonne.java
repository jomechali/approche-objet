package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {


		AdressePostale adr1 = new AdressePostale(23, "rue1", 34000, "Montpellier");

		Personne personne1 = new Personne("toto", "tototo");
		personne1.setAdresse(adr1);
	}

}
