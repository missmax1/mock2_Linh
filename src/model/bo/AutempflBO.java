package model.bo;

import java.util.ArrayList;

import model.bean.Autempfl;
import model.dao.AutempflDAO;

public class AutempflBO {

	AutempflDAO autempflDAO = new AutempflDAO();
	
	public ArrayList<Autempfl> listAUTEMPFL() throws Exception {
		
		
		
		return autempflDAO.listAUTEMPFL();
	}

}
