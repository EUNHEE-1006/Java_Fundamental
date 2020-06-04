package Java_20200604;

import java.util.ArrayList;

public class EmpDemo {
	public static void main(String[] args) {
		
		EmpDao mdao = EmpDao.getInstance(); //객체를 한 번만 생성하지, 더 이상 만들지 않아
		
		
		int no = 8004;
		String name ="SEUNGJIN";
		String job = "SALESMAN";
		int mgr = 7900;
		int sal = 5000;
		int comm = 0;
		int deptNo =40;
		
		
		int resultCount = mdao.insert(new EmpDto(no, name, job, mgr, "2020-06-04" , sal, comm, deptNo));
		if(resultCount==1) {
			System.out.println("사원이 정상적으로 추가 되었습니다.");
		} else {
			System.out.println("오류");
		}
		System.out.println("====================");
		
		//UPDATE
		no = 8003;
		name = "SEU";
		job = "ANALYST";
		mgr =7844;
		sal = 2222;
		comm=10;
		deptNo =10;
		
		resultCount = mdao.update(new EmpDto(no, name, job, mgr, "2020-06-04", sal, comm, deptNo));
		if(resultCount==1) {
			System.out.println("사원이 정상적으로 수정 되었습니다.");
		} else {
			System.out.println("오류");
		}
		System.out.println("====================");
		//delete
		/*resultCount = mdao.delete(no);
		if(resultCount==1) {
			System.out.println("사원이 정상적으로 삭제 되었습니다.");
		} else {
			System.out.println("오류");
		}*/
		
		//select(0,10)
		int start = 0;
		int len = 10;
		ArrayList<EmpDto> list = mdao.select(start, len);
		
		for(EmpDto mdto : list) {
			System.out.printf("%d, %s, %s, %d, %s, %d, %d, %d %n", mdto.getNo(), mdto.getName(), mdto.getJob(), mdto.getMgr(), mdto.getHireDate(), mdto.getSal(), mdto.getComm(), mdto.getDeptNo());
		}
		System.out.println("====================");
		//selection of part
		no = 8003;
		EmpDto mdto = mdao.select(no);
		if(mdto != null) {
			System.out.printf("%d, %s, %s, %d, %s, %d, %d, %d %n", mdto.getNo(), mdto.getName(), mdto.getJob(), mdto.getMgr(), mdto.getHireDate(), mdto.getSal(), mdto.getComm(), mdto.getDeptNo());
			
		} else {
			System.out.println("회원정보가 없습니다.");
		}
	}

}
