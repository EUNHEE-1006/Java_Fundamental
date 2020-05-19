package Java_20200515;

//Customer class
public class Customer {
	//클래스의 멤버 변수 - instance 변수, static 변수, final 변수
	//instance valuable(name, email, phone, balance, isReleased)
	//인스턴스 변수 = 객체가 생성될 때만 만들어지는 변수
	public String name;
	public String email;
	public String phone;
	public double balance;
	public boolean isReleased;
	public static double interestRate; //static!!! class 어디에서든 사용이 가능하다.
									   //class 이름으로 접근해!!!
	//final은 상수, 변하지 않아, 그래서 static final을 거의 써!!, 한번 정해지면 못바꿔\
	//final은 instance변수로 두면 안돼(모든 객체에 존재할 이유가 없으니까) 
	//상수는 무조건 대문자,,, 
	public static final String BANKNAME="신한은행";
}
