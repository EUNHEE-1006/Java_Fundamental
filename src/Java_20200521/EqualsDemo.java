package Java_20200521;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");

		System.out.println(s1 == s2); // false
		System.out.println(s1.contentEquals(s2)); // true, String은 내용!!!이 같으면 트루가 나오게 오버라이딩!!을 한다.

		Customer c1 = new Customer("박은희", "고성군");
		Customer c2 = new Customer("박은희", "고성군");
		
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2)); //true로 만들기 위해서 오버라이딩 해줘야!!!
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		System.out.println(c1.toString());
		System.out.println(s1.toString()); //String 이니까!!!
	}
}
