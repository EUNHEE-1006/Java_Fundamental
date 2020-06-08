package Java_20200604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstm = null;
		PreparedStatement pstm1 = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			//트랜잭션 시작
			con.setAutoCommit(false);
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO dept(deptno, dname, loc) ");
			sql.append("VALUES(90, 'A5', 'B5')");

			pstm = con.prepareStatement(sql.toString());
			pstm.executeUpdate();

			sql.setLength(0); // stringbuffer 비우기
			sql.append("INSERT INTO dept(deptno, dname, loc) VALUES(100, 'A6', 'B6')");
			pstm1 = con.prepareStatement(sql.toString());
			pstm1.executeUpdate();
			
			isSuccess =true;
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//트랜잭션!!
				if(isSuccess) {
					con.commit();
				} else {
					con.rollback();
				}
				//중요!!!
				con.setAutoCommit(true); //connection자원 모든 것이 다 true 라서 반납전에 원래대로 돌려주는거
				if (pstm1 != null)
					pstm1.close();
				if (pstm != null)
					pstm.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
