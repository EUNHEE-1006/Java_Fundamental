package Java_20200527;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling_SamsumElectronic {
	public static void main(String[] args) {
		String url ="https://m.stock.naver.com/item/main.nhn#/stocks/005930/total";
		Document doc = null;
		
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("성공");
		Elements divElements = doc.select(".table_float");
		System.out.println(divElements.size());
		Elements ulElements = divElements.select("ul li");
		
		System.out.println(divElements.size());
		
		for (int i = 0; i < divElements.size(); i++) {
			Element ulElement = ulElements.get(i);
			System.out.println(ulElement.text());
		}
		
	}
}
