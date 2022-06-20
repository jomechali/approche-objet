package fr.diginamic.recensement;

import java.util.Objects;

/**
 * Classe qui implement le service : rechercher les informations d une ville
 * @author Joseph
 *
 */

public class RechercherPopulationVille extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {

		view.afficher("Entrer le nom de la ville :");

		String nomVille = view.getEntreeUtilisateur();
		
		view.afficher("recherche " + nomVille);
		
		Ville villeAAfficher = recensement.trouverVilleParNom(nomVille);
		
		if (Objects.isNull(villeAAfficher)) {
			view.afficher("ville non trouvee");
			return;
		}
		
		view.afficher(villeAAfficher.toString());
	}

}
