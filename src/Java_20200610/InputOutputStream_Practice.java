package Java_20200610;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStream_Practice {
	public static void main(String[] args) {
		FileInputStream fis =null;
		FileOutputStream fos =null;
		
		try {
			fis = new FileInputStream("c:\\dev\\hanyu.hwp");
			fos =new FileOutputStream("c:\\dev\\chinese.txt");
			
			int readByte =0;
			
			while((readByte=fis.read())!=-1) {
				fos.write(readByte);
			}
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		 
		
	}

}
