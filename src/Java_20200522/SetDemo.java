package Java_20200522;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// ctrl + shift + O
		// HashSetClass 는 객체의 중복을 허용하지 않고, 순서도 없음!!!
		// 단, 출력이 어려워

		// 1. 선언 및 생성
		HashSet<Integer> set = new HashSet<Integer>(); // <> 이 클래스는 반드시 인트만 넣겠다.=generic, 실수하지 않게 꼭 코딩

		// 2. 할당
		set.add(new Integer(1)); // =set.add(1) : auto boxing

		set.add(2);

		set.add(3);
		set.add(4);
		set.add(1);

		System.out.println(set.size()); // 5개가 아니여!!

		// 3. 출력 => Iterator
		// import
		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			Integer number = i.next();
			System.out.println(number);

		}

		HashSet<Customer> set1 = new HashSet<Customer>();

		// 반드시 오버라이딩 해주어야 중복 안된다.
		set1.add(new Customer("박은희1"));
		set1.add(new Customer("박은희1"));
		set1.add(new Customer("박은희2"));
		set1.add(new Customer("박은희3"));
		set1.add(new Customer("박은희4"));

		System.out.println("size : " + set1.size());

		// 로또 복권
		// set은 객체의 중복을 허용하지 않음, 순서도 보장해주지 않음
		TreeSet<Integer> lotto = new TreeSet<Integer>();

		while (true) {
			int random = (int) (Math.random() * 45) + 1;
			lotto.add(random);
			if (lotto.size() == 6)
				break;
		}

		Iterator<Integer> iter = lotto.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next() + "\t");
		}

	}
}
