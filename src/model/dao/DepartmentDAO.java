package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Department;
import model.bean.Status;

/**
 * DepartmentDAO
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
public class DepartmentDAO {

	String url = "jdbc:sqlserver://localhost:1433;instance=MSSQLSERVER;databaseName=Mock1";
	String userName = "sa";
	String password = "12345678";
	Connection connection;

	/**
	 * kết nối csdl
	 * 
	 * @throws ClassNotFoundException
	 * @throws Exception
	 */
	void connect() throws ClassNotFoundException, Exception {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Ket noi thanh cong");
		} catch (SQLException e) {
			System.out.println("Ket noi loi");
			throw new SQLException("Ket noi loi roi ne: " + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Ket noi loi");
			throw new ClassNotFoundException("Ket noi loi roi ne: " + e.getMessage());
		}
	}

	/**
	 * get list department
	 * 
	 * @return list
	 * @throws Exception
	 */
	public ArrayList<Department> getListDepartment() throws Exception {

		connect();
		String sql = "SELECT * FROM Department";
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			throw new SQLException("Câu lệnh sai rồi nhé: " + e.getMessage());
		}

		ArrayList<Department> list = new ArrayList<Department>();
		Department department;
		try {
			while (rs.next()) {
				department = new Department();
				department.setDepartmentId(rs.getString("DepartmentId"));
				department.setDepartmentName(rs.getString("DepartmentName"));
				list.add(department);
			}
		} catch (SQLException e) {
			throw new SQLException("Datable sai rôi: " + e.getMessage());
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
