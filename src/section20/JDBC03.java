package section20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC03 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			// 3. 쿼리 작성
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO sales_reps(id, name, salary, commission_pct) ");
			sql.append("VALUES(?, ?, ?, ?)");
			
			// 4. PreaparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 1);
			pstmt.setString(2, "피카츄");
			pstmt.setDouble(3, 200);
			pstmt.setDouble(4, 0.2);
			
			// 5. 쿼리 수행
			int result = pstmt.executeUpdate();
			
			// 6. 실행결과
			if(result > 0) {
				System.out.println("데이터 추가 성공~!");
			} else {
				System.out.println("데이터 추가 실패!!");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
	}
}




