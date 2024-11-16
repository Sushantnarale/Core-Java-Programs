package coreProgramsColletion;

import java.time.LocalDateTime;

public class LocalDateTimeApp {

	public static void main(String[] args) {
		LocalDateTime d1=LocalDateTime.parse("2018-11-03T12:45:30");
		System.out.println(d1);
		LocalDateTime.now();
		System.out.println(d1);
	}

}
