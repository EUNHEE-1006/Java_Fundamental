package Java_20200512;

public class CastingDemo {
	public static void main(String[] args) {
		// byte 범위를 넘어가면 에러발생
		// 형변환을 하면 circuit 발생, 노에러
		// circuit = 전혀 이상한 값이 나옴, 값이 돌아
		byte a = (byte) 128;
		System.out.println(a);

		// float, double 값을 정수형으로 캐스팅시, 소수점 이하 아웃
		// cut 발생
		int b = (int) 42.5;
		System.out.println(b);

	}
}
