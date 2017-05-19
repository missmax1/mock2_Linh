package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Autempfl;


public class AutempflDAO {

	
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
	
	public ArrayList<Autempfl> listAUTEMPFL() throws Exception {
		connect();
		String sql = "SELECT * FROM AUTEMPFL";
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			throw new SQLException("Câu lệnh sai : " + e.getMessage());
		}

		ArrayList<Autempfl> list = new ArrayList<Autempfl>();
		Autempfl autempfl;
		try {
			while (rs.next()) {
				autempfl = new Autempfl();
				autempfl.seteMPFL_EMPNO(rs.getString("EMPFL_EMPNO"));
				autempfl.seteMPFL_EMPNM(rs.getString("EMPFL_EMPNM"));
				list.add(autempfl);
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
