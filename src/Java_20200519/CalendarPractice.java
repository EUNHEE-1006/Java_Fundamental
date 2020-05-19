package Java_20200519;

public class CalendarPractice {

	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;

	public CalendarPractice() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int getCount(int year, int month, int day) {
		int preYear = year - 1;
		int totalCount = (preYear * 365) + (preYear / 4) - (preYear / 100) + (preYear / 400);

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean isLeafYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		if (isLeafYear) {
			monthArray[1] = 29;
		}

		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}
		totalCount += day;
		return totalCount;

	}

	public void print(int year, int month, int day) {
		int totalCount = getCount(year, month, day);

		int dayOfWeek = totalCount % 7;
		String message = null;

		if (dayOfWeek == CalendarPractice.MONDAY) {
			message = "월요일";
		} else if (dayOfWeek == CalendarPractice.TUESDAY) {
			message = "화요일";
		} else if (dayOfWeek == CalendarPractice.WEDNESDAY) {
			message = "수요일";
		} else if (dayOfWeek == CalendarPractice.THURSDAY) {
			message = "목요일";
		} else if (dayOfWeek == CalendarPractice.FRIDAY) {
			message = "금요일";
		} else if (dayOfWeek == CalendarPractice.SATURDAY) {
			message = "토요일";
		} else if (dayOfWeek == CalendarPractice.SUNDAY) {
			message = "일요일";
		}

		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + "입니다.");
	}

	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int dayOfFirst = getCount(year, month, 0);


	}

}
