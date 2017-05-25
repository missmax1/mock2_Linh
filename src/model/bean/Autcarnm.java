package model.bean;

/**
 * Autcarnm.java
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
public class Autcarnm {

	private String cARNM_SHSYCD;
	private String cARNM_NAME;

	/**
	 * 
	 */
	public Autcarnm() {
		super();

	}

	/**
	 * @param cARNM_SHSYCD
	 * @param cARNM_NAME
	 */
	public Autcarnm(String cARNM_SHSYCD, String cARNM_NAME) {
		super();
		this.cARNM_SHSYCD = cARNM_SHSYCD;
		this.cARNM_NAME = cARNM_NAME;
	}

	/**
	 * @return the cARNM_SHSYCD
	 */
	public String getcARNM_SHSYCD() {
		return cARNM_SHSYCD;
	}

	/**
	 * @param cARNM_SHSYCD
	 *            the cARNM_SHSYCD to set
	 */
	public void setcARNM_SHSYCD(String cARNM_SHSYCD) {
		this.cARNM_SHSYCD = cARNM_SHSYCD;
	}

	/**
	 * @return the cARNM_NAME
	 */
	public String getcARNM_NAME() {
		return cARNM_NAME;
	}

	/**
	 * @param cARNM_NAME
	 *            the cARNM_NAME to set
	 */
	public void setcARNM_NAME(String cARNM_NAME) {
		this.cARNM_NAME = cARNM_NAME;
	}

}
