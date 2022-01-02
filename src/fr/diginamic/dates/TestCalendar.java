package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 04, 19, 23, 59, 30);
		Date date = cal.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String dateformatee = formateur.format(date);
		System.out.println(dateformatee);
		Date aujourdhui = new Date();
		Instant instant = aujourdhui.toInstant();
        System.out.println(instant);
	}

	
	
	

}
