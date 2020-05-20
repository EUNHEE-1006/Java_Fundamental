package Java_20200520.stepm;

public class FootStepWatch {
	public static void main(String[] args) {
		
		//1970년 1월 1일부터 지금까지 시간을 밀리 세컨드로 변환
		long startTime =System.currentTimeMillis();
		for (long i = 0; i < 7000_000_000l; i++) {
			
		}
		
		long endTime =System.currentTimeMillis();
		
		double elapsedTime = double(endTime -startTime)/1000;
		
		System.out.printf("경과시간 : %f", elapsedTime);
	
	}
}
