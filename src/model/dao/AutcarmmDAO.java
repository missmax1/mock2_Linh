package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.bean.Autcarmm;


public class AutcarmmDAO {

	
	
	Connection connection;
	Statement stmt;

	/**
	 * Kết nối csdl
	 * @return 
	 * 
	 * @throws Exception
	 */
	public boolean register(Autcarmm autcarmm) throws Exception {
		connection = DataAccess.getConnect();
	
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
		return true;
		
	}


	public boolean checkKey(String cARMM_MKCD, String cARMM_SYCD) throws Exception   {
		String sql = "select CARMM_MKCD,CARMM_SYCD, count(*) as dem from AUTCARMM where CARMM_MKCD = '"+cARMM_MKCD+"'"
				+ " and CARMM_SYCD = "+cARMM_SYCD+" group by CARMM_MKCD,CARMM_SYCD  ";
		connection = DataAccess.getConnect();
		int num =0;
		System.out.println(sql);
		
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

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


	public boolean checkExist(String cARMM_EMPNO, String eMPFL_EMPNM) throws Exception {
		String sql = " select EMPFL_EMPNO,EMPFL_EMPNM, count(*) as dem from AUTEMPFL where EMPFL_EMPNO ="+
						" '"+cARMM_EMPNO+"' and EMPFL_EMPNM = '"+eMPFL_EMPNM+"' group by EMPFL_EMPNO,EMPFL_EMPNM  ";	
		
		connection = DataAccess.getConnect();
		int num =0;
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
