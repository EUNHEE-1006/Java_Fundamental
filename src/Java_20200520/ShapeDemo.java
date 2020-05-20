package Java_20200520;

public class ShapeDemo {
	//추상클래스의 다형성
	public static void run(Shape s) {
		s.draw();
	}
	/*public static void run(Triangle s) {
		s.draw();
	}

	public static void run(Circle c) {
		c.draw();
	}

	public static void run(Rectangle r) {
		r.draw();
	}*/

	public static void main(String[] args) {
		// 추상클래스는 객체생성금지
		// Shape s1 = new Shape();

		Rectangle r1 = new Rectangle();
		run(r1);

		Circle c1 = new Circle();
		run(c1);
		
		Triangle s1= new Triangle();
		run(s1);
	}
}
