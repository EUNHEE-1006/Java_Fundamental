package Java_20200526;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		
		//바이너리만 알면 문자도 표현 가능,,,ㅎㅎㅎ
		//reader, writer 몰라도, 근데 다 되는 건 아니야. 
		try {
			fr = new FileReader("c:\\dev\\FileInputOutputDemoPractice.java");
			fw = new FileWriter("c:\\dev\\FileInputOutputDemoPractice2.java");
			/*
			 * int readChar = 0;
			 * 
			 * while ((readChar = fr.read()) != -1) { System.out.print((char)readChar);
			 * //표준출력장치 fw.write(readChar);//파일로 출력 }
			 */

			int readCharCount = 0;
			char[] readChars = new char[1024];

			while ((readCharCount = fr.read(readChars)) != -1) {
				System.out.print(new String(readChars, 0, readCharCount)); // 문자열 생성 가능!!!!!!!!!!
				fw.write(readChars, 0, readCharCount);
				fw.write(new String(readChars, 0, readCharCount));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
