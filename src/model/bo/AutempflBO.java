package model.bo;

import java.util.ArrayList;

import model.bean.Autempfl;
import model.dao.AutempflDAO;

/**
 * AutempflBO.java
 *
 * Version 1.0
 *
 * Date: 18-05-2017
 *
 * Copyright
 *
 * Modification Logs: 
 * DATE 			AUTHOR		 	DESCRIPTION
 * -----------------------------------------------------------------------
 * 18-05-2017 		LinhTN8 		Create
 */
public class AutempflBO {

	AutempflDAO autempflDAO = new AutempflDAO();
	
	/***
	 * 
	 * get list AUTEMPFL
	 * 
	 * @return
	 * @throws Exception
	 */
	public ArrayList<Autempfl> listAUTEMPFL() throws Exception {
	
		return autempflDAO.listAUTEMPFL();
	}

}
