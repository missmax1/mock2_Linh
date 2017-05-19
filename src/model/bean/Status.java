package model.bean;

/**
 * Status
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
public class Status {

	private String statusAccountId;
	private String statusName;

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
	 * @return the statusName
	 */
	public String getStatusName() {
		return statusName;
	}

	/**
	 * @param statusName
	 *            the statusName to set
	 */
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

}
