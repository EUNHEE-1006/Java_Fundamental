package Java_20200511;

public class LiteralDemo {
	public static void main(String[] args) {
		// byte b1 = 128;

		int a1 = 128; // 10진수
		int a2 = 076; // 8진수
		int a3 = 0x123; // 16진수
		int a4 = 0b1010; // 2진수

		// System.out.println(b1);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);

		// long 리터럴은 숫자 뒤에 l/L 표기!
		long l1 = 12l;

		// float 리터럴은 (반드시: double이랑 헷갈리니까) 숫자 뒤에 f/F로 표기!
		float f1 = 123.4f;

		// double 리터럴은 숫자 뒤에 d/D로 표기!(생략가능)
		double d1 = 123.56d;

		// boolean 리터럴은 true/false
		boolean isExisted = false;

		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(isExisted);

		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2); // 산술연산시, 자동으로 int로 형변환 됨!

		System.out.println(b3);

	} // main 함수
} // class 함수
