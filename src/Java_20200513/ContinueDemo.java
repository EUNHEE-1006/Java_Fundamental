package Java_20200513;

//for문은 증감부분으로
//while은 평가부분으로
public class ContinueDemo {
	public static void main(String [] args) {
		int sum=0;
		for (int i = 1; i <10; i++) {
			if (i==6) {
				continue;
			}
			sum+=i;
		}
		System.out.printf("1부터 10까지의 합은 %d 입니다.(단, 6은 제외한다.)%n", sum);
		
	outter:	for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <=9; j++) {
				if (i==5) {
					continue outter;
				}
				System.out.printf("%d X %d = %d%n", i, j, i*j);
				
			}
		}
	}
}
