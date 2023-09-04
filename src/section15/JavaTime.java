package section15;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaTime {

	public static void main(String[] args) {
		// 현재 날짜와 시간 가져오기
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time: " + currentDateTime);

		// 날짜와 시간 분리
		LocalDate currentDate = currentDateTime.toLocalDate();
		LocalTime currentTime = currentDateTime.toLocalTime();
		System.out.println("Current Date: " + currentDate);
		System.out.println("Current Time: " + currentTime);

		// 특정 날짜와 시간 생성
		LocalDateTime specificDateTime = LocalDateTime.of(2023, Month.JANUARY, 1, 12, 0);
		System.out.println("Specific Date and Time: " + specificDateTime);

		// 날짜 연산 (1주일 후)
		LocalDateTime oneWeekLater = currentDateTime.plusWeeks(1);
		System.out.println("One Week Later: " + oneWeekLater);

		// 기간 계산 (두 날짜 사이의 차이)
		LocalDate date1 = LocalDate.of(2022, Month.JANUARY, 1);
		LocalDate date2 = LocalDate.of(2023, Month.JANUARY, 1);
		Period period = Period.between(date1, date2);
		System.out.println("Period between two dates: " + period);

		// 시간 간격 계산
		LocalTime time1 = LocalTime.of(10, 0);
		LocalTime time2 = LocalTime.of(15, 30);
		Duration duration = Duration.between(time1, time2);
		System.out.println("Duration between two times: " + duration);
		
		// 날짜를 형식에 맞게 포맷팅
        LocalDate currentDate2 = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        String formattedDate = currentDate2.format(dateFormatter);
        System.out.println("Formatted Date: " + formattedDate);

        // 문자열을 날짜로 파싱
        String dateString = "2023.09.01";
        LocalDate parsedDate = LocalDate.parse(dateString, dateFormatter);
        System.out.println("Parsed Date: " + parsedDate);
        
        // 기본 시스템 타임존 가져오기
        ZoneId systemZone = ZoneId.systemDefault();
        System.out.println("System Time Zone: " + systemZone);

        // 특정 타임존으로 날짜와 시간 설정
        ZoneId newYorkZone = ZoneId.of("America/New_York");
        ZonedDateTime newYorkDateTime = ZonedDateTime.now(newYorkZone);
        System.out.println("New York Date and Time: " + newYorkDateTime);
        
        // 현재 UTC 시간 가져오기
        Instant currentUTC = Instant.now();
        System.out.println("Current UTC Time: " + currentUTC);
        
        
	}

}
