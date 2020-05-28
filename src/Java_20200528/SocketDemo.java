package Java_20200528;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketDemo {
	public static void main(String[] args) {
		Socket socket =null;
		try {
			socket = new Socket("13.209.108.253",0);
			System.out.println(80 + "빈 포트가 열려 있습니다.");
		} catch (UnknownHostException e) {
			System.err.println("호스트가 없습니다.");
		
		} catch (IOException e) {
			System.err.println(80 +"번 포트가 닫혀있습니다.");
		}
		
	}
}
