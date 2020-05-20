package Java_20200520.step1;


	public class FootStepWatch {
		private long startTime;
		private long endTime; // 전역변수

		public double getElapsedTime() {
			return (double) (endTime - startTime) / 1000;
		}

		public static void main(String[] args) {
			FootStepWatch f1 = new FootStepWatch(); // 객체생성 필수

			// 1970년 1월 1일부터 지금까지 시간을 밀리 세컨드로 변환
			f1.startTime = System.currentTimeMillis();
			for (long i = 0; i < 7000_000_000l; i++) {

			}

			f1.endTime = System.currentTimeMillis();
			double elapsedTime = f1.getElapsedTime();

			System.out.printf("경과시간 : %.3f", elapsedTime);

		}

}
