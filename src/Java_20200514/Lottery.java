package Java_20200514;

public class Lottery {
	public int[] lotto;
	
	public void createNumber() {
		for (int i = 0; i < lotto.length; i++) {
			int random = (int) (Math.random() * 45) + 1;
			check(random, i);
		}
	}
	
	public void check(int random, int i) {
		for (int j = 0; j < i; j++) {
			if (lotto[j] == random) {
				i--;  
				createNumber();
			}
		}
		lotto[i] = random;
	}
	
	public void acending() {
		for (int j = 0; j < lotto.length; j++) {

			for (int k = 0; k < j; k++) {
				if (lotto[k] >= lotto[j]) {
					int temp = lotto[k];
					lotto[k] = lotto[j];
					lotto[j] = temp;
				} 
			}
		}
	}
	public void print() {
		for (int value : lotto) {
			System.out.print(value + "\t"); //쌍 따옴표 주의!!!
		}
		
	}
}
