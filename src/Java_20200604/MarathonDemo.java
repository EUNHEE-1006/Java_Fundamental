package Java_20200604;

import java.util.ArrayList;

public class MarathonDemo {
	public static void main(String[] args) {
		Marathon e = new Marathon();
		String[] participants = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		ArrayList<String> plist = new ArrayList();
		ArrayList<String> clist = new ArrayList();
		
		for (int i = 0; i < participants.length; i++) {
			plist.add(participants[i]);
		}
		for (int i = 0; i < completion.length; i++) {
			clist.add(completion[i]);
		}
		
		String failName = e.solution(plist, clist);
		
	}

}
