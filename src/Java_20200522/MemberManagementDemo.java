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
			System.out.println("똑바로해!");
			print();
			String inputD = input("번호를 선택하세요>");
			run(inputD);
		}
	}

// 1. 아이디를 입력받는다.
// 2. 이름을 입력받는다.
// 3. ArrayList에 고객을 추가한다.
// 4. ArrayList에 있는 모든 고객을 출력한다.
// 5. print() 메서드를 호출하여 번호를 선택할 수 있게 한다.
// 6. 번호를 선택하세요> 메세지를 출력한 후 키보드로 입력을 받게 한다.
	public void insert() {
		String id = input("아이디> ");
		String name = input("이름> ");

		Member m = new Member(id, name);
		list.add(m);
		printAll();
		print();
		String inputData = input("번호를 선택하세요");
		run(inputData);
	}

	public void update() {
		System.out.printf("수정할 아이디를 입력하세요!!   ");
		String id = input("아이디> ");

		for (int i = 0; i < list.size(); i++) {
			Member i1 = list.get(i);

			if (i1.getId().equals(id)) {
				System.out.println("새로운 아이디를 입력하세요> ");
				id = input("아이디> ");
				i1.setId(id);
				
			} else {
				System.out.println("수정할 아이디가 없습니다.");
			}
			printAll();
			print();
			String inputData = input("번호를 선택하세요");
			run(inputData);
			System.out.println(i1);
		}

	}

	public void delete() {
		System.out.printf("삭제할 아이디를 입력하세요!!   ");
		String id = input("아이디> ");

		for (int i = 0; i < list.size(); i++) {
			Member i1 = list.get(i);

			if (i1.getId().equals(id)) {	
				list.remove(i);
				System.out.println("해당 아이디가 삭제되었습니다.");
				
			} else {
				System.out.println("삭제할 아이디가 없습니다.");
			
			}
			printAll();
			print();
			String inputData = input("번호를 선택하세요");
			run(inputData);
			System.out.println(i1);
		}

	}

	public void search() {
		System.out.printf("검색할 아이디를 입력하세요!!   ");
		String id = input("아이디> ");

		for (int i = 0; i < list.size(); i++) {
			Member i1 = list.get(i);

			if (i1.getId().equals(id)) {
				System.out.println("해당 아이디가 있습니다.");
				System.out.printf("아이디 : %s, 이름 : %s",i1.getId(), i1.getName());
				System.out.println();
			} else {
				System.out.println("검색된 결과가 없습니다.");
			}

			printAll();
			print();
			String inputData = input("번호를 선택하세요");
			run(inputData);
			System.out.println(i1);
		}
	}
	
	public void printAll() {
		for (Member mem : list) {
			System.out.printf("아이디 : %s, 이름 :%s \n", mem.getId(), mem.getName());
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MemberManagementDemo m = new MemberManagementDemo();
		m.print();
		String inputData = m.input("번호를 선택하세요>");
		m.run(inputData);
	}
}