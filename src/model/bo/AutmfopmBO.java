package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Autmfopm;

import model.dao.AutmfopmDAO;

/**
 * AutmfopmBO.java
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
public class AutmfopmBO {

	AutmfopmDAO autmfopmDAO = new AutmfopmDAO();

	/**
	 * get list Autmfopm
	 * 
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Autmfopm> listAUTMFOPM() throws Exception {
		return autmfopmDAO.listAUTMFOPM();
	}

}
