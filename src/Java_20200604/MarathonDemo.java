package Java_20200604;

import java.util.ArrayList;

public class MarathonDemo {
	public static void main(String[] args) {
		Marathon e = new Marathon();
		String[] participants = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
		ArrayList<String> plist = new ArrayList<String>();
		ArrayList<String> clist = new ArrayList<String>();
		
		for (int i = 0; i < participants.length; i++) {
			plist.add(participants[i]);
		}
	
		for (int i = 0; i < completion.length; i++) {
			clist.add(completion[i]);
		}
		
		String failName = e.solution(plist, clist);
		System.out.printf("%s%n", failName);
	}

}
