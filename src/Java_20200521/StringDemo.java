package Java_20200521;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");

		String s3 = "World";
		String s4 = "World";

		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true

		System.out.println(s3 == s4);// true, 새로운 객체생성없이
		System.out.println(s3.equals(s4));// true

	}

}
