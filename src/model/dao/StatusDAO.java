package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.bean.Status;

/**
 * StatusDAO
 *
 * version 1.0
 *
 * Date 03/04/2017
 *
 * Copyright
 *
 * Modification Logs:
 *
 * DATE AUTHOR DESCRIPTION
 * -----------------------------------------------------------------------
 * 03/04-2017 LinhTN8 Create
 *
 */
public class StatusDAO {

	String url = "jdbc:sqlserver://localhost:1433;instance=MSSQLSERVER;databaseName=Mock1";
	String userName = "sa";
	String password = "12345678";
	Connection connection;

	/**
	 * kết nối csdl
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

	/**
	 * get all data status page
	 * 
	 * @return
	 * @throws Exception
	 */
	public ArrayList<Status> getListStatus() throws Exception {
		connect();
		String sql = "SELECT * FROM Status";
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			throw new SQLException("Câu lệnh sai rồi nhé: " + e.getMessage());
		}

		ArrayList<Status> list = new ArrayList<Status>();
		Status status;
		try {
			while (rs.next()) {
				status = new Status();
				status.setStatusAccountId(rs.getString("StatusAccountId"));
				status.setStatusName(rs.getString("StatusName"));
				list.add(status);
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
