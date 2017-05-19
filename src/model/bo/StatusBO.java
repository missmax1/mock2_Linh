package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Status;
import model.dao.StatusDAO;

/**
 * StatusBO
 *
 * version 1.0
 *
 * Date 03/04/2017
 *
 * Copyright
 *
 * Modification Logs:
 *
 * DATE AUTHOR DESCRIPTION
 * -----------------------------------------------------------------------
 * 03/04-2017 LinhTN8 Create
 *
 */
public class StatusBO {

	StatusDAO statusDAO = new StatusDAO();

	/**
	 * get list Status
	 * 
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Status> getListStatus() throws Exception {
		return statusDAO.getListStatus();
	}

}
