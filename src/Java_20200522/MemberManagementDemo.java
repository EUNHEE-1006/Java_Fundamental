package Java_20200522;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManagementDemo {

	private ArrayList<Member> list = new ArrayList<Member>();

	public void print() {
		System.out.println("**********************************************");
		System.out.println("* 1.insert 2.update 3.delete 4.search 5.exit *");
		System.out.println("**********************************************");
	}

	public String input(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next(); // 키보드에서 입력한 데이터를 반환
	}

	public void run(String inputData) {
		if (inputData.equals("1")) {
			insert();
		} else if (inputData.equals("2")) {
			update();
		} else if (inputData.equals("3")) {
			delete();
		} else if (inputData.equals("4")) {
			search();
		} else if (inputData.equals("5")) {
			System.out.println("프로그램이 종료되었습니다.");
		} else {

		}
	}

	// 1. 아이디를 입력받는다.
	// 2. 이름을 입력받는다.
	// 3. ArrayList에 고객을 추가한다.
	// 4. ArrayList에 있는 모든 고객을 출력한다.
	// 5. print() 메서드를 호출하여 번호를 선택할 수 있게 한다.
	// 6. 번호를 선택하세요> 메세지를 출력한 후 키보드로 입력을 받게 한다.
	public void insert() {
		String id = input("아이디>");
		String name = input("이름>");

		Member m = new Member(id, name);
		list.add(m);

		for (Member mem : list) {
			System.out.printf("아이디 : %s, 이름 :%s \n", mem.getId(), mem.getName());
		}
		
		System.out.println();
		print();
		String inputData = input("번호를 선택하세요");
		run(inputData);
	}

	public void update() {

	}

	public void delete() {

	}

	public void search() {

	}

	public static void main(String[] args) {
		MemberManagementDemo m = new MemberManagementDemo();
		m.print();
		String inputData = m.input("번호를 선택하세요>");
		m.run(inputData);
	}
}
