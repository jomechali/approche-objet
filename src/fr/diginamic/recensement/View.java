package fr.diginamic.recensement;

import java.util.Collection;
import java.util.Scanner;

/**
 * Classe qui sert d interface avec l utilisateur
 * 
 * @author Joseph
 *
 */
public class View {

	private Scanner scanner = new Scanner(System.in);

	/**
	 * Afficher un texte
	 * 
	 * @param aAfficher
	 */
	public void afficher(String aAfficher) {
		System.out.println(aAfficher);
	}

	/**
	 * Recuperer une entree utilisateur
	 * 
	 * @return
	 */
	public String getEntreeUtilisateur() {
		return scanner.nextLine();
	}

	/**
	 * Afficher le texte du menu principal
	 */
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

	/**
	 * Methode pour recuperer un code de departement
	 * 
	 * @return
	 */
	public String getCodeDepartement() {

		afficher("Entrer le code du departement : ");

		return scanner.nextLine();
	}

	/**
	 * Methode pour recuperer un reference sur une region
	 * 
	 * @return un String qui est soit un code de region soit un nom de region
	 */
	public String getRegion() {

		afficher("Entrer le code de la region ou le nom de la region");

		return scanner.nextLine();
	}

	/**
	 * Affiche une collection
	 * 
	 * @param <E>
	 * @param collection
	 */
	public <E> void afficherCollection(Collection<E> collection) {
		for (E e : collection) {
			System.out.println(e);
		}
	}
}
