package Java_20200512;

public class CalendarDemo {
	public static void main(String[] args) {

		int year = 2020;
		int month = 5;
		int day = 12;
		int totalCount = 0;
		int rest = 0;
		String message = null;
		int preYear = year - 1;

		totalCount = (preYear * 365) + (preYear / 4) - (preYear / 100) + (preYear / 400);
		totalCount += 31 + 29 + 31 + 30;
		totalCount += day;

		rest = totalCount % 7;

		System.out.println(rest);

		if (rest == 1) {
			message = "월요일";
		} else if (rest == 2) {
			message = "화요일";
		} else if (rest == 3) {
			message = "수요일";
		} else if (rest == 4) {
			message = "목요일";
		} else if (rest == 5) {
			message = "금요일";
		} else if (rest == 6) {
			message = "토요일";
		} else {
			message = "일요일";
		}

		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + " 입니다.");

	}
}
