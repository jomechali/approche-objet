package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		
		List<Ville> villes = new ArrayList<>();

		Path path = Paths.get(
				"D:\\SpringWorkspaceDirectory\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\approche-objet\\src\\fichier\\recensement.csv");
		
		if (Files.exists(path)) {
			List<String> content = Files.readAllLines(path, StandardCharsets.UTF_8);
			content.remove(0);
			
			for (String line : content) {

				String[] data = line.split(";");
				villes.add(new Ville(data[6], Integer.parseInt(data[0]), data[1], Integer.parseInt(data[9].replace(" ", ""))));
			}
		}
		
		Path targetPath = Paths.get(
				"D:\\SpringWorkspaceDirectory\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\approche-objet\\src\\fichier\\grandesVilles.csv");
		
		List<String> grandesVillesData = new ArrayList<>();
		for (Ville ville : villes) {
			if (ville.getPopTotale() >= 25000) {
				grandesVillesData.add(ville.getData());
				
			}
		}
		grandesVillesData.add(0, "Commune;Numero de Region;Region;Population totale");
		Files.write(targetPath, grandesVillesData, StandardOpenOption.CREATE);

	}

}
