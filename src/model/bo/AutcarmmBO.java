package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Autcarmm;
import model.dao.AutcarmmDAO;

public class AutcarmmBO {
	
	AutcarmmDAO autcarmmDAO = new AutcarmmDAO();



	public static ArrayList<Autcarmm> listAUTCARMM() {
		
		return null;
	}

	public void register(Autcarmm autcarmm) throws Exception {
		
		autcarmmDAO.register(autcarmm);
		
	}

	public boolean checkKey(String cARMM_MKCD, String cARMM_SYCD) throws Exception   {
		return autcarmmDAO.checkKey(cARMM_MKCD,cARMM_SYCD);
		// TODO Auto-generated method stub
		
	}

	public boolean checkExist(String cARMM_EMPNO, String eMPFL_EMPNM) throws Exception {
		// TODO Auto-generated method stub
		return autcarmmDAO.checkExist(cARMM_EMPNO ,eMPFL_EMPNM);
	}
	
}
