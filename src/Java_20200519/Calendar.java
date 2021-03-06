package Java_20200519; //OOP 코딩!! 중요!! 이해하기

/**
 * Calendar 클래스는 엄천난 클래스
 * 
 * @author acorn-511
 *
 */
public class Calendar {
	// static final만 공개!!!=> 아예 변경자체가 안되거든...

	// year변수에 대해 변경할 일이 많다? =>getter, setter 함수
	// 오직 메서드를 통해서만 데이터를 변경하게 하라!!(setter)
	private int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;

	public Calendar() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int getCount(int year, int month, int day) {
		int totalCount = 0;
		int preYear = year - 1;

		totalCount = (preYear * 365) + (preYear / 4) - (preYear / 100) + (preYear / 400);

		isLeafYear(year);

		for (int i = 0; i < month - 1; i++) {
			totalCount += monthArray[i];
		}
		totalCount += day;
		return totalCount;

	}

	private int getLastDay(int year, int month) {
		isLeafYear(year);
		return monthArray[month - 1];
	}

	private void isLeafYear(int year) {
		boolean isLeafYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
		if (isLeafYear) {
			monthArray[1] = 29;
		}
	}

	/**
	 * 요일을 출력해주는 메소드 입니다.
	 */
	public void print(int year, int month, int day) {

		int totalCount = getCount(year, month, day);
		int dayOfWeek = 0;
		String message = null;

		dayOfWeek = totalCount % 7;

		if (dayOfWeek == Calendar.MONDAY) {
			message = "월요일";
		} else if (dayOfWeek == Calendar.TUESDAY) { // 코딩할 때, 숫자를 쓰는건 그닥 좋은거 아니야.
			message = "화요일";
		} else if (dayOfWeek == Calendar.WEDNESDAY) {
			message = "수요일";
		} else if (dayOfWeek == Calendar.THURSDAY) {
			message = "목요일";
		} else if (dayOfWeek == Calendar.FRIDAY) {
			message = "금요일";
		} else if (dayOfWeek == Calendar.SATURDAY) {
			message = "토요일";
		} else if (dayOfWeek == Calendar.SUNDAY) {
			message = "일요일";
		}

		System.out.println(year + "년 " + month + "월 " + day + "일은 " + message + " 입니다.");
	}

/**
 * 월을 출력해주는 메소드 입니다.
 */
	public void print(int year, int month) {
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		// 2020년 5월 1일 요일을 구해서, 앞에 빈공백처리

		int totalCount = getCount(year, month, 1);
		int rest = totalCount % 7;

		for (int i = 0; i < rest; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= getLastDay(year, month); i++) {
			if (rest % 7 == 0) {
				System.out.println();
			}
			System.out.print(i + "\t");
			rest++;
		}
		System.out.println("\n");
	}
/**
년을 출력해주는 메소드 입니다.
 */
	public void print(int year) {
		for (int i = 1; i <= 12; i++) {
			print(year, i);
		}
	}

}
//메서드 자동 생성 => 마우스 오른쪽 - refector
//반복되는 코드가 있으면 새로운 메소드로 빼기. for 훗날을 위해서
