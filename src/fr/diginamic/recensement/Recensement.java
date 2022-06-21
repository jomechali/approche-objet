package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * Contient les donnees et des methodes pour les manipuler
 * 
 * @author Joseph
 *
 */
public class Recensement {

	// remplacer par des hashset?
	private List<Ville> villes; // liste triee par nom region, puis code departement
	private List<Departement> departements;
	private List<Region> regions;

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


		// Parsing
		departements = new ArrayList<>();
		regions = new ArrayList<>();
		villes = new ArrayList<>();
		
		for (String villeCSV : villesCSV) {

			// lire la donnee
			String[] data = villeCSV.split(";");
			int codeRegion = Integer.parseInt(data[0].replace(" ", ""));
			String nomRegion = data[1];
			String codeDepartement = data[2];
			int codeCommune = Integer.parseInt(data[5].replace(" ", ""));
			String nomCommune = data[6];
			int populationTotale = Integer.parseInt(data[9].replace(" ", ""));

			// Creer la ville
			Ville villeLue = new Ville(codeCommune, nomCommune,
					populationTotale);

			villes.add(villeLue);
			
			// Creer ou mettre a jour le departement
			Departement departementDeLaVille = trouverDepartementParCode(codeDepartement);
			if (Objects.isNull(departementDeLaVille)) {
				departementDeLaVille = new Departement(new ArrayList<>(), codeDepartement);
				departements.add(departementDeLaVille);
			}

			departementDeLaVille.ajouterVille(villeLue);
			villeLue.setDepartement(departementDeLaVille);

			// Creer ou mettre a jour la region
			Region regionDeLaVille = trouverRegion(codeRegion);
			if (Objects.isNull(regionDeLaVille)) {
				regionDeLaVille = new Region(new ArrayList<>(), codeRegion, nomRegion);
				regions.add(regionDeLaVille);
			}
			regionDeLaVille.ajouterVille(villeLue);
			villeLue.setRegion(regionDeLaVille);
		}

	}


	/**
	 * Cherche un departement avec son code
	 * 
	 * @param code
	 * @return le departement si trouve, null sinon
	 */
	public Departement trouverDepartementParCode(String code) {
		boolean trouve = false;

		Iterator<Departement> iterator = departements.iterator();
		Departement departement = null;
		while (iterator.hasNext() && !trouve) {
			departement = (Departement) iterator.next();
			trouve = departement.getCode().equals(code);
		}

		if (trouve) {
			return departement;
		}
		return null;
	}

	/**
	 * Cherche une region par son code
	 * 
	 * @param code
	 * @return la region si trouve, null sinon
	 */
	public Region trouverRegion(int code) {
		boolean trouve = false;

		Iterator<Region> iterator = regions.iterator();
		Region region = null;
		while (iterator.hasNext() && !trouve) {
			region = (Region) iterator.next();
			trouve = region.getCode() == code;
		}

		if (trouve) {
			return region;
		}
		return null;
	}

	/**
	 * Cherche une region par son nom
	 * 
	 * @param nom
	 * @return la region si trouve, null sinon
	 */
	public Region trouverRegion(String nom) {
		boolean trouve = false;

		Iterator<Region> iterator = regions.iterator();
		Region region = null;
		while (iterator.hasNext() && !trouve) {
			region = (Region) iterator.next();
			trouve = region.getNom().equals(nom);
		}

		if (trouve) {
			return region;
		}
		return null;
	}
	// TODO cas de villes homonymes

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

	// TODO acces en ecriture, il faut passer une copie profonde?

	/**
	 * @param codeRegion de la region choisie
	 * @return la liste des villes de la region
	 */
	public List<Ville> villesDansRegion(int codeRegion) {

		Region region = trouverRegion(codeRegion);
		return region.getVilles();

	}

	/**
	 * @param nomRegion de la region choisie
	 * @return la liste des villes de la region
	 */
	public List<Ville> villesDansRegion(String nomRegion) {

		return trouverRegion(nomRegion).getVilles();

	}

	/**
	 * @param codeDepartement du departement choisi
	 * @return la liste des villes du departement
	 */
	public List<Ville> villesDansDepartement(String codeDepartement) {

		return trouverDepartementParCode(codeDepartement).getVilles();

	}

	/**
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

	/**
	 * @return the departements
	 */
	public List<Departement> getDepartements() {
		return departements;
	}

	/**
	 * @return the regions
	 */
	public List<Region> getRegions() {
		return regions;
	}

}
