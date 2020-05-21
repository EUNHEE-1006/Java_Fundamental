package Java_20200521;

public class ImplementCDemo {
	public static void main(String[] args) {
		InterA i = new ImplementC();
		
		i.mA();
		
		i.mB();
		
		i.mC();
		//인터페이스에 있는 변수는 변경불가
		//InterA.PI =3.15;
		
		System.out.println(InterA.PI);
	}
}
