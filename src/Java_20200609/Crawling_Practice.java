package Java_20200609;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling_Practice {
	public static void main(String[] args) {
		String url="https://sports.news.naver.com/kbaseball/record/index.nhn?category=kbo";
		Document doc =null;
		//FileWriter fw = null;
		//BufferedWriter bw =null;
		//PrintWriter pw = null;
		
		try {
			doc =Jsoup.connect(url).get();
			//fw = new FileWriter("c:\\dev\\BaseballRank.txt");
			Elements trElements = doc.select(".tbl_box regularTeamRecordList_table tr");
			System.out.println("순위" +"\t" + "팀" +"\t" + "경기수"+"\t" +"승"+"\t" + "패"+"\t" + "무"+"\t" + "승률"+"\t" + "게임차" +"\t" +"연속" +"\t" +"출루율" +"\t" +"장타율"+"\t" +"최근10경기");
			
			for (int i = 0; i < trElements.size(); i++) {
				Element trElement = trElements.get(i);
				System.out.println(trElement.child(0).text() +"\t"+ trElement.child(1).text() +"\t"+trElement.child(2).text() +"\t"+trElement.child(3).text() +"\t"+trElement.child(4).text() +"\t"+trElement.child(5).text() +"\t"+trElement.child(6).text() +"\t"+trElement.child(7).text() +"\t"+trElement.child(8).text() +"\t"+trElement.child(9).text() +"\t"+trElement.child(10).text() 
						+"\t"+trElement.child(11).text() +"\t"+trElement.child(12).text() +"\t");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}