package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Autmfopm;

public class AutmfopmDAO {

	Connection connection;

	/***
	 * 
	 * get list AUTMFOPM
	 * 
	 * @return
	 * @throws Exception
	 */
	public ArrayList<Autmfopm> listAUTMFOPM() throws Exception {
		connection = DataAccess.getConnect();
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
