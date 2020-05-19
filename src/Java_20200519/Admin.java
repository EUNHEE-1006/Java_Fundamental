package Java_20200519;

public class Admin { // 무조건 private
	private String id;
	private String pwd;
	private String email;
	private int level;

	
	// default 생성자= 매개변수 없는 생성자
	public Admin() { // private는 에러발생!!
		super(); // 부모클래스의 디폴트 생성자를 호출
	}

	// 생성자(Constructor)
	// 생성자는 반환값이 없고, 이름은 클래스 이름과 동일
	// 생성자의 역할은 인스턴스 변수 초기화
	public Admin(String id, String pwd, String email, int level) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.level = level;
	}

	public Admin(String id, String pwd, String email) {
		// this.id=id;
		// this.pwd=pwd;
		// this.email=email;
		this(id, pwd, email, 0); // 중복피하기 위해서 =다른 생성자를 호출, 반드시 생성자에서만 호출 가능
		// this 용법 2가지
		// 1. 자기자신 객체=>this.
		// 2. 다른 생성자를 호출 =>this(~,,,)
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

}

//단축키
//1. 디폴트 => alt + shift + s + c
//2. 매개변수 있는 생성자 => alt + shift + s + o
//3. setter, getter => alt + shift + s + r
