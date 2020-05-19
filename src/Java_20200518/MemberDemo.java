package Java_20200518;

public class MemberDemo {
	public static void main(String[] args) { 
		//무조건 메서드를 통해서만 접근하고, 변경하여라!!!!
		//m.name ="박은희";
		//System.out.println(m.name);
		Member m = new Member();
		m.setName("박은희");
		m.setZipcode("12345");
		m.setAddr1("경기도");
		m.setAddr2("안양시");
		m.setSsn1("1111");
		m.setSsn2("5555");
		m.setAge(26);
		m.setRegdate("2020-05-18");
		
		System.out.println(m.getName());
		
	}
}
