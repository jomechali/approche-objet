package fr.diginamic.recensement;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {

		// args[0] contient le path du fichier de recensement
		// "D:\\SpringWorkspaceDirectory\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\approche-objet\\src\\fichier\\recensement.csv"

		Recensement recensement = new Recensement(args[0]);

		View view = new View();

		boolean leave = false;

		while (!leave) {

			view.afficherMenuPrincipal();

			String entreeUtilisateur = view.getEntreeUtilisateur();

			switch (entreeUtilisateur) {
			case "1":
				// afficher les informations sur une ville
				new RechercherPopulationVille().traiter(recensement, view);
				break;
			case "2":
				// rechercher la population d un departement
				new RechercherPopulationDepartement().traiter(recensement, view);
				break;
			case "3":
				// rechercher la population d une region
				new RechercherPopulationRegion().traiter(recensement, view);
				break;
			case "4":
				// afficher les 10 regions les plus peuplees
				new AfficherRegionsPlusPeuplees().traiter(recensement, view);
				break;
			case "5":
				// afficher les 10 departements les plus peuples
				new AfficherDepartementsPlusPeuples().traiter(recensement, view);
				break;
			case "6":
				// afficher les 10 plus grandes villes d un departement
				new AfficherVillesMajeuresDepartement().traiter(recensement, view);
				break;
			case "7":
				// afiicher les 10 plus grandes villesd une region
				new AfficherVillesMajeuresRegion().traiter(recensement, view);
				break;
			case "8":
				// afficher les 10 plus grandes villes de France
				new AfficherPlusGrandesVillesDeFrance().traiter(recensement, view);
				break;
			case "9":
				leave = true;
				break;

			default:
				break;
			}
		}
	}

}
