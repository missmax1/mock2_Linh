package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Autmfopm;

import model.dao.AutmfopmDAO;


public class AutmfopmBO {

	
		
		AutmfopmDAO autmfopmDAO = new AutmfopmDAO();

		/**
		 * get list Autmfopm
		 * 
		 * @return
		 * @throws SQLException
		 */
		public ArrayList<Autmfopm> listAUTMFOPM() throws Exception {
			return autmfopmDAO.listAUTMFOPM();
		}
		
		
	

}
