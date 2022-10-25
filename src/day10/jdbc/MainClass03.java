package day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass03 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		// Statement 보다 성능이 좋다!! 무조건 사용!!
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			// 1. 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");

			// 2. 연결하기
			// jdbc:mysql://호스트URL:포트/데이터베이스명
			String url = "jdbc:mysql://172.16.12.101:3306/hr";
			conn = DriverManager.getConnection(url, "scott", "tiger");

			StringBuffer sql = new StringBuffer();
			sql.append("SELECT EMPNO, ENAME ");
			sql.append("FROM emp ");
			sql.append("WHERE DEPTNO = ?");
			
			// 3. PrepareStatment 객체 생성
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 20);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				System.out.printf("%d, %s %n", empno, ename);
			}

			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}

	}

}




