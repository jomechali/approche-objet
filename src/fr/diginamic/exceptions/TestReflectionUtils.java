package fr.diginamic.exceptions;

public class TestReflectionUtils {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, ReflectionException {

		Ville v1 = new Ville(30_000, "Lunel");
		
		ReflectionUtils.afficherAttributs(v1);
		
		ReflectionUtils.afficherAttributs(null);
	}

}
