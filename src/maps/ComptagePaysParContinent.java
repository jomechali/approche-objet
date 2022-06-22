package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		List<Pays> pays = new ArrayList<>();
		pays.add(new Pays("France", 65_000_000, "Europe"));
		pays.add(new Pays("Allemange", 80_000_000, "Europe"));
		pays.add(new Pays("Belgique", 10_000_000, "Europe"));
		pays.add(new Pays("Russie", 150_000_000, "Asie"));
		pays.add(new Pays("Chine", 1_400_000_000, "Asie"));
		pays.add(new Pays("Indonesie", 220_000_000, "Asie"));
		pays.add(new Pays("Australie", 20_000_000, "Occeanie"));
		
		HashMap<String, Integer> continents = new HashMap<>();
		
		for (Pays pays2 : pays) {
			String continentPays = pays2.getContinent();
			
			if (!continents.containsKey(continentPays)) {
				continents.put(continentPays, 0);
			}
			
			continents.put(continentPays, continents.get(continentPays) + 1);
		}
		
		for (String continent : continents.keySet()) {
			System.out.println(continent + " nb pays " + continents.get(continent));
		}

	}

}
