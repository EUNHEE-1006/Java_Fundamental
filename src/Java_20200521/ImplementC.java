package Java_20200521;

public class ImplementC implements InterA {// 추상메서드, 인터페이스는 오버라이딩 필수!!!!

	public void mA() {//인터페이스 접근한정자는 public 생략!!
		System.out.println("mA()");
	}

	public void mB() {
		System.out.println("mB()");
	}

	public void mC() {
		System.out.println("mC()");
	}

}
