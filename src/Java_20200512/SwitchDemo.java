package Java_20200512;

public class SwitchDemo {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = null;
		switch (month) {
		// month => 수식(char, byte, short, int, string)
		// case 평가값 => 반드시 유일해야 한다.
		// case 절에 break 가 없으면 전부 다 실행!!!
		// break는 맨 마지막 case 에는 필요가 없다!!
		case 12:

		case 1:

		case 2:
			season = "겨울";
			break;
		case 3:

		case 4:

		case 5:
			season = "봄";
			break;
		case 6:

		case 7:

		case 8:
			season = "여름";
			break;
		case 9:

		case 10:

		case 11:
			season = "가을";
			break;
		default: //default의 위치는 어디든 상관없다!!, 다만 중간에 들어갈 땐, break를 넣어주어야 한다.
			season = "없는 계절";
		}

		System.out.println(month + "월은 " + season + " 입니다.");
	}
}
