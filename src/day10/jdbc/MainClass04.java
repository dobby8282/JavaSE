package day10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainClass04 {
	public static void main(String[] args) {

		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. 연결하기
			con = DriverManager.getConnection("jdbc:mysql://172.16.12.101/hr", "scott", "tiger");

			// 트랜잭션 시작
			con.setAutoCommit(false);

			pstmt = con.prepareStatement("insert into bonus(ENAME,JOB,SAL,COMM) "
					+ "values('SMITH', 'CLERK', 100, 10)");
			pstmt.executeUpdate();

			pstmt = con.prepareStatement("insert into bonus(ENAME,JOB,SAL,COMM) "
					+ "values('ALLEN', 'SALESMAN', 200, 20)");
			pstmt.executeUpdate();
			
			pstmt = con.prepareStatement("insert into bonus(ENAME,JOB,SAL,COMM) "
					+ "values('JONES', 'MANAGER', 300, 30)");
			pstmt.executeUpdate();
			
			isSuccess = true;
			
		} catch (Exception e) {
			isSuccess = false;
		} finally {
			try {
				if (isSuccess) {
					// 트랜잭션이 정상 처리되었을 경우 모두 수행
					con.commit();
				} else {
					// 트랜잭셩이 정상 처리 되지않았을 경우 모두 취소
					con.rollback();
				}
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}

		}

	}

}
