package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 10, 22, 14, 00, 00);
		Date date = cal.getTime();
		System.out.println(date);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MMMM/yyyy", Locale.CHINESE);
		String dateformatee = formateur.format(date);
		System.out.println(dateformatee);
		cal.set(2016, 04, 19, 23, 59, 30);
		Date date2 = cal.getTime();

		SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateformatee2 = formateur2.format(date2);
		System.out.println(dateformatee2);

	}
}