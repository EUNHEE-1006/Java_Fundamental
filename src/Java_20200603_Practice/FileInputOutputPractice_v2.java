package Java_20200603_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputPractice_v2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos =null;
		
		try {
			fis = new FileInputStream("c:\\dev\\git-bash.exe");
			fos = new FileOutputStream("c:\\dev\\git-bash-practice2.exe");
			
			int readbyte = 0;
			byte[] readbytes = new byte[1024*8];
			
			while((readbyte=fis.read(readbytes))!=-1) {
				fos.write(readbytes, 0, readbyte);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
