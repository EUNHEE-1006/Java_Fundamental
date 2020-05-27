package Java_20200527;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

//html 위치만 알아내면, 크롤링 굉장히 유용해

public class CrawlingDemo {
	public static void main(String[] args) {
		String url="http://www.imbc.com/";
		
		//HTML 문서 전체를 관리하기 위한 객체
		Document doc = null;
		
		
		try {
			//url로 연결하여 html 정보를 get 방식으로 가져온다.
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("성공");
		
		
		//html정보에서 class정보를 가져올때는 "." 
		//id정보를 가져올 때는 "#"
		//정보가 여러개 있을 때는, elements!!
		Elements elements = doc.select(".notice-list li");
		
		for(int i=0; i<elements.size(); i++) {
			Element liElement = elements.get(i);
			System.out.println(liElement.text());
		}
	}
}
