package Java_20200511;

public class CharacterDemo {
	public static void main(String[] args) {

		// 유니코드 표현법
		char c1 = '\uBC15';
		char c2 = '\uC740';
		char c3 = '\uD76C';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		// 아스키코드 표현법 //임의의 문자를 출력할 때, 반드시 char이용!!
		// 48-57 => 0-9
		// 65-90 => A-Z
		// 97-122 => a-z
		char c4 = 97;
		System.out.println(c4);

		// 문자 표현법
		char c5 = '박';
		char c6 = '은';
		char c7 = '희';
		System.out.print(c5);
		System.out.print(c6);
		System.out.print(c7);

		char c8 = '\'';
		char c9 = '\\';

		System.out.println("aa" + '\t' + "bb");
		System.out.println("aa" + '\n' + "bb"); // '\n'은 윈도우 엔터
		System.out.println("aa" + '\r' + "bb"); // '\r'은 유닉스 엔터
		
		String msg = "wend";
		switch(msg) {
		case ("wend") : {
			System.out.println("dddd");
		}
		}

	}
}
