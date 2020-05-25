package Java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo { // io 에서는 예외처리 필수!!
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("c:\\dev\\jdk-11.0.7_windows-x64_bin.exe");
			fos = new FileOutputStream("c:\\dev\\jdk.exe");

			int readByte = 0;
			// fis.read() : 한바이트 읽어 반환한다. 더이상 읽을 바이트가 없으면 -1을 반환
			while ((readByte = fis.read()) != -1) { // io는 초기값, 증감이 없기에 for문 거의 안씀!!!!! 모두 while!!!!!
				// for write : 한 바이트 쓰기
				fos.write(readByte);

			}
			// io는 연결대상이 파일, 네트워크는 연결대상이 상대 호스트.

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
