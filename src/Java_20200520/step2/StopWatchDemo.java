package Java_20200520.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch c1 = new StopWatch();
		c1.start();
		c1.nanoStart();
		
		for (long i = 0; i < 7000_000_000l; i++) {

		}
		c1.stop();
		c1.nanoStop();
		
		double elapsedTime = c1.getElapsedTime();
		double elapsedNanoTime=c1.getNanoElapsedTime();
		
		System.out.printf("경과시간(m/s) : %.3f", elapsedTime);
		System.out.println();
		System.out.printf("경과시간(n/s) : %.9f", elapsedNanoTime);
	}

}
