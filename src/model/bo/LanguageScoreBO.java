package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.LanguageScore;
import model.dao.LanguageScoreDAO;

/**
 * LanguageScoreBO
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
public class LanguageScoreBO {
	LanguageScoreDAO languageScoreDAO = new LanguageScoreDAO();

	/**
	 * get list all languagescore
	 * 
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<LanguageScore> getListLanguageScore() throws Exception {

		return languageScoreDAO.getListLanguageScore();
	}

	/**
	 * get list languagescore
	 * 
	 * @param account
	 * @param fullName
	 * @param departmentId
	 * @param statusAccountId
	 * @param score
	 * @return
	 * @throws Exception
	 */
	public ArrayList<LanguageScore> getListLanguageScore(String account, String fullName, String departmentId,
			String statusAccountId, String score) throws Exception {

		return languageScoreDAO.getListLanguageScore(account, fullName, departmentId, statusAccountId, score);
	}

	/**
	 * get list score
	 * 
	 * @param score
	 * @return
	 * @throws Exception
	 */
	public ArrayList<LanguageScore> getListLanguageScore(String score) throws Exception {

		return languageScoreDAO.getListLanguageScore(score);
	}

}
