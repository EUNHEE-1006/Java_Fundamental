package Java_20200520.step2;

public class StopWatch {
	long startTime;
	long endTime;

	long startNanoTime;
	long endNanoTime;


	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1_000;
	}
	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	public double getNanoElapsedTime() {
		return (double) (endNanoTime - startNanoTime) / 1_000_000_000;
	}

	public void nanoStart() {
		startNanoTime = System.currentTimeMillis();
	}

	public void nanoStop() {
		endNanoTime = System.nanoTime();
	}

}
