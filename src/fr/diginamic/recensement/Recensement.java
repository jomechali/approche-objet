package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recensement {

	private List<Ville> villes; // liste triee par nom region, puis code departement

	/**
	 * Constructeur a partir d un fichier respectant le format de l exemple
	 * 
	 * @throws IOException
	 */
	public Recensement(String path) throws IOException {

		Path pathObject = Paths.get(path);

		if (!Files.exists(pathObject)) {
			System.err.println("Le fichier n existe pas!");
			return;
		}

		// lecture
		List<String> villesCSV = Files.readAllLines(pathObject);
		villesCSV.remove(0); // la ligne des noms de colonnes

		// parsing

		villes = new ArrayList<>();
		for (String villeCSV : villesCSV) {
			String[] data = villeCSV.split(";");
			villes.add(new Ville(Integer.parseInt(data[0].replace(" ", "")), data[1], data[2],
					Integer.parseInt(data[5].replace(" ", "")), data[6], Integer.parseInt(data[9].replace(" ", ""))));
		}
		
		villes.sort(new ComparatorRegion());

	}
	
	//TODO cas de villes homonymes
	
	/**
	 * @param nomVille
	 * @return l objet qui represente la ville recherchee
	 */
	public Ville trouverVilleParNom(String nomVille) {
		
		int index = 0;
		Ville villeRecherchee = villes.get(index);

		while (index < villes.size() - 1 && !villeRecherchee.getNomCommune().equals(nomVille)) {
			index++;
			villeRecherchee = villes.get(index);
		}
		
		if (!villeRecherchee.getNomCommune().equals(nomVille)) {
			System.err.println("ville non trouvee");
			return null;
		}
		
		return villeRecherchee;
		
	}
	
	//TODO le sublist donne un acces en ecriture, il faut passer une copie profonde

	/**
	 * @param codeRegion de la region choisie
	 * @return la liste des villes de la region
	 */
	public List<Ville> villesDansRegion(int codeRegion) {
		
		// trouver le premier index de ville qui correspond a la region
		int premierIndex = 0;
		Ville villeTestee = villes.get(premierIndex);
		
		while ((premierIndex < villes.size() - 1) && (villeTestee.getCodeRegion() != codeRegion)) {
			premierIndex++;
			villeTestee = villes.get(premierIndex);
		}
		
		if (villeTestee.getCodeRegion() != codeRegion) {
			System.err.println("le code region n'a pas ete trouvé");
			return null;
		}
		
		// trouver le dernier index des villes de la region
		// villeTestee est la premiere ville de la liste appartenant a la region recherchee, et premierIndex sa position dans la liste
		int dernierIndex = premierIndex + 1;
		villeTestee = villes.get(dernierIndex);
		while ((dernierIndex < villes.size() - 1) && (villeTestee.getCodeRegion() == codeRegion)) {
			dernierIndex++;
			villeTestee = villes.get(dernierIndex);
		}
		// pour respecter les bornes de sublist
		if (villeTestee.getCodeRegion() == codeRegion) {
			dernierIndex++;
		}
		
		return villes.subList(premierIndex, dernierIndex);

	}

	/**
	 * @param nomRegion de la region choisie
	 * @return la liste des villes de la region
	 */
	public List<Ville> villesDansRegion(String nomRegion) {
		
		// trouver le premier index de ville qui correspond a la region
		int premierIndex = 0;
		Ville villeTestee = villes.get(premierIndex);
		
		while ((premierIndex < villes.size() - 1) && (!villeTestee.getNomRegion().equals(nomRegion))) {
			premierIndex++;
			villeTestee = villes.get(premierIndex);
		}
		
		if (!villeTestee.getNomRegion().equals(nomRegion)) {
			System.err.println("le nom de la region n'a pas ete trouvé");
			return null;
		}
		
		// trouver le dernier index des villes de la region
		// villeTestee est la premiere ville de la liste appartenant a la region recherchee, et premierIndex sa position dans la liste
		int dernierIndex = premierIndex + 1;
		villeTestee = villes.get(dernierIndex);
		while ((dernierIndex < villes.size() - 1) && (villeTestee.getNomRegion().equals(nomRegion))) {
			dernierIndex++;
			villeTestee = villes.get(dernierIndex);
		}
		// pour respecter les bornes de sublist
		if (villeTestee.getNomRegion().equals(nomRegion)) {
			dernierIndex++;
		}
		
		return villes.subList(premierIndex, dernierIndex);

	}
	
	
	/**
	 * @param codeDepartement du departement choisi
	 * @return la liste des villes du departement
	 */
	public List<Ville> villesDansDepartement(String codeDepartement) {
		
		// trouver le premier index de ville qui correspond au departement
		int premierIndex = 0;
		Ville villeTestee = villes.get(premierIndex);
		
		while ((premierIndex < villes.size() - 1) && (!villeTestee.getCodeDepartement().equals(codeDepartement))) {
			premierIndex++;
			villeTestee = villes.get(premierIndex);
		}
		
		if (!villeTestee.getCodeDepartement().equals(codeDepartement)) {
			System.err.println("le nom de la region n'a pas ete trouvé");
			return null;
		}
		
		// trouver le dernier index des villes du departement
		// villeTestee est la premiere ville de la liste appartenant au departement recherche, et premierIndex sa position dans la liste
		int dernierIndex = premierIndex + 1;
		villeTestee = villes.get(dernierIndex);
		while ((dernierIndex < villes.size() - 1) && (villeTestee.getCodeDepartement().equals(codeDepartement))) {
			dernierIndex++;
			villeTestee = villes.get(dernierIndex);
		}
		// pour respecter les bornes de sublist
		if (villeTestee.getCodeDepartement().equals(codeDepartement)) {
			dernierIndex++;
		}
		
		return villes.subList(premierIndex, dernierIndex);

	}
	
	

}
