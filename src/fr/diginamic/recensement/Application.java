package fr.diginamic.recensement;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {

		//TODO passer ca en argument
		Recensement recensement = new Recensement(
				"D:\\SpringWorkspaceDirectory\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\approche-objet\\src\\fichier\\recensement.csv");

		View view = new View();

		boolean leave = false;

		while (!leave) {

			view.afficherMenuPrincipal();

			String entreeUtilisateur = view.getEntreeUtilisateur();

			switch (entreeUtilisateur) {
			case "1":
				// new ServiceAfficherVille().traiter(recensement, view)
				new RechercherPopulationVille().traiter(recensement, view);
				break;
			case "2":
				// new ServicePopDepartement(recensement, view)
				new RechercherPopulationDepartement().traiter(recensement, view);
				break;
			case "3":
				// new ServicePopregion(recensement, view)
				new RechercherPopulationRegion().traiter(recensement, view);
				break;
			case "4":
				// new Service10RegionsplusPeuplees(recensement, view)
				break;
			case "5":
				// new Service10DepartementsPlusPeuples(recensement, view)
				break;
			case "6":
				// new Service10VillesDeDepartementPlusPeuplees(recensement, view)
				break;
			case "7":
				// new Service10VillesDeRegionPlusPeuplees(recensement, view)
				break;
			case "8":
				// new Service10VillesPlusPeuplees(recensement, view)
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
