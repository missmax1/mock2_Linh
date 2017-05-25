package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import model.bean.Autempfl;
import model.dao.AutempflDAO;;

/**
 * AutempflDAOTest.java
 *
 * Version 1.0
 *
 * Date: 26-05-2017
 *
 * Copyright
 *
 * Modification Logs: DATE AUTHOR DESCRIPTION
 * -----------------------------------------------------------------------
 * 26-05-2017 LinhTN8 Create
 */
public class AutempflDAOTest {

	ArrayList<Autempfl> arrListAutempflDAOExpected;
	ArrayList<Autempfl> arrListAutempflDAO;
	AutempflDAO dao;

	/***
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {

		dao = new AutempflDAO();
		arrListAutempflDAOExpected = new ArrayList<Autempfl>();
		arrListAutempflDAOExpected.add(new Autempfl("CAR01", "Test      "));
		arrListAutempflDAOExpected.add(new Autempfl("CAR02", "test lan 2"));
		arrListAutempflDAOExpected.add(new Autempfl("CAR03", "test lan n"));
		arrListAutempflDAO = dao.listAUTEMPFL();
	}

	@After
	public void tearDown() throws Exception {
	}

	/***
	 * 
	 */
	@Test
	public void testGetListAutempfl() {

		assertEquals(arrListAutempflDAOExpected.get(0).geteMPFL_EMPNO(), arrListAutempflDAO.get(0).geteMPFL_EMPNO());
		assertEquals(arrListAutempflDAOExpected.get(0).geteMPFL_EMPNM(), arrListAutempflDAO.get(0).geteMPFL_EMPNM());

		assertEquals(arrListAutempflDAOExpected.get(1).geteMPFL_EMPNO(), arrListAutempflDAO.get(1).geteMPFL_EMPNO());
		assertEquals(arrListAutempflDAOExpected.get(1).geteMPFL_EMPNM(), arrListAutempflDAO.get(1).geteMPFL_EMPNM());

		assertEquals(arrListAutempflDAOExpected.get(2).geteMPFL_EMPNO(), arrListAutempflDAO.get(2).geteMPFL_EMPNO());
		assertEquals(arrListAutempflDAOExpected.get(2).geteMPFL_EMPNM(), arrListAutempflDAO.get(2).geteMPFL_EMPNM());

	}

}
