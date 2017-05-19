package model.bean;

/**
 * Language
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
public class Language {

	private String languageTypeId;
	private String languageName;

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
	 * @return the languageName
	 */
	public String getLanguageName() {
		return languageName;
	}

	/**
	 * @param languageName
	 *            the languageName to set
	 */
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

}
