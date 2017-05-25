package model.bean;

/**
 * Autmfopm.java
 *
 * Version 1.0
 *
 * Date: 18-05-2017
 *
 * Copyright
 *
 * Modification Logs: DATE AUTHOR DESCRIPTION
 * -----------------------------------------------------------------------
 * 18-05-2017 DuyenTB Create
 */
public class Autmfopm {

	private String mFOPM_TRCD;
	private String mFOPM_NAME;

	/**
	 * @param mFOPM_TRCD
	 * @param mFOPM_NAME
	 */

	/**
	 * 
	 */
	public Autmfopm() {
		super();
		
	}

	/**
	 * @param mFOPM_TRCD
	 * @param mFOPM_NAME
	 */
	public Autmfopm(String mFOPM_TRCD, String mFOPM_NAME) {
		super();
		this.mFOPM_TRCD = mFOPM_TRCD;
		this.mFOPM_NAME = mFOPM_NAME;
	}

	/**
	 * @return the mFOPM_TRCD
	 */
	public String getmFOPM_TRCD() {
		return mFOPM_TRCD;
	}

	/**
	 * @param mFOPM_TRCD
	 *            the mFOPM_TRCD to set
	 */
	public void setmFOPM_TRCD(String mFOPM_TRCD) {
		this.mFOPM_TRCD = mFOPM_TRCD;
	}

	/**
	 * @return the mFOPM_NAME
	 */
	public String getmFOPM_NAME() {
		return mFOPM_NAME;
	}

	/**
	 * @param mFOPM_NAME
	 *            the mFOPM_NAME to set
	 */
	public void setmFOPM_NAME(String mFOPM_NAME) {
		this.mFOPM_NAME = mFOPM_NAME;
	}

}
