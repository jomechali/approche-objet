package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ville {

	private int hab;
	private String nom;
	
	public static void main(String[] args) {
		List<Ville> villes = new ArrayList<>();
		
		String phraseString = "Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes".replace(" ", "");
		List<String> nomsVilles = new ArrayList<>(Arrays.asList(phraseString.split(",")));
		List<Integer> listeNbHab = new ArrayList<>(Arrays.asList(343_000, 47_800, 53_400, 484_000, 9_700, 77_200, 850_700, 40_600));
		
		
		for (int i = 0; i < nomsVilles.size(); i++) {
			villes.add(new Ville(nomsVilles.get(i), listeNbHab.get(i)));
		}
		
		int maxHab = Integer.MIN_VALUE;
		Ville villePeuplee = null;
		
		for (Ville ville : villes) {
			if (maxHab < ville.hab) {
				maxHab = ville.hab;
				villePeuplee = ville;
			}
		}
		System.out.println(villePeuplee);
		

		int minHab = Integer.MAX_VALUE;
		Ville villeMoinsPeuplee = null;
		
		for (Ville ville : villes) {
			if (minHab > ville.hab) {
				minHab = ville.hab;
				villeMoinsPeuplee = ville;
			}
		}
		System.out.println(villeMoinsPeuplee);
		
		villes.remove(villeMoinsPeuplee);
		
		System.out.println("----------------------");
		
		afficherListe(villes);
		
		Iterator<Ville> itVilles = villes.iterator();
		while (itVilles.hasNext()) {
			Ville villeTestee = (Ville) itVilles.next();
			if (villeTestee.hab > 100_000) {
				villeTestee.nom = villeTestee.nom.toUpperCase();
			}
		}
		System.out.println("----------------");
		afficherListe(villes);
	}

	/**
	 * @param hab
	 * @param nom
	 */
	public Ville(String nom, int hab) {
		super();
		this.hab = hab;
		this.nom = nom;
	}

	public static <E> void afficherListe(List<E> liste) {
		for (E e : liste) {
			System.out.println(e);
		}
	}
	
	@Override
	public String toString() {
		return nom + ", " + hab + ".";
	}
	
}
