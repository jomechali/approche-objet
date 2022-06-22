package fr.diginamic.dates;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance(Locale.FRANCE);
		calendar.set(2016, 4, 19, 23, 59, 30);
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date givenDate = calendar.getTime();
		
		System.out.println(format.format(givenDate));
		
		String pattern = "yyyy/MMM/EEE HH:mm:ss";
		SimpleDateFormat format2 = new SimpleDateFormat(pattern, Locale.FRANCE);
		System.out.println(format2.format(givenDate));
		format2.setDateFormatSymbols(new DateFormatSymbols(Locale.CHINA));
		System.out.println(format2.format(givenDate));
		format2.setDateFormatSymbols(new DateFormatSymbols(Locale.GERMAN));
		System.out.println(format2.format(givenDate));

		format2.setDateFormatSymbols(new DateFormatSymbols(new Locale("ru", "RU")));
		System.out.println(format2.format(givenDate));
	}

}
