package Java_20200603_Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderWriterPractice {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw =null;	

		try {
			fr = new FileReader("c:\\dev\\EUNHEE_PRACTICE.txt");
			fw = new FileWriter("c:\\dev\\SEUNGJIN2.txt");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true);
			
			String readLine = null;
			char[] readChars = new char[1024*8];
			
			while((readLine=br.readLine())!=null) {
				bw.write(readLine);
				//bw.newLine();
				pw.println();
			}
			//bw.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
