package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AfficherRegionsPlusPeuplees extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {
		
		HashMap<ZoneDemographique, Integer> populationRegionale = new HashMap<>();
		for (Region region : recensement.getRegions()) {
			populationRegionale.put(region, region.populationTotale());
		}
		
		List<Map.Entry<ZoneDemographique, Integer>> populations = new ArrayList<>(populationRegionale.entrySet());
		Collections.sort(populations, new ComparatorEntry());

		for (int i = 0; i < 10; i++) {

			Entry<ZoneDemographique, Integer> popActuelle = populations.get(i);
			String aAfficher = popActuelle.getKey().toString() + " a " + popActuelle.getValue() + " habitants.";
			view.afficher(aAfficher);
		}
	}

}
