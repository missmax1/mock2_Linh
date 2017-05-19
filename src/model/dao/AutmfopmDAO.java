package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import model.bean.Autmfopm;

public class AutmfopmDAO {

	
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
	
	public ArrayList<Autmfopm> listAUTMFOPM() throws Exception {
		connect();
		String sql = "SELECT * FROM AUTMFOPM";
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			throw new SQLException("Câu lệnh sai : " + e.getMessage());
		}

		ArrayList<Autmfopm> list = new ArrayList<Autmfopm>();
		Autmfopm autmfopm;
		try {
			while (rs.next()) {
				autmfopm = new Autmfopm();
				autmfopm.setmFOPM_TRCD(rs.getString("MFOPM_TRCD"));
				autmfopm.setmFOPM_NAME(rs.getString("MFOPM_NAME"));
				list.add(autmfopm);
			}
		} catch (SQLException e) {
			throw new SQLException("Error occur: " + e.getMessage());
		} finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException sqle) {
				throw new SQLException("Error occur: " + sqle.getMessage());
			}

		}
		return list;
	}

}
