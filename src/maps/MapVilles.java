package maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapVilles {

	public static void main(String[] args) {
		
		String phraseString = "Nice, Carcassonne, Narbonne, Lyon, Foix, Pau, Marseille, Tarbes".replace(" ", "");
		List<String> nomsVilles = new ArrayList<>(Arrays.asList(phraseString.split(",")));
		List<Integer> listeNbHab = new ArrayList<>(Arrays.asList(343_000, 47_800, 53_400, 484_000, 9_700, 77_200, 850_700, 40_600));
		
		HashMap<String, Ville> villes = new HashMap<>();
		
		for (int i = 0; i < nomsVilles.size(); i++) {
			String nomVille = nomsVilles.get(i);
			villes.put(nomVille, new Ville(nomVille, listeNbHab.get(i)));
		}
		
		int nbHabMin = Integer.MAX_VALUE;
		String nomVillePetite = null;
		
		for (String nomVille : nomsVilles) {
			int nbHab = villes.get(nomVille).getPopTotale();
			if (nbHab < nbHabMin) {
				nbHabMin = nbHab;
				nomVillePetite = nomVille;
			}
		}

		System.out.println("plus petite ville : " + villes.get(nomVillePetite));
		System.out.println(villes.size());
		villes.remove(nomVillePetite);
		System.out.println(villes.size());
		
	}

}
