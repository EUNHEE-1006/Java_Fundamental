package Java_20200603_Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWirterPractice {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("c:\\dev\\EUNHEE_PRACTICE.txt");
			fw = new FileWriter("c:\\dev\\SEUNGJIN.txt");
		
			int readCharCount =0;
			char[] readChars = new char[1024*8];
			
			while((readCharCount =fr.read(readChars))!=-1) {
				fw.write(readChars, 0, readCharCount);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) fw.close();
				if(fr !=null) fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
