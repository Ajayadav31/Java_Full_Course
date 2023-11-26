package advanceJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Formatter {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE;
		String myDate = dt.format(dtf);
		System.out.println(myDate);
		
		DateTimeFormatter dtf1 = DateTimeFormatter.BASIC_ISO_DATE;
		String myDate1 = dt.format(dtf1);
		System.out.println(myDate1);
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE;
		String myDate2 = dt.format(dtf2);
		System.out.println(myDate2);
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ISO_DATE_TIME;
		String myDate3 = dt.format(dtf3);
		System.out.println(myDate3);
		
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("d-M-yyyy");
		String myDate4 = dt.format(dtf4);
		System.out.println(myDate4);
		
	}

}
