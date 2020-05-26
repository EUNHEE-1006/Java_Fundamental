package Java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedReaderWriterDemo {
	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		// excel은 binary, 하지만 txt로 만들어야 해요.

		try {
			fr = new FileReader("c:\\dev\\FileInputOutputDemoPractice.java");
			br = new BufferedReader(fr); // 기가 막힌 메서드가 있져 >_<, readLine()
			fw = new FileWriter("c:\\dev\\FileInputOutputDemoPractice4.java");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true); //true = autoflush
			String readLine = null;

			// readLine() : 개행을 뺀 한줄을 읽는다.
			while ((readLine = br.readLine()) != null) {
				//bw.write(readLine);
				//bw.newLine();
				pw.println();
			}
			//bw.flush();
			/*
			 * int readChar = 0;
			 * 
			 * while ((readChar = br.read()) != -1) { System.out.println((char) readChar);
			 * bw.write(readChar); } bw.flush();
			 */
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
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
