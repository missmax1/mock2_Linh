package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Autcarmm;
import model.dao.AutcarmmDAO;

public class AutcarmmBO {
	
	AutcarmmDAO autcarmmDAO = new AutcarmmDAO();

	public void register(String cARMM_MKCD, String cARMM_SYCD, String cARMM_JRCNT, String cARMM_J1CNT,
			String cARMM_LBLCT, String cARMM_HTKN, String cARMM_YOBI, String cARMM_EMPNO1, String eMPFL_EMPNM,
			String cARMM_EMPNO2, String cARMM_EMPNO3, String cARMM_EMPNO4, String cARMM_EMPNO5, String cARMM_EMPNO6,
			String cARMM_EMPNO7, String cARMM_EMPNO8, String cARMM_EMPNO9, String cARMM_EMPNO10) throws Exception {
		
		
		 autcarmmDAO.register(cARMM_MKCD,cARMM_SYCD,cARMM_JRCNT,cARMM_J1CNT,cARMM_LBLCT,cARMM_HTKN,cARMM_YOBI,cARMM_EMPNO1,
				eMPFL_EMPNM,cARMM_EMPNO2,cARMM_EMPNO3,cARMM_EMPNO4,cARMM_EMPNO5,cARMM_EMPNO6,cARMM_EMPNO7,cARMM_EMPNO8,cARMM_EMPNO9,cARMM_EMPNO10);
		
	}

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
	
}
