package Java_20200525;

public class TryCatchDemo {
	public static double getAvg(int korean, int english) {
		int sum = korean + english;
		double avg = (double) sum / 2;
		return avg;
	}

	public static void main(String[] args) {
		try {
			int korean = Integer.parseInt(args[0]); // run configuration => arguments
			int english = Integer.parseInt(args[1]);
			// 발생할 수 있는 에러
			// 1. int형 아닌경우
			// 2. 배열인자를 넣지 않았을 경우

			double avg = getAvg(korean, english);
			System.out.printf("평균 : %f \n", avg);
		} catch (ArrayIndexOutOfBoundsException e) { // 잘못됐을때만 출력,,,
			System.out.println("예외 메세지 : " + e.getMessage());
			// OR
			System.err.println("2개 넣어!");
			/*
			 * 일반 출력 : System.out 에러 출력 : System.err
			 */

			e.printStackTrace();

		} catch (NumberFormatException e) {
			System.err.println("예외 메시지 : " + e.getMessage());
			System.err.println("문자말고 숫자 넣어");
		} finally {
			System.out.println("finally");
		}

		// catch 블럭이 여러개 있을 경우, 위에서 부터 하위 클래스 => 상위 클래스 순으로 정한다.
		// catch 블럭은 최상위 클래스를 가장 하위에 둬야해 ex>Exception - Number~~Exception 안돼

		// 중요!!!!!!
		// Throws 의 기준은 부모 클래스!!
		// error, runtimeerror 이면 예외처리 안해도 되고,
		// 나머지는 반드시 예외처리 해줘야해!!!

	}

}
