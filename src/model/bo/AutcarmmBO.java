package model.bo;

import java.util.ArrayList;

import model.bean.Autcarmm;
import model.dao.AutcarmmDAO;

public class AutcarmmBO {
	
	AutcarmmDAO autcarmmDAO = new AutcarmmDAO();

	public void register(String cARMM_MKCD, String cARMM_SYCD, int cARMM_JRCNT, int cARMM_J1CNT,
			int cARMM_LBLCT, int cARMM_HTKN, String cARMM_YOBI, String cARMM_EMPNO1, String eMPFL_EMPNM,
			String cARMM_EMPNO2, String cARMM_EMPNO3, String cARMM_EMPNO4, String cARMM_EMPNO5, String cARMM_EMPNO6,
			String cARMM_EMPNO7, String cARMM_EMPNO8, String cARMM_EMPNO9, String cARMM_EMPNO10) throws Exception {
		
		
		 autcarmmDAO.register(cARMM_MKCD,cARMM_SYCD,cARMM_JRCNT,cARMM_J1CNT,cARMM_LBLCT,cARMM_HTKN,cARMM_YOBI,cARMM_EMPNO1,
				eMPFL_EMPNM,cARMM_EMPNO2,cARMM_EMPNO3,cARMM_EMPNO4,cARMM_EMPNO5,cARMM_EMPNO6,cARMM_EMPNO7,cARMM_EMPNO8,cARMM_EMPNO9,cARMM_EMPNO10);
		
	}

	public static ArrayList<Autcarmm> listAUTCARMM() {
		
		return null;
	}
	
}
