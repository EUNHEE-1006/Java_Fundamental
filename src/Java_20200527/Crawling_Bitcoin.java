package Java_20200527;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling_Bitcoin {
	public static void main(String[] args) {
		
		String test = "6,909.45".replaceAll(",", ""); //콤마 삭제하는 방법!!!
		double d = Double.parseDouble(test); //=6909.45
		
		//String test1 = String.format("%,.2f", d)
		System.out.printf("%,.2f%n",d);
		
		
		String url = "https://coinmarketcap.com/currencies/bitcoin/historical-data/?start=20200101&end=20200527";
		Document doc = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;

		// "\n" 붙히는 건 위험해 = 모든 시스템에서 먹히질 않거든.
		try {
			doc = Jsoup.connect(url).get();
			fw = new FileWriter("c:\\dev\\CoinHistoricalData.txt");
			Elements trElements = doc.select(".cmc-table__table-wrapper-outer table tbody tr");

			System.out.println("날짜\t\t시가\t\t고가\t\t저가\t\t종가\t\t거래량\t\t총량");
			fw.write("날짜\t\t시가\t\t고가\t\t저가\t\t종가\t\t거래량\t\t총량\n");
			/*
			 * for (int i = 0; i < trElements.size(); i++) { Element trElement =
			 * trElements.get(i);
			 * 
			 * Elements tdElements = trElement.select("td");
			 * 
			 * for (int j = 0; j < tdElements.size(); j++) { Element tdElement =
			 * tdElements.get(j); System.out.print(tdElement.text() + "\t"); }
			 * System.out.println(); }
			 */

			for (int i = 0; i < trElements.size(); i++) {
				Element trElement = trElements.get(i);
				String date = trElement.child(0).text(); // 이중포문 없이 바로바로 뽑아낼 수 있어, 변수 재조정이 가능하다는거
				String open = trElement.child(1).text();
				String high = trElement.child(2).text();
				String low = trElement.child(3).text();
				String close = trElement.child(4).text();
				String volume = trElement.child(5).text();
				String marketCap = trElement.child(6).text();
				System.out.println(date + "\t" + open + "\t" + high + "\t" + low + "\t" + close + "\t" + volume + "\t"
						+ marketCap + "\t");

				fw.write(date + "\t" + open + "\t" + high + "\t" + low + "\t" + close + "\t" + volume + "\t" + marketCap
						+ "\t" + "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
