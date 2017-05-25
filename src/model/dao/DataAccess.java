package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataAccess {
	
	/**
	 * getConnect(): open connection to connect to database
	 * 
	 * @return Connection
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConnect(){
		Connection connect = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Mock2", "sa",
					"12345678");
		} catch (ClassNotFoundException e) {
			;
		} catch (SQLException e) {
			;
		}
		return connect;
	}
	
	
	/**
	 * disConnect(): close connection with database
	 * 
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void disConnect() {
		try {
			if (getConnect() != null) {
				getConnect().close();
			}
		} catch (SQLException e) {
			;
		}
	}
	
}
