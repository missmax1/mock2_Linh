package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Autcarnm;
import model.dao.AutcarnmDAO;

/**
 * AutmcarnmBO.java
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
public class AutmcarnmBO {

	AutcarnmDAO autcarnmDAO = new AutcarnmDAO();

	/**
	 * get list Autcarnm
	 * 
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Autcarnm> listAUTCARNM() throws Exception {

		return autcarnmDAO.listAUTCARNM();
	}

}
