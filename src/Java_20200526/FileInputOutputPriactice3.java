package Java_20200526;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputPriactice3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("");
			fos = new FileOutputStream("");

			int readByteCount = 0;
			byte[] readByte = new byte[1024 * 8];

			while ((readByteCount = fis.read(readByte)) != -1) {
				fos.write(readByte, 0, readByteCount);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
