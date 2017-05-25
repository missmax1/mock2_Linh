package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import model.bean.Autcarmm;
import model.dao.AutcarmmDAO;
import model.dao.DataAccess;


public class AutcarmmDAOTest {
	AutcarmmDAO instance;
	protected AutcarmmDAO autcarmmDAO;
	protected Autcarmm autcarmm1;
	protected Autcarmm autcarmm2;
	
	protected boolean checkConnection;
	protected boolean testCheckExist1;
	protected boolean testCheckExist2;
	protected boolean testCheckExist3;
	protected boolean testCheckExist4;
	protected boolean testCheckKeyt1;
	protected boolean testCheckKeyt2;
	protected boolean testCheckKeyt3;
	protected boolean testCheckKeyt4;
	ArrayList<Autcarmm> listAutcarmmExpected;
	protected boolean addAutcarmmActual1;
	protected boolean addAutcarmmActual2 =true;
	
	
	@Before
	public void setUp() throws Exception {
		 instance = new AutcarmmDAO();	
		 autcarmm1 = new Autcarmm("aa", "1", "CAR02", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
		 autcarmm2 = new Autcarmm("ac", "1", "CAR02", "x", "x", "x", "x", "x", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
		 testCheckExist1 = instance.checkExist("CAR01", "Test");
		 testCheckExist2 = instance.checkExist("", "");
		 testCheckExist3 = instance.checkExist("CAR02", "Test");
		 testCheckExist4 = instance.checkExist("CAR01", "Rivo"); 
		 checkConnection = DataAccess.getConnect() == null;
		 
		 testCheckKeyt1 = instance.checkKey("aa", "1");	
		 testCheckKeyt2 = instance.checkExist("Sanrio Danshi", "1"); 
		 testCheckKeyt3 = instance.checkExist("Sanrio Danshi", "Mercedes");
		 testCheckKeyt4 = instance.checkExist("aa", "Mercedes"); 
		 
		 addAutcarmmActual2 = instance.register(autcarmm1);
		 addAutcarmmActual2 = instance.register(autcarmm2);
		 
	}

	@After
	public void tearDown() throws Exception {
	}

	/***
	 * 
	 * @throws Exception
	 */
	@Test
	public void testCheckExist() throws Exception {
		assertEquals(true, testCheckExist1);
		assertEquals(false, testCheckExist2);
		assertEquals(false, testCheckExist3);
		assertEquals(false, testCheckExist4);
		assertEquals(false, checkConnection);
	}
	/***
	 * 
	 * @throws Exception
	 */
	@Test
	public void testCheckKey() throws Exception {
		assertEquals(true, testCheckKeyt1);
		assertEquals(false, testCheckKeyt2);
		assertEquals(false, testCheckKeyt3);
		assertEquals(false, testCheckKeyt4);
		assertEquals(false, checkConnection);
	}
	/***
	 * 
	 * @throws Exception
	 */
	@Test
	public void testregister() throws Exception {
		assertEquals(false, addAutcarmmActual1);
		assertEquals(true, addAutcarmmActual2);		
		assertEquals(false, checkConnection);
	}
}
