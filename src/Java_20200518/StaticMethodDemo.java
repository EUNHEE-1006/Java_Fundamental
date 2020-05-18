package Java_20200518;

public class StaticMethodDemo {
	String name;
	static double interestRate;

	public void m1() {
		// instance 메서드에서는 instance 변수, static 변수, 모두 사용가능
		// instance 메서드에서는 instance 메서드,static 메서드 모두 호출가능
		this.name = "박은희"; // 메서드 변수는 항상 앞에 reference가 생략되어 있는데, 그게 this 자기자신 객체.
		StaticMethodDemo.interestRate = 4.2; // static은 클래스이름이 생략.
		this.m2();
		StaticMethodDemo.m4();
	}

	public void m2() {
		System.out.println("m2() 인스턴스 매서드 호출");
	}

	public static void m3() {
		// static 메서드에서는 static 변수만 접근가능
		// static 메서드에서는 static 메서드만 호출가능
		// static 메서드에서는 this를 사용할 수 없음.
		// name = "박준형";
		StaticMethodDemo.interestRate = 3.9;
		// m2();
		StaticMethodDemo.m4();

		// static 메서드에서 instance 변수와 메서드를 사용하려면
		// 객체를 생성해서 사용해야 한다.

		StaticMethodDemo m1 = new StaticMethodDemo();
		m1.name = "박은희";
		m1.m2();
	}

	public static void m4() {
		System.out.println("m4() static 매서드 호툴");

	}
	public static void main(String[] args) {
		StaticMethodDemo.m4(); //객체생성없이 바로 호출해서 사용해!!
		m3();
		interestRate = 4.3;
		
		//m1(); 반드시 객체 있어야.!!
		//m2();
	}
}
//결국 instance는 그 안에서 쓸 목적으로
//static은 공용으로 쓸 목적으로 
