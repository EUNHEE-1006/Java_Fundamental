package Java_20200515.bb;

import Java_20200515.aa.Notice;

public class NoticeDemo extends Notice { //상속
	public static void main(String[] args) {
		Notice n1=new Notice(); //자바에서 다른 패키지의 클래스 생성 안되 => import
		n1.number=2;

		//protected, private, default 다 안됨.
		
		
		//부모 클래스인 Notice에서 접근할 수 있는 접근 한정자는 public, protected
		NoticeDemo n2 =new NoticeDemo();
		n2.number=3;
		n2.title="little prince";
	}
}
