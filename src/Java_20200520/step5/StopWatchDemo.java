package Java_20200520.step5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StopWatchDemo {
	public static void run(StopWatch c1) {
		c1.execute();
	}
	
	public static void main(String[] args) throws Exception { //메인에서는 객체생성하고, 함수호출로만 끝나야, 

		//StopMicroWatch c1 = new StopMicroWatch(); //목적 : 오직 이것만 코드가 변하게 하고, 나머지는 같게 코딩해라
		//run(c1);
		
		//IO, reflection에 관한 것= 문자열로 되어있는 걸 객체화 할 수 있다, 프레임워크를 쓰는 사람은 필수.
	
		//java IO 20-21
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\dev\\eclipse-workspace\\Java_Fundamental\\src\\Java_20200520\\step5\\class.txt")); //import=>ctrl + shift + o
		String readLine = br.readLine();
		
		
		//java Reflection 23-26
		Class clazz = Class.forName(readLine); //txt파일의 첫번째 줄이 들어가 있어
		StopWatch s = (StopWatch)clazz.newInstance();
		run(s);
	
	}
}
