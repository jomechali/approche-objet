package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		
		//lecture
		Path path = Paths.get(
				"D:\\SpringWorkspaceDirectory\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\approche-objet\\src\\fichier\\recensement.csv");
		
		if (!Files.exists(path)) {
			System.err.println("le fichier n existe pas");
			return;
		}
		List<String> content = Files.readAllLines(path, StandardCharsets.UTF_8);

		//ecriture
		Path targetPath = Paths.get(
				"D:\\SpringWorkspaceDirectory\\workspace-spring-tool-suite-4-4.14.1.RELEASE\\approche-objet\\src\\fichier\\recensement2.csv");

		List<String> selectedContent = new ArrayList<>();
		for (int i = 0; i < Math.min(100, content.size()); i++) {
			String string = content.get(i);
			selectedContent.add(string);
			
		}

		Files.write(targetPath, selectedContent, StandardOpenOption.CREATE);
		
	}

}
