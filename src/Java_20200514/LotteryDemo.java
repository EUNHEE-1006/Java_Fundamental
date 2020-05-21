package Java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
		// 로또복권
		// 1. 1부터 45까지의 숫자 중 임의 숫자 6개를 생성한다.
		// 2. 6개의 숫자 중 중복된 숫자가 나오면 안된다.

		// Math.random() => 0보다 크거나 같고, 1보다 작은 양수를 double 값으로 변환한다.
		// 0.00000 ~ 0.99999

		Lottery lottery = new Lottery();
		lottery.lotto = new lotto[6];
		
		lottery.createNumber();
		lottery.acending();
		lottery.print();

		// 중복금지

		// 오름차순

		// Bubble Sort = 뒤쪽으로 가장 큰 수를 배치!!!

		/*
		 * for (int i = 0; i < lotto.length; i++) { for (int j = 0; j <
		 * lotto.length-(i+1);j++) { if (lotto[j]>lotto[j+1]) { temp=lotto[j+1];
		 * lotto[j+1]=lotto[j]; lotto[j]=temp; } } }
		 */

		// 출력하기

	}
}

//역시 git은 좋아!!!
//배열과 알고리즘!!!