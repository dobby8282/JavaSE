package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC02 {
	public static void main(String[] args) {
		Connection conn = null;
		// Statement 사용하지 않기! PreparedStatement 사용하기!
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			// 3. 쿼리 작성
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT employee_id, last_name, job_id, salary ");
			sql.append("FROM employees ");
			sql.append("WHERE salary >= ? ");
			sql.append("AND job_id LIKE '%'||?||'%' ");
			sql.append("ORDER BY salary ASC ");
			
			// 4. PreaparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 10000);
			pstmt.setString(2, "MAN");
			
			// 5. 쿼리 수행
			rs = pstmt.executeQuery();
			
			// 6. 실행결과 출력하기
			while(rs.next()) {
				int id = rs.getInt("employee_id");
				String lastName = rs.getString("last_name");
				String jobId = rs.getString("job_id");
				double salary = rs.getDouble("salary");
				
				System.out.printf("%d/%s/%s/%f\n",id, lastName, jobId, salary);
			}
			
		} catch (Exception e) {
			
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {}
		}
	}

}










