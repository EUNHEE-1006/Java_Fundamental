package Java_20200519;

public class Child extends Parent {
	String chicken;

	
	public void gotoSchool() {
		System.out.println("Child gotoSchool()");
	}

	// overriding
	public void play(String starcraft) {
		// super.play(starcraft);// 부모의 play method 재정의, 부모꺼 거의 생략.
		System.out.println("Child play()");
	}

	public void setParentMoney(int money) {
		super.money = money; // 부모 머니에 저장
	}

	public int getParentMoney() {
		return super.money;
	}
}
