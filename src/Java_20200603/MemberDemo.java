package Java_20200603;

import java.util.ArrayList;

public class MemberDemo {
	public static void main(String[] args) {
		MemberDao mdao = new MemberDao();
		int num = 2;
		String name = "박은희1";
		String addr = "종로1";

		// MemberDto m = new MemberDto(num, name, addr); 재활용목적

		/*
		 * int resultCount = mdao.insert(new MemberDto(num, name, addr));
		 * if(resultCount==1) { System.out.println("정상적인 회원가입이 되었습니다."); } else {
		 * System.out.println("Error"); }
		 */

		/*
		 * int resultCount = mdao.update(new MemberDto(num, name, addr));
		 * if(resultCount==1) { System.out.println("정상적으로 수정 되었습니다."); } else {
		 * System.out.println("Error"); }
		 */

		/*
		 * int resultCount = mdao.delete(num); if(resultCount==1) {
		 * System.out.println("회원이 정상적으로 삭제 되었습니다."); } else {
		 * System.out.println("Error"); }
		 */

		ArrayList<MemberDto> list = mdao.select();
		// 반환되는 데이터가 여러개면 : ArrayList
		// 하나거나 없으면 :
		for (int i = 0; i < list.size(); i++) {
			MemberDto m = (MemberDto) list.get(i);
			int _num = m.getNum();
			String _name = m.getName();
			String _addr = m.getAddr();

			System.out.printf("%d, %s, %s%n", _num, _name, _addr);
		}
		System.out.println("=================");
		
		MemberDto dto = mdao.select(num);
		if(dto!=null) {
			int _num = dto.getNum();
			String _name = dto.getName();
			String _addr = dto.getAddr();

			System.out.printf("%d, %s, %s%n", _num, _name, _addr);
			
		} else {
			System.out.println("회원이 존재하지 않습니다.");
		}

	}
}
