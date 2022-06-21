package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Classe qui implemente le service : afficher les 10 departements les plus
 * peuples
 * 
 * @author Joseph
 *
 */
public class AfficherDepartementsPlusPeuples extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {

		HashMap<ZoneDemographique, Integer> populationDepartementale = new HashMap<>();
		for (Departement departement : recensement.getDepartements()) {
			populationDepartementale.put(departement, departement.populationTotale());
		}

		List<Map.Entry<ZoneDemographique, Integer>> populations = new ArrayList<>(populationDepartementale.entrySet());
		Collections.sort(populations, new ComparatorEntry());

		for (int i = 0; i < 10; i++) {

			Entry<ZoneDemographique, Integer> popActuelle = populations.get(i);
			String aAfficher = popActuelle.getKey().toString() + " a " + popActuelle.getValue() + " habitants.";
			view.afficher(aAfficher);
		}
	}

}
