package Java_20200520.step5;

public class StopMicroWatch extends StopWatch{
	private long startTime;
	private long endTime;
	
	
	private double getElapsedTime() {
		return (double) (endTime - startTime) / 1_000_000_000;
	}

	private void start() {
		startTime = System.nanoTime();
	}

	private void stop() {
		endTime = System.nanoTime();
	}
	
	public void execute() {
		start();
		for (long i = 0; i < 7000_000_000l; i++) {
			
		}
		stop();
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.6f", elapsedTime);
	}
}
