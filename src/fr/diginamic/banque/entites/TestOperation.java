package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {

		Operation[] operationsCourantes = new Operation[8];
		
		for (int i = 0; i < 4; i++) {
			String date = Integer.toString(i) + "/" + Integer.toString(i) + "/" + Integer.toString(i);
			operationsCourantes[i] = new Debit(date, i);
			operationsCourantes[i + 4] = new Credit(date, 2 * i);
		}
		
		int total = 0;

		for (int i = 0; i < operationsCourantes.length; i++) {
			Operation operation = operationsCourantes[i];
			if (operation.getType() == "Debit") {
				total -= operation.getMontant();
			} else {
				total += operation.getMontant();
			}
			
			System.out.println(operation);
		}

		System.out.println("le total de l argent deplace est de : " + total);
	}

}
