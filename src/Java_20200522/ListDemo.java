package Java_20200522;

import java.util.ArrayList;
import java.util.Set;

public class ListDemo {
	public static void main(String[] args) {
		// ArrayList : 순서가 있고, 객체의 중복도 허용한다.
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		for (int i = 0; i < list.size(); i++) {
			Integer i1 = list.get(i);
			System.out.println(i1);
		}

		/*
		 * while(true) { int i=0; list.remove(0); if(list.size()==0) break; }
		 */

		// list에 있는 모두 숫자 삭제 =>remove(int index)
		// 하나 지울때마다 index가 자동으로 갱신되기에

		for (int i = 0; i < list.size();) {
			list.remove(0);
		}

		// generic으로 선언된 array같은 경우 enhancd print가 가능하다.!!\
		// <enhanced for loop>
		// 1 배열을 출력할때
		// 2 generic으로 선언된 collection을 출력할때
		for (Integer value : list) {
			System.out.println(value);
		}


		/*
		 * for (int i = 0; i < list.size(); i++) { Integer i1=list.get(i);
		 * System.out.println(i1); }
		 */
		
		

	}

}
