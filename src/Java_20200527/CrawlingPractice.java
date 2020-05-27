package Java_20200527;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CrawlingPractice {
	public static void main(String[] args) {
		Document doc = null;
		String url = "http://www.imbc.com/";
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Elements elements = doc.select(".notice-list li");
		
		for (int i = 0; i < elements.size(); i++) {
			Element liElement = elements.get(i);
			System.out.println(liElement.wholeText());
		}
	}
	
	
}
