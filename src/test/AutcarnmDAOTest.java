package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.bean.Autcarnm;
import model.dao.AutcarnmDAO;

/**
 * AutcarnmDAOTest.java
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
public class AutcarnmDAOTest {

	ArrayList<Autcarnm> arrListAutcarnmDAOExpected;
	ArrayList<Autcarnm> arrListAutcarnmDAO;
	AutcarnmDAO dao;

	/***
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {

		dao = new AutcarnmDAO();
		arrListAutcarnmDAOExpected = new ArrayList<Autcarnm>();
		arrListAutcarnmDAOExpected.add(new Autcarnm("1", "Bugati              "));
		arrListAutcarnmDAOExpected.add(new Autcarnm("2", "Ducati              "));
		arrListAutcarnmDAOExpected.add(new Autcarnm("3", "Mercedes            "));
		arrListAutcarnmDAO = dao.listAUTCARNM();

	}

	@After
	public void tearDown() throws Exception {
	}

	/***
	 * 
	 */
	@Test
	public void test() {

		assertEquals(arrListAutcarnmDAOExpected.get(0).getcARNM_SHSYCD(), arrListAutcarnmDAO.get(0).getcARNM_SHSYCD());
		assertEquals(arrListAutcarnmDAOExpected.get(0).getcARNM_NAME(), arrListAutcarnmDAO.get(0).getcARNM_NAME());

		assertEquals(arrListAutcarnmDAOExpected.get(1).getcARNM_SHSYCD(), arrListAutcarnmDAO.get(1).getcARNM_SHSYCD());
		assertEquals(arrListAutcarnmDAOExpected.get(1).getcARNM_NAME(), arrListAutcarnmDAO.get(1).getcARNM_NAME());

		assertEquals(arrListAutcarnmDAOExpected.get(2).getcARNM_SHSYCD(), arrListAutcarnmDAO.get(2).getcARNM_SHSYCD());
		assertEquals(arrListAutcarnmDAOExpected.get(2).getcARNM_NAME(), arrListAutcarnmDAO.get(2).getcARNM_NAME());
	}

}
