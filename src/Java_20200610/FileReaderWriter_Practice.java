package Java_20200610;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter_Practice {
	public static void main(String[] args) {
		FileReader fr =null;
		FileWriter fw =null;
		
		try {
			fr = new FileReader("c:\\dev\\hanyu.hwp");
			fw = new FileWriter("c:\\dev\\reader.hwp");
			
			int readCharCount =0;
			char[] readChars= new char[1024];
			
			while((readCharCount =fr.read(readChars)) !=-1) {
				System.out.println(new String(readChars, 0, readCharCount));
				fw.write(readChars, 0, readCharCount);
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
