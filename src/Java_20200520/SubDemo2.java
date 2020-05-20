package Java_20200520;

public class SubDemo2 {

	public static void change(Super sup) {
		sup.age = 20;
		sup.playBaduk();
		sup.work(); // Sub work()호출=오버라이딩 되어서	
	}

	public static void main(String[] args) {
		Sub s1 = new Sub();
		System.out.println(s1.age);

		change(s1); // 가능할까?

		System.out.println(s1.age);

	}
}
