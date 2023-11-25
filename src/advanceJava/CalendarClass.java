package advanceJava;

import java.util.Calendar;

public class CalendarClass {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getCalendarType());
		System.out.println(c.getFirstDayOfWeek());
		System.out.println(c.getTimeInMillis());
		System.out.println(c.getWeeksInWeekYear());
		System.out.println(c.getWeekYear());
		System.out.println(c.getTime());
		System.out.println(c.getTimeZone());
		
	}
}
