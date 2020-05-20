package Java_20200520.step3;

public class StopWatchDemo {
	
	
	public static void main(String[] args) {

		StopNanoWatch c1 = new StopNanoWatch();

		c1.start();
		for (long i = 0; i < 7000_000_000l; i++) {

		}
		c1.stop();

		double elapsedTime = c1.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);
	}

}
//shift tab => 당겨짐
//메인 코드는 안바꾸고, 변경사항이 있을 때마다 코드를 추가만 하도록 코딩을 해야해