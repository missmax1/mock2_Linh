package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class AutcarmmDAO {

	
	String url = "jdbc:sqlserver://localhost:1433;instance=MSSQLSERVER;databaseName=Mock2";
	String userName = "sa";
	String password = "12345678";
	Connection connection;

	/**
	 * Kết nối csdl
	 * 
	 * @throws Exception
	 */
	void connect() throws Exception {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {

			System.out.println("Ket noi loi");
			throw new SQLException("Error occur: " + e.getMessage());
		} catch (ClassNotFoundException e) {

			System.out.println("Ket noi loi");
			throw new ClassNotFoundException("Error occur: " + e.getMessage());
		}
	}
	
	
	public void register(String cARMM_MKCD, String cARMM_SYCD, int cARMM_JRCNT, int cARMM_J1CNT,
			int cARMM_LBLCT, int cARMM_HTKN, String cARMM_YOBI, String cARMM_EMPNO1, String eMPFL_EMPNM,
			String cARMM_EMPNO2, String cARMM_EMPNO3, String cARMM_EMPNO4, String cARMM_EMPNO5, String cARMM_EMPNO6,
			String cARMM_EMPNO7, String cARMM_EMPNO8, String cARMM_EMPNO9, String cARMM_EMPNO10) throws Exception {
		
		
		connect();
		Statement stmt=null;
		String sql = String.format(
				"INSERT INTO AUTCARMM(CARMM_MKCD,CARMM_SYCD,CARMM_JRCNT,CARMM_J1CNT,CARMM_LBLCT,CARMM_HTKN,CARMM_YOBI,"
				+ "CARMM_EMPNO1,CARMM_EMPNO2,CARMM_EMPNO3,CARMM_EMPNO4,CARMM_EMPNO5,CARMM_EMPNO6,CARMM_EMPNO7,"
				+ "CARMM_EMPNO8,CARMM_EMPNO9,CARMM_EMPNO10) "
						+ " VALUES ( '%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s' )",
						cARMM_MKCD, cARMM_SYCD, cARMM_JRCNT, cARMM_J1CNT, cARMM_LBLCT, cARMM_HTKN,cARMM_YOBI,"CAR01"
						,cARMM_EMPNO2,cARMM_EMPNO3,cARMM_EMPNO4,cARMM_EMPNO5,cARMM_EMPNO6,cARMM_EMPNO7,cARMM_EMPNO8
						,cARMM_EMPNO9,cARMM_EMPNO10);
		
		System.out.println("sql "+ sql);
		try {
			 stmt = connection.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e) {;}	
		
		finally {
			try {
				connection.close();
				stmt.close();
			} catch (SQLException e) {;}
				
		}
		
	}

	

}
