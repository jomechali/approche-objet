package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder();
		
		long debut = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			builder.append(i);
		}

		long fin = System.currentTimeMillis();
		
		System.out.println("Temps ecoule en milisecondes : " + (fin - debut));
		

		String chaine = null;
		debut = System.currentTimeMillis();
		for (int i = 0; i < 100_000; i++) {
			chaine += i;
		}

		fin = System.currentTimeMillis();
		
		System.out.println("Temps ecoule en milisecondes : " + (fin - debut));
	}

	public String efficientConcat(Object ... objs) {
		StringBuilder builder = new StringBuilder();
		for (Object object : objs) {
			builder.append(object);
		}
		return builder.toString();
	}
}
