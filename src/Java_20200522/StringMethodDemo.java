package Java_20200522;

public class StringMethodDemo {
	public static void main(String[] args) {
		String ssn = "111111-111118";

		// charAt(int index) : 문자열중에서 특정 index에 있는 문자를 반환
		char c = ssn.charAt(6);
		System.out.println(c);

		// concat(String msg) : 문자열 연결, +를 사용하는게 아니라!!
		// 잘 안써,, +를 많이 씀
		ssn = ssn.concat("abc");
		ssn = ssn + "abc";
		System.out.println(ssn);

		// endwith(String msg) : msg문자열로 끝나면 true, false
		String fileName = "abcd.doc";
		if (fileName.endsWith("doc")) {
			System.out.println("워드문서 입니다.");
		} else if (fileName.endsWith("zip")) {
			System.out.println("압축파일입니다.");
		} else {
			System.out.println("파일 입니다.");
		}

		String url = "http://www.naver.com";
		String path = "/news/ssss.do?id=123";

		// startsWith(String msg) : msg 문자열로 시작하면 true, false
		if (path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		} else if (path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		} else {
			System.out.println("페이지가 존재하지 않습니다.");
		}

		// equalsIgnoreCase(String msg) : 대소문자를 구분하지 않고, 문자열을 비교한다.
		boolean success = fileName.equalsIgnoreCase("abce.DOC");

		// indexOf(String msg) : msg 문자열의 위치를 반환
		int index = ssn.indexOf("-");
		System.out.println(index);

		// lastOfIndex(String msg) : msg 문자열의 위치를 마지막에 시작하여
		// 찾고, index는 처음부터 msg문자열 까지 index반환
		fileName = "abc.abc.abc.doc"; // 파일이름과 확장자를 구분해야할때!!=>lastIndex 찾는거 뒤에서부터 찾아!!
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		// 점이 많아서 구분이 안되잖아

		// 중요!!! 배열의 길이 : length, 문자열의 길이는 length()
		// trim() : 앞뒤 문자열의 공백 제거
		// 문자열이 주어지면 무조건 trim부터 하고, 비교!!

		// substring(int first, int last)
		// first는 포함, second는 미포함.

		// substring (int first)
		// first를 포함해서 보다 큰 모든 문자열을 출력
		// 숫자 고정시키지 말기 = 문자열이 고정이 아니니까!!
		fileName = "abc.doc";
		String first = fileName.substring(0, fileName.indexOf(".")); // 앞의 수는 포함을 하고, 뒤에는 포함하지 않고 가져와!!
		String last = fileName.substring(fileName.indexOf(".") + 1); // 끝 지정 안하면 다 갖고 옴
		System.out.println(first);
		System.out.println(last);

		// replaceAll(String first, String second)
		// first문자열을 second 문자열로 대체
		String html = "안녕하세요 \n저는 박은희 입니다.\n잘 부탁드립니다.";
		html = html.replaceAll("\n", "<br>"); // 인터넷에서 우리가 엔터칠 때 들어가는 값을 바꿔줘야 해!!
		System.out.println(html);

		// toUpperCase() : 대문자로 변환
		String m1 = "hello";
		m1 = m1.toUpperCase();

		System.out.println(m1);

		// toLowerCase() : 소문자로 변환
		m1 = m1.toLowerCase();
		System.out.println(m1.toString());

		// String.valueOf(~) : primitive data type을 문자열로 변환
		char[] c1 = { 'a', 'b', 'c' }; // 유용해. =abc로 합쳐주거든
		String msg = String.valueOf(c1);
		String mmsg = String.valueOf(true); // = "true"
		System.out.println(msg);

		String[] str = ssn.split("-");
		String ssn1 = str[0];
		String ssn2 = str[1];

		System.out.println(ssn1);
		System.out.println(ssn2);

		String str2 = String.format("%,.2f", 1222223.4567); // =printf
		System.out.println(str2);

		str2 = String.format("%3$,f%n %,20.2f%n %,50.1f%n", 12896.450, 387545.560, 34234.56); // 3번째게 들어감
		System.out.println(str2);

	}

}
