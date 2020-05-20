package Java_20200520.step3;

public class StopMilliWatch {
	long startTime;
	long endTime;
	
	public double getElapsedTime() {
		return (double) (endTime - startTime) / 1_000;
	}
	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		endTime = System.currentTimeMillis();
	}


}
