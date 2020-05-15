package Java_20200513;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
//1~10까지의 합
		for (int i = 0; i <= 10; i++) {
			sum += i;
		} // for
		System.out.printf("1부터 10까지의 합은 %d 입니다.%n", sum);

		sum = 0;
//1~10까지 짝수의 합
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			} // if
		} // for
		System.out.printf("1부터 10까지 숫자 중 짝수의 합은 %d 입니다 %n", sum);
//구구단~~		
		System.out.println();
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %d%n", i, j, i * j);
			} // for i
			System.out.println();
		} // for j
		
//9단부터 2단까지~~
		for (int i = 9; i >= 2; i--) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d%n", i, j, i * j);
			} // for i
			System.out.println();
		} // for j
// *찍어내기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.printf(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf(" ");
			}
			for (int j = 0; j < 5 - i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		System.out.println();
	
	}// main
}// class
