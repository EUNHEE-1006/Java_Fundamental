package Java_20200519;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar c = new Calendar();
		c.print(2020,06,25); //사용자가 함수이름 외울 필요없이 오버로딩 지원!!
		c.print(2020,6);
		c.print(2020);
	}
}
