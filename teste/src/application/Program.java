package application;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date x1 = new Date();
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(x1);
		cal.add(Calendar.HOUR_OF_DAY, 0);
		x1 = cal.getTime();
		int minutes = cal.get(Calendar.MINUTE);
		
		System.out.println(sdf.format(x1));
		

	}

}
