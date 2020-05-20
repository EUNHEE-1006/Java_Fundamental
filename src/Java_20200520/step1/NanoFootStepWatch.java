package Java_20200520.step1;


	// 2. 나노 세컨드로 경과시간을 알려주는 어플리케이션을 만들어주세요.
	// 아 근데 분명히 또 밀리를 원할텐데,, => 둘다 처리하는 코딩 짬
	public class NanoFootStepWatch {

		long startTime;
		long endTime; // 전역변수

		long startNanoTime;
		long endNanoTime;

		public double getElapsedTime() {// 소숫점 이하 3자리
			return (double) (endTime - startTime) / 1_000;
		}

		// 소숫점 이하 6자리 = 마이크로세컨드
		public double getElapsedNanoTime() {// 소숫점 이하 9자리
			return (double) (endNanoTime - startNanoTime) / 1_000_000_000;
		}

		public static void main(String[] args) {
			NanoFootStepWatch c1 = new NanoFootStepWatch();
			c1.startNanoTime = System.nanoTime();
		

			c1.endNanoTime = System.nanoTime();
			double elapesedTime = c1.getElapsedNanoTime();
			System.out.printf("경과시간 : %.9f", elapesedTime);
		}
}
