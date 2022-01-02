package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/Users/andol/Downloads/recensement.csv");
		System.out.println(path);
		List<String> lignes = Files.readAllLines(path);
		
		}
	}


