package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Autcarnm;
import model.dao.AutcarnmDAO;

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
