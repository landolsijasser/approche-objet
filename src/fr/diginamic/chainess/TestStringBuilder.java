package fr.diginamic.chainess;

public class TestStringBuilder {

	public static void main(String[] args) {

		StringBuilder numbers = new StringBuilder();
		long debut = System.currentTimeMillis();
		String result = null;
		for (int i = 0; i < 10000; i++) {
			result = result + i;
		}
		long fin = System.currentTimeMillis();

		long debut2 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			numbers.append(i);
		}
		long fin2 = System.currentTimeMillis();
		System.out.println("le temps concatenation est :" + (fin - debut));
		System.out.println("le temps avec le builder est : " + (fin2 - debut2));
	}

}
