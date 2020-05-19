package Java_20200519;

public class AdminDemo {
	public static void main(String[] args) {
		//생성자 만들기
		Admin a = new Admin("pmi3001", "dkwkdkdkwk33", "pmi3001@gmail.com", 1);
		//생성자도 오버로딩이 가능하다!!!
		Admin b = new Admin("pmi3001", "dkwkdkdkwk33", "pmi3001@gmail.com");
		
		//new Admin().setId("pmi3001"); //a변수 안쓸꺼면 이것도 가능해
		//a.setId("pmi3001");
		//a.setPwd("dkwkdkwk33");
		//a.setEmail("pmi3001@gmail.com");
		//a.setLevel(1);
		
		//String id = a. getId(); //이렇게 쓰는 이유는 밑에서 재사용할 이유로!!
		
	
		System.out.println(a.getId());
		System.out.println(a.getPwd());
		System.out.println(a.getEmail());
		System.out.println(a.getLevel());

		System.out.println(b.getId());
		System.out.println(b.getPwd());
		System.out.println(b.getEmail());
		System.out.println(b.getLevel()); //ctrl+alt, alt 방향키
	}
}
