package fr.diginamic.recensement;

import java.util.Collection;
import java.util.Scanner;

public class View {

	private Scanner scanner = new Scanner(System.in);
	
	public void afficher(String aAfficher) {
		System.out.println(aAfficher);
	}
	
	public void afficherMenuPrincipal() {
		//TODO texte du menu principal
	}
	
	public String getEntreeUtilisateur() {
		return scanner.nextLine();
	}

	public static <E> void afficherCollection(Collection<E> collection) {
		for (E e : collection) {
			System.out.println(e);
		}
	}
}
