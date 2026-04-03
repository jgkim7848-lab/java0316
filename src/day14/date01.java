package day14;//day13거 아침에 끝내고 1번째.

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class date01 {

	public static void main(String[] args) {
		//날짜, 시간 추출 클래스
		/*Date 클래스 
		 * Calendar 클래스
		 * LocalDate
		 * 대충 점점 이런 계보로 내려오는중
		 * */
		Date d = new Date();
		System.out.println(d);
		
		System.out.println(d.getDate());//안되는건 아닌데 비권장.
		
		//Calendar - A 붙은게 추상클래스임. new로 생성이 안됨.
		//그럼 어케하는가??
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		
		System.out.println(year);
		
		int month = c.get(Calendar.MONTH)+1;
		System.out.println(month);
		
		LocalDate l = LocalDate.now();
		
		LocalDateTime ld = LocalDateTime.now();
		System.out.println(l.getYear());
		System.out.println(l.getMonthValue());
		System.out.println(l.getMonth());
		System.out.println(l);
		
		LocalDateTime birth = LocalDateTime.of(00, 12, 16, 3, 3);
		System.out.println(birth);
		
		//yyyy mm dd hh:mm:ss
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(df.format(birth));
	}

}
