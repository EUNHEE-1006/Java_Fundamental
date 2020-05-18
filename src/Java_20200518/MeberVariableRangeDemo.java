package Java_20200518;

public class MeberVariableRangeDemo  {
		String name;
		int age;
		double weight;
		boolean isReleased;

	public void methodA(String id) {
		//지역변수에는 접근 한정자를 붙일 수 없다.
		//public int test;
	}
	public static void main(String[] args) {
		MeberVariableRangeDemo m = new MeberVariableRangeDemo();
		//멤버변수는 객체를 생성하면 기본값을 갖는다.
		
		System.out.println(m.name);
		System.out.println(m.age);
		System.out.println(m.weight);
		System.out.println(m.isReleased);
		
	}
9}
