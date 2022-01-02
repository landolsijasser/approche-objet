package testenumeration;

import java.util.Arrays;
import java.util.List;

public class TestEnumeration {

	public static void main(String[] args) {
		List<Saison> saisons = Arrays.asList(Saison.values());
		for (Saison s : saisons) {
			System.out.println(s);
			
		}
		System.out.println("----------------------------------------------");
		Saison s1 = Saison.valueOf("ETE");
		System.out.println(s1.getLibelle());
		System.out.println("----------------------------------------------");
		
	}
}