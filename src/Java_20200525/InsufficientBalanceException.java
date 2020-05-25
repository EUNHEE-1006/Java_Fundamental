package Java_20200525;

//사용자 정의 예외 클래스
//자바에서 제공하는 예외클래스가 없기 때문에 
//개발자가 직접 생성
public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
