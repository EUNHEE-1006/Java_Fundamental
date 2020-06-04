package Java_20200604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDao {
	//1. Singleton Pattern 코딩
	// 1> 생성자의 접근한정자를 private 으로 설정한다.
	// 2> 해당 클래스의 객체를 생성할 수 있는 변수를 static으로 선언한다.
	// 3> 해당 클래스의 객체를 생성할 수 있는 메서드를 static으로 만든다.
	private static EmpDao dao;
	
	public static EmpDao getInstance() {
		if(dao==null) {
			dao = new EmpDao();
		}
		return dao;
	}
	private EmpDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

	public int insert(EmpDto e) {
		int resultCount = 0;

		Connection con = null;
		PreparedStatement pstm = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) ");
			sql.append(("VALUES(?, ?, ?, ?, CURDATE(), ?, ?, ?)"));

			pstm = con.prepareStatement(sql.toString());

			int index = 0;
			pstm.setInt(++index, e.getNo());
			pstm.setString(++index, e.getName());
			pstm.setString(++index, e.getJob());
			pstm.setInt(++index, e.getMgr());
			pstm.setInt(++index, e.getSal());
			pstm.setInt(++index, e.getComm());
			pstm.setInt(++index, e.getDeptNo());

			resultCount = pstm.executeUpdate();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			close(con, pstm, null);
		}
		return resultCount;
	}

	public int update(EmpDto e) {
		int resultCount = 0;

		Connection con = null;
		PreparedStatement pstm = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE emp ");
			sql.append("SET ename = ?, job= ?, mgr=?, hiredate=CURDATE(), sal=?, comm=?, deptno=? ");
			sql.append("WHERE empno= ?");

			pstm = con.prepareStatement(sql.toString());

			int index = 0;
			pstm.setString(++index, e.getName());
			pstm.setString(++index, e.getJob());
			pstm.setInt(++index, e.getMgr());
			pstm.setInt(++index, e.getSal());
			pstm.setInt(++index, e.getComm());
			pstm.setInt(++index, e.getDeptNo());
			pstm.setInt(++index, e.getNo());

			resultCount = pstm.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
		 close(con, pstm, null);
		}
		return resultCount;
	}

	public int delete(int no) {
		int resultCount = 0;
		
		Connection con = null;
		PreparedStatement pstm= null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE from emp ");
			sql.append("WHERE empno= ?");
			
			pstm = con.prepareStatement(sql.toString());
			pstm.setInt(1, no);
			resultCount = pstm.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(con, pstm, null);
		}
		
		return resultCount;
	}

	public ArrayList select(int start, int len) {
		ArrayList<EmpDto> list = new ArrayList<EmpDto>();

		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT empno, ename, job, mgr, date_format(hiredate, '%Y.%m.%d'), sal, comm, deptno ");
			sql.append("FROM emp ");
			sql.append("ORDER BY empno DESC ");
			sql.append("LIMIT ?, ?");

			pstm = con.prepareStatement(sql.toString());
			pstm.setInt(1, start);
			pstm.setInt(2, len);
			rs = pstm.executeQuery();

			while (rs.next()) {
				int index = 0;

				int no = rs.getInt(++index);
				String name = rs.getString(++index);
				String job = rs.getString(++index);
				int mgr = rs.getInt(++index);
				String hireDate = rs.getString(++index);
				int sal = rs.getInt(++index);
				int comm = rs.getInt(++index);
				int deptNo = rs.getInt(++index);

				list.add(new EmpDto(no, name, job, mgr, hireDate, sal, comm, deptNo));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(con, pstm, rs);
		}
		return list;
	}
	private void close(Connection con, PreparedStatement pstm, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (pstm != null)
				pstm.close();
			if (con != null)
				con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public EmpDto select(int no) {
		EmpDto edto = null;
		
		Connection con = null;
		PreparedStatement pstm =null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT empno, ename, job, mgr, date_format(hiredate, '%Y.%m.%d'), sal, comm, deptno ");
			sql.append("FROM emp ");
			sql.append("WHERE empno = ?");
			
			pstm = con.prepareStatement(sql.toString());
			pstm.setInt(1, no);
			rs = pstm.executeQuery();
			
			if(rs.next()) {
				int index =0;
				edto = new EmpDto(rs.getInt(++index), rs.getString(++index), rs.getString(++index), 
						rs.getInt(++index), rs.getString(++index), 
						rs.getInt(++index), rs.getInt(++index), rs.getInt(++index));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(con, pstm, rs);
		}
		return edto;
	}

}
