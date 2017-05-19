package form;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.Department;
import model.bean.LanguageScore;
import model.bean.Status;

/**
 * LanguageScoreForm
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
public class LanguageScoreForm extends ActionForm {

	private String employeeId;
	private String statusAccountId;
	private String departmentId;
	private String languageTypeId;
	private String languageScoreId;
	private ArrayList<LanguageScore> listLanguageScore;
	private ArrayList<Status> listStatus;
	private ArrayList<Department> listDeparment;

	private String score;
	private String account;
	private String fullName;
	private String selectSeach = "2";

	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the statusAccountId
	 */
	public String getStatusAccountId() {
		return statusAccountId;
	}

	/**
	 * @param statusAccountId
	 *            the statusAccountId to set
	 */
	public void setStatusAccountId(String statusAccountId) {
		this.statusAccountId = statusAccountId;
	}

	/**
	 * @return the departmentId
	 */
	public String getDepartmentId() {
		return departmentId;
	}

	/**
	 * @param departmentId
	 *            the departmentId to set
	 */
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * @return the languageTypeId
	 */
	public String getLanguageTypeId() {
		return languageTypeId;
	}

	/**
	 * @param languageTypeId
	 *            the languageTypeId to set
	 */
	public void setLanguageTypeId(String languageTypeId) {
		this.languageTypeId = languageTypeId;
	}

	/**
	 * @return the languageScoreId
	 */
	public String getLanguageScoreId() {
		return languageScoreId;
	}

	/**
	 * @param languageScoreId
	 *            the languageScoreId to set
	 */
	public void setLanguageScoreId(String languageScoreId) {
		this.languageScoreId = languageScoreId;
	}

	/**
	 * @return the listLanguageScore
	 */
	public ArrayList<LanguageScore> getListLanguageScore() {
		return listLanguageScore;
	}

	/**
	 * @param listLanguageScore
	 *            the listLanguageScore to set
	 */
	public void setListLanguageScore(ArrayList<LanguageScore> listLanguageScore) {
		this.listLanguageScore = listLanguageScore;
	}

	/**
	 * @return the listStatus
	 */
	public ArrayList<Status> getListStatus() {
		return listStatus;
	}

	/**
	 * @param listStatus
	 *            the listStatus to set
	 */
	public void setListStatus(ArrayList<Status> listStatus) {
		this.listStatus = listStatus;
	}

	/**
	 * @return the listDeparment
	 */
	public ArrayList<Department> getListDeparment() {
		return listDeparment;
	}

	/**
	 * @param listDeparment
	 *            the listDeparment to set
	 */
	public void setListDeparment(ArrayList<Department> listDeparment) {
		this.listDeparment = listDeparment;
	}

	/**
	 * @return the score
	 */
	public String getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(String score) {
		this.score = score;
	}

	/**
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account
	 *            the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the selectSeach
	 */
	public String getSelectSeach() {
		return selectSeach;
	}

	/**
	 * @param selectSeach
	 *            the selectSeach to set
	 */
	public void setSelectSeach(String selectSeach) {
		this.selectSeach = selectSeach;
	}

	/**
	 * set UTF-8
	 * 
	 * @param mapping
	 * @param request
	 */
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
