package section15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtil05 {
	
	public static void main(String[] args) throws ParseException {
		
		String result = dateCalc(
							"2023-08-14 08:16:00",
							"yyyy-MM-dd HH:mm:ss",
							0,
							0,
							-100,
							0,
							0,
							0
						);
		
		System.out.println(result);
		
	}
	
	public static String dateCalc(
			String strDate,
			String format,
			int addYear,
			int addMonth,
			int addDate,
			int addHour,
			int addMinute,
			int addSecond
			) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(strDate);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);	// Date객체 -> Calendar 호환
		
		cal.add(Calendar.YEAR, +addYear);
		cal.add(Calendar.MONTH, +addMonth);
		cal.add(Calendar.DATE, +addDate);
		cal.add(Calendar.HOUR_OF_DAY, +addHour);
		cal.add(Calendar.MINUTE, +addMinute);
		cal.add(Calendar.SECOND, +addSecond);
		
		return sdf.format(cal.getTime());
		
		
	}

}







