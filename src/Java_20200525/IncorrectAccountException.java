package Java_20200525;

public class IncorrectAccountException extends Exception {
	public IncorrectAccountException(String msg) {
		super(msg); //exception의 매개변수 하나짜리 호출
	}
}
