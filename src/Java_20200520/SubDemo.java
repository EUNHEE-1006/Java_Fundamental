package Java_20200520;

public class SubDemo {
	public static void main(String[] args) {
		Super s1 = new Super();
		System.out.println(s1.age);
		s1.playBaduk();
		s1.work();

		Sub s2 = new Sub();
		System.out.println(s2.height);
		s2.playGame();
		s2.work();

		s2.age = 20;
		System.out.println(s2.age);
		s2.playBaduk();

		// Super s3 = new Sub(); ==>Super가 객체를 생성하지 못하는 경우(=부모가 추상클래스)에 사용. 자식의 도움을 받아서 메모리에 로드~!!!!
		//추상클래스는 반드시 자식클래스가 있어야
		Super s3 = s2; //=>s3에 s2 주소를 넣긴하지만, 타입이 super이기 때문에 s3는 안을 가르켜 age=20이 나온다. 객체를 새로 만드는 것이 아님.
		System.out.println(s3.age);
		s3.playBaduk();
		s3.work();

		// s3.height =20;
		// s3.playgame();
	}

}
