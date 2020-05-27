package Java_20200527;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling_NaverSports {
	public static void main(String[] args) {
		String url = "https://sports.news.naver.com/kfootball/index.nhn";
		Document doc = null;
		
		try {
			doc= Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements elements = doc.select(".home_news");
		Elements eelements =elements.select(".home_news_list li");
		
		for (int i = 0; i < eelements.size(); i++) {
			Element eeelement = eelements.get(i);
			System.out.println(eeelement.text());
		}
		
	}

}
