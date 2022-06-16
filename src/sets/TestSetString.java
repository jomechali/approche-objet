package sets;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {

		String villesString ="USA, France, Allemagne, UK, Italie, Japon, Chine, Russie, Inde".replace(" ", "");
		HashSet<String> set = new HashSet<>(Arrays.asList(villesString.split(",")));
		
		
		String villeLongNom = null;
		int tailleNom = 0;
		
		for (String nomVille : set) {
			if (nomVille.length() > tailleNom) {
				tailleNom = nomVille.length();
				villeLongNom = nomVille;
			}
		}
		set.remove(villeLongNom);
		
		afficherCollection(set);
		

	}

	public static <E> void afficherCollection(Collection<E> collection) {
		for (E e : collection) {
			System.out.println(e);
		}
	}
}
