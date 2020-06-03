package Java_20200525;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo { // io 에서는 예외처리 필수!!
	public static void main(String[] args) {
		FileInputStream fis = null; //try안으로 안넣는 이유 : try 안에서만 유용한 변수가 되어 finally에서 쓸수가 없다. 
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("c:\\dev\\git-bash.exe"); //소스가 바이너리파일
			fos = new FileOutputStream("c:\\dev\\git-bash11.exe");

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
