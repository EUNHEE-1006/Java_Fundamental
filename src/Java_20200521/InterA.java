package Java_20200521;

public interface InterA extends InterB, InterC {
	//인스턴스의 변수 public static final이 생략돼 있음.
	public static final double PI = 3.14; //InterA. PI로 접근하면 된다. 그래서 final로 한 것임.
	//인터페이스 메서드의 접근 한정자를 붙히지 않으면, public
	//abstract 생략가능
	public abstract void mA();
}
