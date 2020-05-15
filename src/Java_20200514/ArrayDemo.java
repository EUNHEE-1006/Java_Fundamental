package Java_20200514;

public class ArrayDemo {
	public static void main(String[] args) {
		// 1. 배열 선언과 생성
		int[] a = new int[4];

		// 2. 배열 할당
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;

		// 3. 배열 출력
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// 배열선언, 생성, 할당
		int[] b = { 100, 200, 300, 400, 500 };
		b[0] = 101;
		b[1] = 201;
		b[2] = 301;
		b[3] = 401;
		b[4] = 501;

		// 배열출력=>for ===>index를 필요로 할때!!!
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		// 배열출력=> enhanced for loop ===>무조건 다 출력!!!
		for (int temp : b) {
			System.out.println(temp);

		}

		// primitive 와 reference와 차이가 커!!!
		int[] c = a; // 가능

		c[0] = 11;
		
		System.out.println(a[0]);
		System.out.println(c[0]);
		
		
	}
}
