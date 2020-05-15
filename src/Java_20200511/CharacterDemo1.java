package Java_20200511;

public class CharacterDemo1 {
	public static void main(String[] args) {

		// 1. 유니코드 표현법
		char c1 = '\uBC15';
		char c2 = '\uC740';
		char c3 = '\uD76C';
		System.out.print(c1);
		System.out.print(c2);
		System.out.print(c3);

		// 2.ASCII 표현법
		char c4 = 97;
		System.out.println(c4);

		// 3.문자 표현법
		char c5 = '박';
		char c6 = '은';
		char c7 = '희';
		System.out.print(c5);
		System.out.print(c6);
		System.out.print(c7);

		System.out.println("aa" + '\t' + "bb");
		System.out.println("aa" + '\n' + "bb");
		System.out.println("aa" + '\r' + "bb");

	}
}
