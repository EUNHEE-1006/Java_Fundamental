package Java_20200512;

public class SsnDemo {
	public static void main(String[] args) {
		int a1 = 9;
		int a2 = 5;
		int a3 = 1;
		int a4 = 0;
		int a5 = 0;
		int a6 = 6;

		int b1 = 2;
		int b2 = 0;
		int b3 = 1;
		int b4 = 9;
		int b5 = 5;
		int b6 = 2;
		int b7 = 1;

		int sum = a1 * 2 + a2 * 3 + a3 * 4 + a4 * 5 + a5 * 6 + a6 * 7 + b1 * 8 + b2 * 9 + b3 * 2 + b4 * 3 + b5 * 4
				+ b6 * 5;
		int rest = sum % 11;

		rest = 11 - rest;
		rest %= 10; // 중요!!!
		System.out.println(rest);

		if (b7 == rest) {
			System.out.println("정상적인 주민번호");
		} else {
			System.out.println("비 정상적인 주민번호");
		} // if
	}// main
}// class
