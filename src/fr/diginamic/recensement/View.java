package fr.diginamic.recensement;

import java.util.Collection;
import java.util.Scanner;

public class View {

	private Scanner scanner = new Scanner(System.in);
	
	public void afficher(String aAfficher) {
		System.out.println(aAfficher);
	}
	
	public void afficherMenuPrincipal() {

		System.out.println("Que faire ?");
		System.out.println("1 - Afficher les informations sur une ville");
		System.out.println("2 - Calculer la population d'un departement");
		System.out.println("3 - Calculer la population d'une region");
		System.out.println("4 - Afficher les 10 regions les plus peuplees");
		System.out.println("5 - Afficher les 10 departements les plus peuples");
		System.out.println("6 - Afficher les 10 villes les plus peuplees d'un departement");
		System.out.println("7 - Afficher les 10 villes les plus peuplees d'une region");
		System.out.println("8 - Afficher les 10 villes les plus peuplees de France");
		System.out.println("9 - Sortir");
	}
	
	//TODO ajouter des fonctions d entree utilisateur pour selectionner des entrees valides
	public String getEntreeUtilisateur() {
		return scanner.nextLine();
	}

	public static <E> void afficherCollection(Collection<E> collection) {
		for (E e : collection) {
			System.out.println(e);
		}
	}
}
