package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.bean.Autcarmm;


public class AutcarmmDAO {

	
	String url = "jdbc:sqlserver://localhost:1433;instance=MSSQLSERVER;databaseName=Mock2";
	String userName = "sa";
	String password = "12345678";
	Connection connection;
	Statement stmt;
	private int num = 0;
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
	
	
	public void register(String cARMM_MKCD, String cARMM_SYCD, String cARMM_JRCNT, String cARMM_J1CNT,
			String cARMM_LBLCT, String cARMM_HTKN, String cARMM_YOBI, String cARMM_EMPNO1, String eMPFL_EMPNM,
			String cARMM_EMPNO2, String cARMM_EMPNO3, String cARMM_EMPNO4, String cARMM_EMPNO5, String cARMM_EMPNO6,
			String cARMM_EMPNO7, String cARMM_EMPNO8, String cARMM_EMPNO9, String cARMM_EMPNO10) throws Exception {
		
		
		connect();
		
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

	public void register(Autcarmm autcarmm) throws Exception {
		connect();
	
		String sql ="insert into AUTCARMM (CARMM_MKCD,CARMM_SYCD,"
				+ "CARMM_EMPNO1,CARMM_EMPNO2,CARMM_EMPNO3,CARMM_EMPNO4,CARMM_EMPNO5,CARMM_EMPNO6,CARMM_EMPNO7,"
				+ "CARMM_EMPNO8,CARMM_EMPNO9,CARMM_EMPNO10,CARMM_JRCNT,CARMM_J1CNT,CARMM_LBLCT,CARMM_HTKN,"
				+ "CARMM_KUBUN1,CARMM_KUBUN2,CARMM_KUBUN3,CARMM_KUBUN4,CARMM_KUBUN5,CARMM_KUBUN6,CARMM_KUBUN7,"
				+ "CARMM_KUBUN8,CARMM_KUBUN9,CARMM_KUBUN10) " + 
				"VALUES (?, ?,?, ?,?, ?,?, ?,?, ?,?, ?,?, ?,?, ?,?, ?,?, ?,?, ?,?, ?,?, ?)"; 
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
			    
		pstmt.setString(1, autcarmm.getcARMM_MKCD());
		pstmt.setString(2, autcarmm.getcARMM_SYCD());
		pstmt.setString(3, autcarmm.getcARMM_EMPNO1());
		pstmt.setString(4, autcarmm.getcARMM_EMPNO2());
		pstmt.setString(5, autcarmm.getcARMM_EMPNO3());
		pstmt.setString(6, autcarmm.getcARMM_EMPNO4());
		pstmt.setString(7, autcarmm.getcARMM_EMPNO5());
		pstmt.setString(8, autcarmm.getcARMM_EMPNO6());
		pstmt.setString(9, autcarmm.getcARMM_EMPNO7());
		pstmt.setString(10, autcarmm.getcARMM_EMPNO8());
		pstmt.setString(11, autcarmm.getcARMM_EMPNO9());
		pstmt.setString(12, autcarmm.getcARMM_EMPNO10());
		pstmt.setString(13, autcarmm.getcARMM_JRCNT());
		pstmt.setString(14, autcarmm.getcARMM_J1CNT());
		pstmt.setString(15, autcarmm.getcARMM_LBLCT());
		pstmt.setString(16, autcarmm.getcARMM_HTKN());
		pstmt.setString(17, autcarmm.getcARMM_KUBUN1());
		pstmt.setString(18, autcarmm.getcARMM_KUBUN2());
		pstmt.setString(19, autcarmm.getcARMM_KUBUN3());
		pstmt.setString(20, autcarmm.getcARMM_KUBUN4());
		pstmt.setString(21, autcarmm.getcARMM_KUBUN5());
		pstmt.setString(22, autcarmm.getcARMM_KUBUN6());
		pstmt.setString(23, autcarmm.getcARMM_KUBUN7());
		pstmt.setString(24, autcarmm.getcARMM_KUBUN8());
		pstmt.setString(25, autcarmm.getcARMM_KUBUN9());
		pstmt.setString(26, autcarmm.getcARMM_KUBUN10());
		
		
		pstmt.executeUpdate();
		
	}


	public boolean checkKey(String cARMM_MKCD, String cARMM_SYCD) throws Exception   {
		String sql = "select CARMM_MKCD,CARMM_SYCD, count(*) as dem from AUTCARMM where CARMM_MKCD = '"+cARMM_MKCD+"' and CARMM_SYCD = "+cARMM_SYCD+" group by CARMM_MKCD,CARMM_SYCD  ";
		connect();
		
		System.out.println(sql);
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				num = rs.getInt("dem");
				System.out.println(num);
			}
		} catch (Exception e) {
			throw new Exception("Error occur: "+ e.getMessage());
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new SQLException("Error occur: "+ e.getMessage());
			}
		}
		
		return (num != 0)? true : false;		
		
	
		
	
			
		
	}


	public boolean checkExist(String cARMM_EMPNO1, String eMPFL_EMPNM) throws Exception {
		String sql = " select EMPFL_EMPNO,EMPFL_EMPNM, count(*) as dem from AUTEMPFL where EMPFL_EMPNO ="+
						" '"+cARMM_EMPNO1+"' and EMPFL_EMPNM = '"+eMPFL_EMPNM+"' group by EMPFL_EMPNO,EMPFL_EMPNM  ";	
		
		connect();
		
		System.out.println("2"+sql);
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				num = rs.getInt("dem");
			}
		} catch (Exception e) {
			throw new Exception("Error occur: "+ e.getMessage());
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new SQLException("Error occur: "+ e.getMessage());
			}
		}
		
		return (num != 0)? true : false;
	}



	

}
