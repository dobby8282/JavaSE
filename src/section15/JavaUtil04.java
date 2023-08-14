package section15;

import java.util.Calendar;

import section15.access2.Singleton;

/*
 * Calendar 클래스
 * 	시간과 날짜 정보를 다루는 클래스
 * 	날짜 시간 계산으로 자주 사용
 * 	Date 객체화 호환가능
 * 
 * 
 */

public class JavaUtil04 {
	
	public static void main(String[] args) {
		
		// 객체 생성 getInstance()메서드 통해 해야한다.
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("올 해: " + year);
		
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println("월: " + month);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("일: " + day);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(hour+":"+min+":"+sec);
		
	}

}












