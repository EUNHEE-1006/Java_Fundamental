package Java_20200525;

public class ThrowsDemo {

	public static int getDivide(int first, int second) throws ArithmeticException {

		int result = first / second; // try catch로 second값을 0이 아닌 다른 값을 받을 수가 없어.그러니 던져!! =user 잘못

		return result;
	}
	//main에다가 try catch로 넘겨유
	//메소드에서는 throws로 던져요!! main에서 처리하게!!
	//runtime 서브면, 예외처리 해도 되고 안해도 되지만 해!!
	//runtime 부모면, 반드시!! => 오히려 더 쉬워, 해야하니까 
	
	
	public static void main(String[] args) {
		try {
			int first = Integer.parseInt(args[0]);
			int second = Integer.parseInt(args[1]);

			int result = getDivide(first, second); // 예외 발생해서 던져주면 에러는 안나. JVM이 잡아주니까 그래서 에러메시지 뿌려줘
			System.out.printf("결과 : %.2d \n", result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("인자를 2개 입력하셔야 합니다.");

		} catch (NumberFormatException e) {
			System.err.println("인자에는 숫자를 넣어야 합니다.");

		} catch (ArithmeticException e) {
			System.err.println("0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("finally");// finally는 무조건 실행!!
		}
		System.out.println("끝"); //catch가 있으면, 그 이후에 문장도 실행됨. 없으면 JVM으로 권한이 넘어가서 실행되지 않음.
		

	}
}
