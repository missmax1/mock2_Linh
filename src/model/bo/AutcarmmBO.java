package model.bo;

import java.util.ArrayList;

import model.bean.Autcarmm;
import model.dao.AutcarmmDAO;

/**
 * AutcarmmBO.java
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
public class AutcarmmBO {

	AutcarmmDAO autcarmmDAO = new AutcarmmDAO();

	/***
	 * 
	 * Thêm mới autcarmm
	 * 
	 * @param autcarmm
	 * @throws Exception
	 */
	public void register(Autcarmm autcarmm) throws Exception {

		autcarmmDAO.register(autcarmm);

	}

	/***
	 * 
	 * @param cARMM_MKCD
	 * @param cARMM_SYCD
	 * @return
	 * @throws Exception
	 */
	public boolean checkKey(String cARMM_MKCD, String cARMM_SYCD) throws Exception {
		
		return autcarmmDAO.checkKey(cARMM_MKCD, cARMM_SYCD);
	}

	/***
	 * 
	 * @param cARMM_EMPNO
	 * @param eMPFL_EMPNM
	 * @return
	 * @throws Exception
	 */
	public boolean checkExist(String cARMM_EMPNO, String eMPFL_EMPNM) throws Exception {

		return autcarmmDAO.checkExist(cARMM_EMPNO, eMPFL_EMPNM);
	}

}
