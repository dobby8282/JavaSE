package day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass02 {
	public static void main(String[] args) throws SQLException  {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. 연결하기
			// jdbc:mysql://호스트URL:포트/데이터베이스명
			String url = "jdbc:mysql://172.16.12.101:3306/hr";
			conn = DriverManager.getConnection(url, "scott", "tiger");
			
			// 3. 쿼리 수행을 위한 Statement 객체 생성
			stmt = conn.createStatement();
			
			// 4. SQL 쿼리작성
			String sql = "INSERT INTO emp (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) "
					+ "VALUES(9998, 'PIKA', 'SALESMAN', 7788, '2022-10-25', 1000, 10, 30)";
			
			int result = stmt.executeUpdate(sql);
			
			
			// 6. 실행결과 출력하기
			System.out.println("result : " + result);
			
						
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
			
			if (stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
			
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
			
		}
		
	}

}
