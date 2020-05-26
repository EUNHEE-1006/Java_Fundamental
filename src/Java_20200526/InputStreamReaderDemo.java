package Java_20200526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {

		InputStream in = System.in; // 표준 입력장치 키보드와 연결되어 있음
		InputStreamReader isr = null;
		BufferedReader br =null;
		
		try {
			
			isr = new InputStreamReader(in); //1 byte => 2 byte 기능
			br = new BufferedReader(isr);// stream chaining
			String readLine =null;
			System.out.println("입력하세요>");
			while((readLine=br.readLine())!=null) {
				System.out.println(readLine);
				System.out.println("입력하세요>");
			}
			/* 1바이트로 처리한 것! => 얘는 바이트 크기를 정하기 어려워 100바이트라고 어떻게 확신하니?
			System.out.print("입력하세요>");
			byte[] b = new byte[100];
			int readByteCount = 0;
			while ((readByteCount = in.read(b)) != -1) {// enter를 치는 순간, byte[]로 들어간다.
				String str = new String(b, 0, readByteCount);
				System.out.println(str);
				System.out.print("입력하세요>");
			}*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
