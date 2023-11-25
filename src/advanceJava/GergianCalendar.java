package advanceJava;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GergianCalendar {
	public static void main(String[] args) {
		GregorianCalendar c1 = new GregorianCalendar();
		System.out.println(c1.isLeapYear(1996));
		for(int i = 0;i<631;i++) {
			System.out.println(TimeZone.getAvailableIDs()[i]);
		}
		System.out.println(c1.toZonedDateTime());
		
		System.out.println(TimeZone.getDefault());
	}

}
