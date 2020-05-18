package Java_20200518;

public class MethodDemo {
	public boolean isLeafYear(int year) { // 매개변수
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}

	public long plus(int first, int second) {
		return (long) first + (long) second; // 반드시 2개 long
	}

	public double divide(int first, int second) {
		return (double) first / (double) second; // double 하나만해도!!
	}

	public void println(String message) {
		System.out.println(message);
	}
	public int[] ascending(int[] lotto) { //배열 선언 주의
		
		for (int j = 0; j < lotto.length; j++) {
			for (int k = 0; k < j; k++) {
				if (lotto[k] >= lotto[j]) {
					int temp = lotto[k];
					lotto[k] = lotto[j];
					lotto[j] = temp;
				} 
			}
		}
		return lotto;
	}

	public static void main(String[] args) {
		MethodDemo m = new MethodDemo();
		boolean test = m.isLeafYear(2000); // argument
		if (test) {
			m.println("윤년입니다.");
		} else {
			m.println("윤년이 아닙니다.");
		}
		long result = m.plus(10000000, 1212121212);
		System.out.println(result);

		double result2 = m.divide(12, 5);
		System.out.println(result2); //메서드 만들어놔서 공유 안해!!
		
		int[] lotto= {52,56,98,47,82};
		m.ascending(lotto);
		for(int value : lotto) {
			System.out.print(value + "\t");
		}
		
	}

}
