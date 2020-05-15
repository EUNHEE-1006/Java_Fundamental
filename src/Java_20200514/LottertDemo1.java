package Java_20200514;

public class LottertDemo1 {
	// 로또복권
	// 1. 1부터 45까지의 숫자 중 임의 숫자 6개를 생성한다.
	// 2. 6개의 숫자 중 중복된 숫자가 나오면 안된다.

	// Math.random() => 0보다 크거나 같고, 1보다 작은 양수를 double 값으로 변환한다.
	// 0.00000 ~ 0.99999

	public static void main(String[] args) {
		int[] lotto = new int[6];

		again: for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1;

			for (int j = 0; j < i; j++) {
				if (random == lotto[j]) {
					i--;
					continue again;
				}
			}
			lotto[i] = random;
		}
		
		for (int value : lotto) {
			System.out.print(value + "\t");
		}
		System.out.println();

		for (int j = 0; j < lotto.length; j++) {
			for (int j2 = 0; j2 < j; j2++) {
				if (lotto[j2] > lotto[j]) {
					int temp = lotto[j2];
					lotto[j2] = lotto[j];
					lotto[j] = temp;
				}
			}
		}

		for (int value : lotto) {
			System.out.print(value + "\t");
		}
	}
}
