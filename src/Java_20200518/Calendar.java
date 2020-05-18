package Java_20200518; //OOP 코딩!! 중요!! 이해하기

public class Calendar {
	private int year;
	private int month;
	private int day;
	
	public void set(int y,int m, int d) {
		year=y;
		month=m;
		day=d;
	}
	private int getCount() {
		int totalCount = 0;
		int preYear = year - 1;

		totalCount = (preYear * 365) + (preYear / 4) - (preYear / 100) + (preYear / 400);
		
		int []monthArray= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(year%4==0 && (year%100!=0 || year%400==0)) {
			monthArray[1]=29;
		}
		
		for (int i = 0; i < month-1; i++) {
			totalCount+=monthArray[i];
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
