package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {

		Compte compteTest = new Compte(12345, 1000000);
		CompteTaux compteTauxTest = new CompteTaux(54321, 120, 1.5f);
		
		Compte[] banqueTest = {compteTest, compteTauxTest};
		
		for (int i = 0; i < banqueTest.length; i++) {
			System.out.println(banqueTest[i]);
		}
		
	}

}
