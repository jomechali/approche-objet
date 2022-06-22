package fr.diginamic.dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) throws ParseException {

		
		Date now = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(format.format(now));
		

		SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date givenDate = inputFormat.parse("19/05/2016 23:59:30");
		
		System.out.println(inputFormat.format(givenDate));
		
		Date systemDate = new Date(System.currentTimeMillis());
		System.out.println(inputFormat.format(systemDate));
	}

}
