package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {

		String phraseString = "Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes".replace(" ", "");
		List<String> villes = new ArrayList<>(Arrays.asList(phraseString.split(",")));
		

		String villeLongue = null;
		int maxNom = 0;
		for (String nom : villes) {
			int tailleNom = nom.length();
			if (tailleNom > maxNom) {
				maxNom = tailleNom;
				villeLongue = nom;
			}
		}
		System.out.println(villeLongue);
		
		for (int i = 0; i < villes.size(); i++) {
			String string = villes.get(i);

			villes.set(i, string.toUpperCase());
		}
		
		afficherListe(villes);
		System.out.println("-------------");
		
		Iterator<String> villeIterator = villes.iterator();
		while (villeIterator.hasNext()) {
			String villeTestee = (String) villeIterator.next();
			if (villeTestee.charAt(0) == 'N') {
				villeIterator.remove();
			}
		}
		
		afficherListe(villes);
	}

	public static <E> void afficherListe(List<E> liste) {
		for (E e : liste) {
			System.out.println(e);
		}
	}

}
