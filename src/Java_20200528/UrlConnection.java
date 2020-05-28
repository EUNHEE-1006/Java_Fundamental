package Java_20200528;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnection {
	public static void main(String[] args) {
		try {
			//url 클래스는 url 구성요소(protocol, host, port, path, query, reference)를 가져올 수 있고, url 자원을 스트림으로 가져올 수 있다.
			//urlConnection 클래스는 url에 있는 원격 서버의 헤더정보를 가져올 수 있고, url 자원(html, image,...)을 스트림으로 가져올 수 있다.
			URL url = new URL("https://www.naver.com/");
			URLConnection urlCon = url.openConnection(); //=원격헤더 정보가 궁금할때 
			
			String cacheControl = urlCon.getHeaderField("cache-control");
			String contentType = urlCon.getHeaderField("content-type");
			String date = urlCon.getHeaderField("date");
			
			System.out.println("cacheControl : " +cacheControl);
			System.out.println("contentType : " +contentType);
			System.out.println("date : " +date);
			
			
			InputStream in = urlCon.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			
			String readLine = null;
			while((readLine= br.readLine())!=null) {
				System.out.println(readLine);
			}
			
			in.close();
			isr.close();
			br.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
