package Java_20200514;

public class LotteryDemo {
	public static void main(String[] args) {
		// 로또복권
		// 1. 1부터 45까지의 숫자 중 임의 숫자 6개를 생성한다.
		// 2. 6개의 숫자 중 중복된 숫자가 나오면 안된다.

		// Math.random() => 0보다 크거나 같고, 1보다 작은 양수를 double 값으로 변환한다.
		// 0.00000 ~ 0.99999

		int[] lotto = new int[6];
		int temp = 0;

		outter: for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1;

		// 중복금지
			for (int j = 0; j < i; j++) {
				if (lotto[j] == random) {
					i--;  
					continue outter;
				}
			}
			lotto[i] = random;
		}

		// 오름차순
		for (int j = 0; j < lotto.length; j++) {

			for (int k = 0; k < j; k++) {
				if (lotto[k] >= lotto[j]) {
					temp = lotto[k];
					lotto[k] = lotto[j];
					lotto[j] = temp;
				} 
			}
		}
		
		//Bubble Sort = 뒤쪽으로 가장 큰 수를 배치!!!
		
		/*for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < lotto.length-(i+1);j++) {
				if (lotto[j]>lotto[j+1]) {
					temp=lotto[j+1];
					lotto[j+1]=lotto[j];
					lotto[j]=temp;
				}
			}
		}*/
		
		//출력하기
		for (int value : lotto) {
			System.out.print(value + "\t"); //쌍 따옴표 주의!!!
		}
	}
}

//역시 git은 좋아!!!
//배열과 알고리즘!!!