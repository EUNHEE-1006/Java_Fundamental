package Java_20200526;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		//printstream은 모니터, 파일 모두 사용가능 
		PrintStream monitor = System.out; //출력장치와 연결된 printstream
		monitor.println("Lunchtime's coming!!");
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null; //파일과 연결된 printstream
		
		//system.err.println은 통상적으로 catch블록에서 사용!
		try {
			fis = new FileInputStream("c:\\dev\\Git.exe");
			bis = new BufferedInputStream(fis);

			fos = new FileOutputStream("c:\\dev\\Git1.exe");
			bos = new BufferedOutputStream(fos);
			// Stream Chain 두번 한거!
			ps = new PrintStream(bos, true); // true => autoFlush
			
			int readByte = 0;
			while ((readByte = bis.read()) != -1) {
				ps.write(readByte); //버퍼기능이 없어 1바이트씩 계속,,,느려,,,

			}
			// flush 안해도 됨!!
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ps != null)
				ps.close();
			try {
				if (fis != null)
					fis.close();
				if (bis != null)
					bis.close();
				if (fos != null)
					fos.close();
				if (bos != null)
					bos.close();	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
