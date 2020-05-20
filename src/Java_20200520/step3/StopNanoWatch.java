package Java_20200520.step3;

public class StopNanoWatch {
	long startTime;
	long endTime;
	
	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1_000_000_000;
	}

	public void start() {
		startTime = System.nanoTime();
	}

	public void stop() {
		endTime = System.nanoTime();
	}

}
