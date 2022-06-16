package sets;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class TestPays {

	public static class Pays {
		public String nom;
		public int hab;
		public double PIBHab;
		/**
		 * @param nom
		 * @param hab
		 * @param pIBHab
		 */
		public Pays(String nom, int hab, double pIBHab) {
			super();
			this.nom = nom;
			this.hab = hab;
			PIBHab = pIBHab;
		}
		
		@Override
		public String toString() {

			return nom + " : " + hab + " hab, " + PIBHab + " PIB/Hab";
		}
	}
	
	public static void main(String[] args) {

		//l initialisation est de Nabile!!!! avec des vraies valeurs

		// https://fr.wikipedia.org/wiki/Liste_des_pays_par_PIB_(PPA)_par_habitant
		// https://fr.wikipedia.org/wiki/Liste_des_pays_par_population#Classement_par_population_totale_en_2022
		var pays = new HashSet<Pays>(Arrays.asList
		(
				new Pays("USA", 334_805_000, 59_495),
				new Pays("France", 65_585_000, 43_551),
				new Pays("Allemagne", 83_884_000, 50_206),
				new Pays("UK", 68_498_000, 43_620),
				new Pays("Italie", 60_263_000, 37_970),
				new Pays("Japon", 125_585_000, 42_659),
				new Pays("Chine", 1_448_471_000, 16_624),
				new Pays("Russie", 145_806_000, 24_789),
				new Pays("Inde", 1_406_632_000, 6_571)
		));
		
		double maxPIBHab = Double.MIN_VALUE;
		Pays paysHabPlusRiches = null;
		
		for (Pays paysTeste : pays) {
			if (maxPIBHab < paysTeste.PIBHab) {
				maxPIBHab = paysTeste.PIBHab;
				paysHabPlusRiches = paysTeste;
			}
		}

		double maxPIB = Double.MIN_VALUE;
		Pays paysPlusRiches = null;
		
		for (Pays paysTeste : pays) {
			double PIBTeste = paysTeste.PIBHab * paysTeste.hab;
			if (maxPIB < PIBTeste) {
				maxPIB = PIBTeste;
				paysPlusRiches = paysTeste;
			}
		}
		
		double minPIB = Double.MAX_VALUE;
		Pays paysPlusPauvre = null;
		
		for (Pays paysTeste : pays) {
			double PIBTeste = paysTeste.PIBHab * paysTeste.hab;
			if (minPIB > PIBTeste) {
				minPIB = PIBTeste;
				paysPlusPauvre = paysTeste;
			}
		}
		System.out.println("plus pauvre : " + paysPlusPauvre);
		paysPlusPauvre.nom = paysPlusPauvre.nom.toUpperCase();
		afficherCollection(pays);
		
		System.out.println("--------");
		pays.remove(paysPlusPauvre);
		afficherCollection(pays);
		
	}
	
	public static <E> void afficherCollection(Collection<E> collection) {
		for (E e : collection) {
			System.out.println(e);
		}
	}

}
