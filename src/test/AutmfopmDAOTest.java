package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.bean.Autmfopm;
import model.dao.AutmfopmDAO;

/**
 * AutmfopmDAOTest.java
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
public class AutmfopmDAOTest {

	ArrayList<Autmfopm> arrListAutmfopmDAOExpected;
	ArrayList<Autmfopm> arrListAutmfopmDAO;
	AutmfopmDAO dao;

	/***
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		dao = new AutmfopmDAO();
		arrListAutmfopmDAOExpected = new ArrayList<Autmfopm>();
		arrListAutmfopmDAOExpected.add(new Autmfopm("aa", "Billy               "));
		arrListAutmfopmDAOExpected.add(new Autmfopm("ab", "Yui Akihio          "));
		arrListAutmfopmDAOExpected.add(new Autmfopm("ac", "sanrio danshi       "));
		arrListAutmfopmDAO = dao.listAUTMFOPM();

	}

	@After
	public void tearDown() throws Exception {
	}

	/***
	 * 
	 */
	@Test
	public void testGetListAUTMFOPM() {

		assertEquals(arrListAutmfopmDAOExpected.get(0).getmFOPM_TRCD(), arrListAutmfopmDAO.get(0).getmFOPM_TRCD());
		assertEquals(arrListAutmfopmDAOExpected.get(0).getmFOPM_NAME(), arrListAutmfopmDAO.get(0).getmFOPM_NAME());

		assertEquals(arrListAutmfopmDAOExpected.get(1).getmFOPM_TRCD(), arrListAutmfopmDAO.get(1).getmFOPM_TRCD());
		assertEquals(arrListAutmfopmDAOExpected.get(1).getmFOPM_NAME(), arrListAutmfopmDAO.get(1).getmFOPM_NAME());

		assertEquals(arrListAutmfopmDAOExpected.get(2).getmFOPM_TRCD(), arrListAutmfopmDAO.get(2).getmFOPM_TRCD());
		assertEquals(arrListAutmfopmDAOExpected.get(2).getmFOPM_NAME(), arrListAutmfopmDAO.get(2).getmFOPM_NAME());

	}

}
