package fr.diginamic.recensement;

import java.util.List;
import java.util.Objects;

/**
 * Classe implementant le service : rechercher la population totale d un departement
 * @author Joseph
 *
 */

public class RechercherPopulationDepartement extends MenuService {

	@Override
	public void traiter(Recensement recensement, View view) {


		view.afficher("Entrer le code du departement : ");
		
		String codeDepartement = view.getEntreeUtilisateur();
		
		List<Ville> villesDuDepartement = recensement.villesDansDepartement(codeDepartement);
		
		if (Objects.isNull(villesDuDepartement)) {
			System.err.println("departement non trouve");
			return;
		}
		
		int popTotale = OutilsDemographiques.calculerPopulation(villesDuDepartement);
		view.afficher("la population du departement %s est de %d".formatted(codeDepartement, popTotale));
		
		return;
	}

}
