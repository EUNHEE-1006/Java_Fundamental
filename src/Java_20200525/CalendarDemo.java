package Java_20200525;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); //컴퓨터 시간을 default로 둠
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //month는 0부터 셈
		int day=cal.get(Calendar.DATE);
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year + "년 " +month + "월 " +day + "일");
		System.out.println(hour + "시 " +minute+ "분 " +second + "초 ");
		
		//중요!!!!!!!!!!!
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일"); //
		
		//cal.setTimeInMillis(millis); 자동으로 m/s을 년월일로 만들어줌.
		
		String date = sdf.format(cal.getTime());
		System.out.println(date);
		
	}
}
