package Java_20200519; //OOP 코딩!! 중요!! 이해하기

public class Calendar {
	// static final만 공개!!!=> 아예 변경자체가 안되거든...

	// year변수에 대해 변경할 일이 많다? =>getter, setter 함수
	// 오직 메서드를 통해서만 데이터를 변경하게 하라!!(setter)

	public Calendar() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int getCount(int year, int month, int day) {
		int totalCount = 0;
		int preYear = year - 1;

		totalCount = (preYear * 365) + (preYear / 4) - (preYear / 100) + (preYear / 400);

		for (int i = 0; i < month - 1; i++) {
			totalCount += getLastDay(year, i + 1);
		}
		totalCount += day;
		return totalCount;

	}

	private int getLastDay(int year, int month) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			monthArray[1] = 29;
		}
		return monthArray[month - 1];
	}
	
	public void print(int year, int month, int day) {

		int totalCount = getCount(year, month, day);
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

	public void print(int year) {
		for (int i = 1; i <= 12; i++) {
			print(year, i);
		}
	}

	

}
//메서드 자동 생성 => 마우스 오른쪽 - refector
