package fr.diginamic.enumerations;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {

		List<Ville> villes = new ArrayList<>();

		villes.add(new Ville(8_380_000, "NY", Continent.AMERIQUE));
		villes.add(new Ville(2_165_000, "Paris", Continent.EUROPE));
		villes.add(new Ville(21_000_000, "Pekin", Continent.ASIE));
		villes.add(new Ville(11_000_000, "Moscou", Continent.ASIE));
		villes.add(new Ville(3_645_000, "Berlin", Continent.EUROPE));
		villes.add(new Ville(5_312_000, "Sydney", Continent.OCEANIE));
		villes.add(new Ville(12_330_000, "Sao Paulo", Continent.AMERIQUE));
		villes.add(new Ville(1_146_000, "Dakar", Continent.AFRIQUE));

		for (Ville ville : villes) {
			System.out.println(ville);
		}
	}

}
