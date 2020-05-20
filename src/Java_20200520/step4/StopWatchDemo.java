package Java_20200520.step4;


public class StopWatchDemo {
	public static void run(StopMilliWatch c1) {
		c1.execute();
	}
	
	public static void run(StopNanoWatch c1) {
		c1.execute();
	}
	
	public static void main(String[] args) { //메인에서는 객체생성하고, 함수호출로만 끝나야, 

		StopNanoWatch c1 = new StopNanoWatch(); //목적 : 오직 이것만 코드가 변하게 하고, 나머지는 같게 코딩해라
		run(c1);
	}
}
