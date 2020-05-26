package Java_20200526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class DaumScanDemo { // 마우스 우측 막아놓은 사이트에서 가져올 수 있다!!!!
	public static void main(String[] args) throws IOException {
		URL url = new URL("https://www.daum.net/");
		InputStream in = url.openStream(); // 문자는 무조건 2바이트로 처리!!. in은 텍스트를 갖고 있기에 2바이트로 바꿔줘.

		InputStreamReader isr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		FileWriter fos = null;

		isr = new InputStreamReader(in);
		br = new BufferedReader(isr);
		fos = new FileWriter("c:\\dev\\daum.html");
		bw = new BufferedWriter(fos);
		PrintWriter pw = new PrintWriter(bw, true);
		
		String readLine = null;
		while ((readLine = br.readLine()) != null) {
			bw.write(readLine);
			bw.newLine();
			pw.println(readLine);

		}
		bw.flush();
		/*
		 * 1. 모니터로 출력하는 방법
		 * 
		 * isr = new InputStreamReader(in); br = new BufferedReader(isr);
		 * 
		 * String readLine=null; while((readLine=br.readLine())!=null) {
		 * System.out.println(readLine);
		 */
	}

}
