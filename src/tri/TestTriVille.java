package tri;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestTriVille {

	public static void main(String[] args) throws IOException {

		List<tri.Ville> villes = initialiserVilles();

		List<Ville> listeCourte = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			listeCourte.add(villes.get(i));
			
		}

		Collections.sort(listeCourte);
		
		afficherCollection(listeCourte);
		
		System.out.println("\n\nComparator nom :\n\n");
		
		Collections.sort(listeCourte, new ComparatorNom());
		
		afficherCollection(listeCourte);
		
		System.out.println("\n\nComparator pop totale :\n\n");
		Collections.sort(listeCourte, new ComparatorHabitant());
		
		afficherCollection(listeCourte);
	}

	/**
	 * @return
	 * @throws IOException
	 */
	public static List<tri.Ville> initialiserVilles() throws IOException {
		List<tri.Ville> villes = new ArrayList<>();

		Path path = Paths.get(
				"D:\\SpringWorkspaceDirectory\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\approche-objet\\src\\fichier\\recensement.csv");

		if (Files.exists(path)) {
			List<String> content = Files.readAllLines(path, StandardCharsets.UTF_8);
			content.remove(0);

			for (String line : content) {

				String[] data = line.split(";");
				villes.add(new tri.Ville(data[6], data[2], data[1], Integer.parseInt(data[9].replace(" ", ""))));
			}
		}
		return villes;
	}

	public static <E> void afficherCollection(Collection<E> collection) {
		for (E e : collection) {
			System.out.println(e);
		}
	}

}
