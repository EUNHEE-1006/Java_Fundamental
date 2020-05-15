package Java_20200512;

public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;

		c = a + b;
		System.out.println(c);

		c = a - b;
		System.out.println(c);

		d = (double) b / a;
		System.out.println(d);

		c = a * b;
		System.out.println(c);
		// ctrl + shift + F = 자동줄 맞춰줌!!!!

		c = b % a;
		System.out.println(c);

		a += b;
		System.out.println(a);

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		a = 10;
		b = 20;

		a++;
		++b;

		System.out.println(a);
		System.out.println(b);

		c = a++;
		System.out.println(c);

		c = ++b;
		System.out.println(c);

		a = 10;
		b = 20;
		d = 10.0;

		boolean isSuccess = false;
		isSuccess = a > b;
		System.out.println(isSuccess);

		isSuccess = a < b;
		System.out.println(isSuccess);

		isSuccess = a >= b;
		System.out.println(isSuccess);

		isSuccess = a <= b;
		System.out.println(isSuccess);

		isSuccess = a == d; // 자료형이 아닌 값만 비교!!!
		System.out.println(isSuccess);

		isSuccess = a != d;
		System.out.println(isSuccess);

		System.out.println(4 & 5);
		System.out.println(4 | 5);
		System.out.println(4 ^ 5);

		// shortcircuit = a&&b => a가 false이면 b 연산하지 않음
		// = a||b => a가 True이면 b 연산하지 않음
		a = 10;
		b = 20;
		isSuccess = (a == b) && (++a == b++);
		System.out.println(isSuccess);
		System.out.println(a); // a와 b 연산을 하질 않아!! 왜냐면 and연산에서 앞이 틀렸으니까!!(short circuit)
		System.out.println(b);

		// + => 연결연산자와 산술연산자(두개 모두 숫자일 경우)
		System.out.println(1 + 2 + 3 + "456"); // 6456 => 3 뒤에 +가 연결연산자
		System.out.println("123" + 4 + 5 + 6); // 123 뒤 +가 연결연산자, 그 뒤 모든 + 연결연산자
												// 더하고 싶으면, ()로!! 최고우선순위이니까

	}
}
