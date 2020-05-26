package Java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class BufferedInputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			/*
			 * // 1. FileInputStream과 FileOutputStream을 이용해서 // 1byte 읽어서 1바이트 출력하는 예제. fis
			 * = new FileInputStream("c:\\dev\\git-bash.exe"); fos = new
			 * FileOutputStream("c:\\\\dev\\\\Git.exe");
			 * 
			 * int readByte = 0; long start = System.currentTimeMillis(); while ((readByte =
			 * fis.read()) != -1) { fos.write(readByte); } long end =
			 * System.currentTimeMillis();
			 * 
			 * System.out.printf("경과시간 %d %n", end-start);
			 * 
			 * 
			 * // 2. FileInputStream과 FileOutputStream을 이용하여 // 8192바이트를 읽어서 8192 바이트를 출력하는
			 * 예제 // 경과시간 : 0.01 fis = new FileInputStream("c:\\dev\\git-bash.exe"); fos =
			 * new FileOutputStream("c:\\dev\\Git.exe");
			 * 
			 * int readByteCount = 0; byte[] readBytes = new byte[8192];
			 * 
			 * long start = System.currentTimeMillis(); while ((readByteCount =
			 * fis.read(readBytes)) != -1) { fos.write(readBytes, 0, readByteCount); } long
			 * end = System.currentTimeMillis(); System.out.printf("경과시간 %d %n", end -
			 * start);
			 */

			// 3. BufferedInputStream과 BufferedOutputStreamd을 이용하여
			// 1바이트 읽어서 1바이트 출력한 예제
			// 경과시간 : 0.07
			// BufferedInputStream의 read()메서드는 1 바이트 읽어서
			// BufferedInputStream의 버퍼(byte[]) 공간에 저장
			// BufferedOutputStream의 write()메서드는 1바이트 출력을 하는게 아니라
			// BufferedOutputStream의 버퍼(byte[]) 공간에 가득 차 있으면 출력
			// 만약 다 채워지지 않으면 출력되지 않음
			// 이런 경우, flush() 메서드를 이용한다.
			fis = new FileInputStream("c:\\\\dev\\\\git-bash.exe");
			// Stream Chaining
			bis = new BufferedInputStream(fis);
			bis = new BufferedInputStream(fis, 1024 * 10); // 사이즈 늘리는 것도 가능해!!

			fos = new FileOutputStream("c:\\\\dev\\\\Git.exe");
			// Stream Chaining
			bos = new BufferedOutputStream(fos);

			int readByte = 0;
			long start = System.currentTimeMillis();
			while ((readByte = bis.read()) != -1) { // 한바이트 읽고 쓰는 것 같은 코드지만, 실은 버퍼에 저장했다 한번에 한다.!!
				bos.write(readByte);
			}
			// BufferedOutput의 버퍼 byte[]가 다 채워지면 자동으로 출력
			// 아니면 flush 해줘야!
			bos.flush();
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 %d %n", end - start);
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
				if (bis != null)
					bis.close();
				if (bos != null)
					bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
