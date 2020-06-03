package Java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdateDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			//3306 : 마리아디비 포트
			
			
			
			//localhost : 데이터베이스 설치 ip
			//kpc : 데이터베이스 명
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member "); //맨 뒤칸 띄워야해. 그래야 연결되어 sql이 되니까
			sql.append("SET NAME = ?, addr = ? ");
			sql.append("WHERE num = ?");
			pstm = con.prepareStatement(sql.toString());
			
			int index =0;
			pstm.setString(++index, "정승진");
			pstm.setString(++index, "고성");
			pstm.setInt(++index, 2);
			 
			
			
			pstm.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
				try {
					if(con!=null) con.close();
					if(pstm != null) pstm.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
	}
}
