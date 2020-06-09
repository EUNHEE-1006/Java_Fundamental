package Java_20200604;

import java.util.ArrayList;

public class Marathon {
	public String solution(ArrayList<String> plist, ArrayList<String> clist) {
		String failName = null;
		
		 for (int i = 0; i < clist.size(); i++) {
			for (int j = 0; j < plist.size(); j++) {
				if(clist.get(i)==plist.get(j)) {
					plist.remove(j);
					continue;
				} 
			}
			failName = plist.get(0);
		}
		return failName;
		
	}

}
