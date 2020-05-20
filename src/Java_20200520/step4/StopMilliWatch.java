package Java_20200520.step4;

public class StopMilliWatch {
	private long startTime;
	private long endTime;

	private double getElapsedTime() {
		return (double) (endTime - startTime) / 1_000;
	}

	private void start() {
		startTime = System.currentTimeMillis();
	}

	private void stop() {
		endTime = System.currentTimeMillis();
	}

	public void execute() {
		start();
		for (long i = 0; i < 7000_000_000l; i++) {

		}
		stop();
		double elapsedTime = getElapsedTime();
		System.out.printf("경과시간 : %.3f", elapsedTime);
	} //private 하는 이유 = 모두 execute를 하기 위함이니까. 사용자는 저것만 알면 돼

}
