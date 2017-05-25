package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Autcarnm;

/**
 * AutcarnmDAO.java
 *
 * Version 1.0
 *
 * Date: 18-05-2017
 *
 * Copyright
 *
 * Modification Logs: DATE AUTHOR DESCRIPTION
 * -----------------------------------------------------------------------
 * 18-05-2017 LinhTN8 Create
 */
public class AutcarnmDAO {

	Connection connection;

	/***
	 * 
	 * get list AUTCARNM
	 * 
	 * @return list
	 * @throws Exception
	 */
	public ArrayList<Autcarnm> listAUTCARNM() throws Exception {

		connection = DataAccess.getConnect();
		String sql = "SELECT * FROM AUTCARNM";
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			throw new SQLException("Error occur : " + e.getMessage());
		}

		ArrayList<Autcarnm> list = new ArrayList<Autcarnm>();
		Autcarnm autcarnm;
		try {
			while (rs.next()) {
				autcarnm = new Autcarnm();
				autcarnm.setcARNM_SHSYCD(rs.getString("CARNM_SHSYCD"));
				autcarnm.setcARNM_NAME(rs.getString("CARNM_NAME"));
				list.add(autcarnm);
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
