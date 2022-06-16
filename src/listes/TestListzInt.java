package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListzInt {

	public static void main(String[] args) {

		/*test a part*/
		List<Integer> listeEntiersTest = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
		

		System.out.println(listeEntiersTest.getClass());
		Iterator<Integer> itTest = listeEntiersTest.iterator();
		while (itTest.hasNext()) {
			Integer currentInt = (Integer) itTest.next();
			if (currentInt == 5) {
				itTest.remove();
			}
		}

		afficherListe(listeEntiersTest);
		
		/*fin test a part*/
		
		
		List<Integer> listeEntiers = new ArrayList<>();
		int[] base = {-1, 5, 7, 3, -2, 4, 8, 5};
		
		for (int i : base) {
			listeEntiers.add(i);
		}
		
		
		afficherListe(listeEntiers);

		System.out.println("taille de la liste : " + listeEntiers.size());
		
		int max = Integer.MIN_VALUE;
		for (Integer integer : listeEntiers) {
			max = (integer > max) ? integer : max;
		}
		
		System.out.println("le max : " + max);

		int min = Integer.MAX_VALUE;
		for (Integer integer : listeEntiers) {
			min = (integer < min) ? integer : min;
		}
		
		Iterator<Integer> it = listeEntiers.iterator();
		while (it.hasNext()) {
			Integer currentInt = (Integer) it.next();
			if (currentInt == min) {
				it.remove();
			}
		}

		afficherListe(listeEntiers);
	}
	
	public static void afficherListe(List<Integer> liste) {
		for (Integer integer : liste) {
			System.out.println(integer);
		}
	}
	

}
