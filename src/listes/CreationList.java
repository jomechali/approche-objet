package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationList {

	public static void main(String[] args) {

		List<Integer> premiersEntiers = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			premiersEntiers.add(i);
		}
		
		System.out.println(premiersEntiers.size());
	}

}
