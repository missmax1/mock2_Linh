package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Autempfl;

/**
 * AutempflDAO.java
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
public class AutempflDAO {

	Connection connection;

	/***
	 * 
	 * get list AUTEMPFL
	 * 
	 * @return
	 * @throws Exception
	 */
	public ArrayList<Autempfl> listAUTEMPFL() throws Exception {

		connection = DataAccess.getConnect();
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
