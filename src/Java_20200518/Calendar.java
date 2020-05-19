package Java_20200518; //OOP 코딩!! 중요!! 이해하기

public class Calendar {
	private int year;
	private int month;
	private int day;

	// static final만 공개!!!=> 아예 변경자체가 안되거든...

	// year변수에 대해 변경할 일이 많다? =>getter, setter 함수
	// 오직 메서드를 통해서만 데이터를 변경하게 하라!!(setter)

	public void setYear(int year) { // 헷갈리니까 this!! 멤버변수랑 매개변수를 같게 하는 것이 원칙.
		this.year = year;
	}

	// 오직 메서드를 통해서만 데이터를 가져와라!!(getter)
	public int getYear() {
		return year;
	}

	public Calendar(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	private int getCount() {
		int totalCount = 0;
		int preYear = year - 1;

		totalCount = (preYear * 365) + (preYear / 4) - (preYear / 100) + (preYear / 400);

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			monthArray[1] = 29;
		}

		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}
		totalCount += day;
		return totalCount;

	}

	public void print() {

		int totalCount = getCount();
		int rest = 0;
		String message = null;

		rest = totalCount % 7;

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
