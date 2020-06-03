package Java_20200603_Practice;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao = new MemberDao();
		int num = 2;
		String name = "박지혜";
		String addr = "화성";

		/*int resultCount = mdao.insert(new MemberDto(num, name, addr));

		if(resultCount==1)
		{
			System.out.println("정상적으로 추가되었습니다.");
		}else
		{
			System.out.println("오류");
		}*/
		
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		list = mdao.select();
		for (int i = 0; i < list.size(); i++) {
			MemberDto mdto = new MemberDto();
			mdto = list.get(i);
			System.out.printf("%d, %s, %s%n", mdto.getNum(), mdto.getName(), mdto.getAddr());
		}
		System.out.println("============");
		
		MemberDto mdto =mdao.select(num);
		if(mdto!=null) {
			System.out.printf("%d, %s, %s %n", mdto.getNum(), mdto.getName(), mdto.getAddr());
		}
	}	
}
