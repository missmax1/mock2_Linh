package model.bean;

/**
 * Autempfl.java
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
public class Autempfl {

	private String eMPFL_EMPNO;
	private String eMPFL_EMPNM;

	/**
	 * 
	 */
	public Autempfl() {
		super();
	
	}

	/**
	 * @param eMPFL_EMPNO
	 * @param eMPFL_EMPNM
	 */
	public Autempfl(String eMPFL_EMPNO, String eMPFL_EMPNM) {
		super();
		this.eMPFL_EMPNO = eMPFL_EMPNO;
		this.eMPFL_EMPNM = eMPFL_EMPNM;
	}

	/**
	 * @return the eMPFL_EMPNO
	 */
	public String geteMPFL_EMPNO() {
		return eMPFL_EMPNO;
	}

	/**
	 * @param eMPFL_EMPNO
	 *            the eMPFL_EMPNO to set
	 */
	public void seteMPFL_EMPNO(String eMPFL_EMPNO) {
		this.eMPFL_EMPNO = eMPFL_EMPNO;
	}

	/**
	 * @return the eMPFL_EMPNM
	 */
	public String geteMPFL_EMPNM() {
		return eMPFL_EMPNM;
	}

	/**
	 * @param eMPFL_EMPNM
	 *            the eMPFL_EMPNM to set
	 */
	public void seteMPFL_EMPNM(String eMPFL_EMPNM) {
		this.eMPFL_EMPNM = eMPFL_EMPNM;
	}

}
