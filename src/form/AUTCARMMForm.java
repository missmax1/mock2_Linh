package form;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import model.bean.Autcarmm;
import model.bean.Autcarnm;
import model.bean.Autempfl;
import model.bean.Autmfopm;

public class AUTCARMMForm extends ActionForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] arrcARMM_MKCD = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_SYCD = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_EMPNO1 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arreMPFL_EMPNM = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_EMPNO2 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_EMPNO3 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_EMPNO4 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_EMPNO5 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_EMPNO6 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_EMPNO7 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_EMPNO8 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_EMPNO9 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_EMPNO10 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_JRCNT = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_J1CNT = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_LBLCT = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_HTKN = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_YOBI = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_KUBUN1 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_KUBUN2 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_KUBUN3 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_KUBUN4 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_KUBUN5 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_KUBUN6 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_KUBUN7 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_KUBUN8 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_KUBUN9 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] arrcARMM_KUBUN10 = { "", "", "", "", "", "", "", "", "", "", "" };
	private String[] cARMM_KUBUN =  { "", "", "", "", "", "", "", "", "", ""};	

	private ArrayList<Autcarmm> listAUTCARMM;
	private ArrayList<Autempfl> listAUTEMPFL;
	private ArrayList<Autcarnm> listAUTCARNM;
	private ArrayList<Autmfopm> listAUTMFOPM;
	private String submit;
	private Integer[] stt = { 1, 2, 3 , 4, 5, 6, 7, 8, 9, 10 };

	/**
	 * @return the arrcARMM_MKCD
	 */
	public String[] getArrcARMM_MKCD() {
		return arrcARMM_MKCD;
	}

	public String getArrcARMM_MKCD(int index) {
		return arrcARMM_MKCD[index];
	}

	/**
	 * @param arrcARMM_MKCD
	 *            the arrcARMM_MKCD to set
	 */
	public void setArrcARMM_MKCD(String[] arrcARMM_MKCD) {
		this.arrcARMM_MKCD = arrcARMM_MKCD;
	}

	/**
	 * @param arrcARMM_MKCD
	 *            the arrcARMM_MKCD to set
	 */
	public void setArrcARMM_MKCD(int index, String arrcARMM_MKCD) {
		this.arrcARMM_MKCD[index] = arrcARMM_MKCD;
	}

	/**
	 * @return the arrcARMM_SYCD
	 */
	public String[] getArrcARMM_SYCD() {
		return arrcARMM_SYCD;
	}

	/**
	 * @return the arrcARMM_SYCD
	 */
	public String getArrcARMM_SYCD(int index) {
		return arrcARMM_SYCD[index];
	}

	/**
	 * @param arrcARMM_SYCD
	 *            the arrcARMM_SYCD to set
	 */
	public void setArrcARMM_SYCD(String[] arrcARMM_SYCD) {
		this.arrcARMM_SYCD = arrcARMM_SYCD;
	}

	/**
	 * @param arrcARMM_SYCD
	 *            the arrcARMM_SYCD to set
	 */
	public void setArrcARMM_SYCD(int index, String arrcARMM_SYCD) {
		this.arrcARMM_SYCD[index] = arrcARMM_SYCD;
	}

	
	
	
	/**
	 * @return the cARMM_KUBUN
	 */
	public String[] getcARMM_KUBUN() {
		return cARMM_KUBUN;
	}
	
	/**
	 * @return the cARMM_KUBUN
	 */
	public String getcARMM_KUBUN(int index) {
		return cARMM_KUBUN[index];
	}
	
	/**
	 * @param i the cARMM_KUBUN to set
	 */
	public void setcARMM_KUBUN(String[] i) {
		this.cARMM_KUBUN = i;
	}
	
	/**
	 * @param cARMM_KUBUN the cARMM_KUBUN to set
	 */
	public void setcARMM_KUBUN(int index,String cARMM_KUBUN) {
		this.cARMM_KUBUN[index] = cARMM_KUBUN;
	}

	/**
	 * @return the arrcARMM_EMPNO1
	 */
	public String[] getArrcARMM_EMPNO1() {
		return arrcARMM_EMPNO1;
	}

	/**
	 * @return the arrcARMM_EMPNO1
	 */
	public String getArrcARMM_EMPNO1(int index) {
		return arrcARMM_EMPNO1[index];
	}

	/**
	 * @param arrcARMM_EMPNO1
	 *            the arrcARMM_EMPNO1 to set
	 */
	public void setArrcARMM_EMPNO1(String[] arrcARMM_EMPNO1) {
		this.arrcARMM_EMPNO1 = arrcARMM_EMPNO1;
	}

	/**
	 * @param arrcARMM_EMPNO1
	 *            the arrcARMM_EMPNO1 to set
	 */
	public void setArrcARMM_EMPNO1(int index, String arrcARMM_EMPNO1) {
		this.arrcARMM_EMPNO1[index] = arrcARMM_EMPNO1;
	}

	/**
	 * @return the arreMPFL_EMPNM
	 */
	public String[] getArreMPFL_EMPNM() {
		return arreMPFL_EMPNM;
	}

	/**
	 * @return the arreMPFL_EMPNM
	 */
	public String getArreMPFL_EMPNM(int index) {
		return arreMPFL_EMPNM[index];
	}

	/**
	 * @param arreMPFL_EMPNM
	 *            the arreMPFL_EMPNM to set
	 */
	public void setArreMPFL_EMPNM(String[] arreMPFL_EMPNM) {
		this.arreMPFL_EMPNM = arreMPFL_EMPNM;
	}

	/**
	 * @param arreMPFL_EMPNM
	 *            the arreMPFL_EMPNM to set
	 */
	public void setArreMPFL_EMPNM(int index, String arreMPFL_EMPNM) {
		this.arreMPFL_EMPNM[index] = arreMPFL_EMPNM;
	}

	/**
	 * @return the arrcARMM_EMPNO2
	 */
	public String[] getArrcARMM_EMPNO2() {
		return arrcARMM_EMPNO2;
	}

	/**
	 * @return the arrcARMM_EMPNO2
	 */
	public String getArrcARMM_EMPNO2(int index) {
		return arrcARMM_EMPNO2[index];
	}

	/**
	 * @param arrcARMM_EMPNO2
	 *            the arrcARMM_EMPNO2 to set
	 */
	public void setArrcARMM_EMPNO2(String[] arrcARMM_EMPNO2) {
		this.arrcARMM_EMPNO2 = arrcARMM_EMPNO2;
	}

	/**
	 * @param arrcARMM_EMPNO2
	 *            the arrcARMM_EMPNO2 to set
	 */
	public void setArrcARMM_EMPNO2(int index, String arrcARMM_EMPNO2) {
		this.arrcARMM_EMPNO2[index] = arrcARMM_EMPNO2;
	}

	/**
	 * @return the arrcARMM_EMPNO3
	 */
	public String[] getArrcARMM_EMPNO3() {
		return arrcARMM_EMPNO3;
	}

	/**
	 * @return the arrcARMM_EMPNO3
	 */
	public String getArrcARMM_EMPNO3(int index) {
		return arrcARMM_EMPNO3[index];
	}

	/**
	 * @param arrcARMM_EMPNO3
	 *            the arrcARMM_EMPNO3 to set
	 */
	public void setArrcARMM_EMPNO3(String[] arrcARMM_EMPNO3) {
		this.arrcARMM_EMPNO3 = arrcARMM_EMPNO3;
	}

	/**
	 * @param arrcARMM_EMPNO3
	 *            the arrcARMM_EMPNO3 to set
	 */
	public void setArrcARMM_EMPNO3(int index, String arrcARMM_EMPNO3) {
		this.arrcARMM_EMPNO3[index] = arrcARMM_EMPNO3;
	}

	/**
	 * @return the arrcARMM_EMPNO4
	 */
	public String[] getArrcARMM_EMPNO4() {
		return arrcARMM_EMPNO4;
	}

	/**
	 * @return the arrcARMM_EMPNO4
	 */
	public String getArrcARMM_EMPNO4(int index) {
		return arrcARMM_EMPNO4[index];
	}

	/**
	 * @param arrcARMM_EMPNO4
	 *            the arrcARMM_EMPNO4 to set
	 */
	public void setArrcARMM_EMPNO4(String[] arrcARMM_EMPNO4) {
		this.arrcARMM_EMPNO4 = arrcARMM_EMPNO4;
	}

	/**
	 * @param arrcARMM_EMPNO4
	 *            the arrcARMM_EMPNO4 to set
	 */
	public void setArrcARMM_EMPNO4(int index, String arrcARMM_EMPNO4) {
		this.arrcARMM_EMPNO4[index] = arrcARMM_EMPNO4;
	}

	/**
	 * @return the arrcARMM_EMPNO5
	 */
	public String[] getArrcARMM_EMPNO5() {
		return arrcARMM_EMPNO5;
	}

	/**
	 * @return the arrcARMM_EMPNO5
	 */
	public String getArrcARMM_EMPNO5(int index) {
		return arrcARMM_EMPNO5[index];
	}

	/**
	 * @param arrcARMM_EMPNO5
	 *            the arrcARMM_EMPNO5 to set
	 */
	public void setArrcARMM_EMPNO5(String[] arrcARMM_EMPNO5) {
		this.arrcARMM_EMPNO5 = arrcARMM_EMPNO5;
	}

	/**
	 * @param arrcARMM_EMPNO5
	 *            the arrcARMM_EMPNO5 to set
	 */
	public void setArrcARMM_EMPNO5(int index, String arrcARMM_EMPNO5) {
		this.arrcARMM_EMPNO5[index] = arrcARMM_EMPNO5;
	}

	/**
	 * @return the arrcARMM_EMPNO6
	 */
	public String[] getArrcARMM_EMPNO6() {
		return arrcARMM_EMPNO6;
	}

	/**
	 * @return the arrcARMM_EMPNO6
	 */
	public String getArrcARMM_EMPNO6(int index) {
		return arrcARMM_EMPNO6[index];
	}

	/**
	 * @param arrcARMM_EMPNO6
	 *            the arrcARMM_EMPNO6 to set
	 */
	public void setArrcARMM_EMPNO6(String[] arrcARMM_EMPNO6) {
		this.arrcARMM_EMPNO6 = arrcARMM_EMPNO6;
	}

	/**
	 * @param arrcARMM_EMPNO6
	 *            the arrcARMM_EMPNO6 to set
	 */
	public void setArrcARMM_EMPNO6(int index, String arrcARMM_EMPNO6) {
		this.arrcARMM_EMPNO6[index] = arrcARMM_EMPNO6;
	}

	/**
	 * @return the arrcARMM_EMPNO7
	 */
	public String[] getArrcARMM_EMPNO7() {
		return arrcARMM_EMPNO7;
	}

	/**
	 * @return the arrcARMM_EMPNO7
	 */
	public String getArrcARMM_EMPNO7(int index) {
		return arrcARMM_EMPNO7[index];
	}

	/**
	 * @param arrcARMM_EMPNO7
	 *            the arrcARMM_EMPNO7 to set
	 */
	public void setArrcARMM_EMPNO7(String[] arrcARMM_EMPNO7) {
		this.arrcARMM_EMPNO7 = arrcARMM_EMPNO7;
	}

	/**
	 * @param arrcARMM_EMPNO7
	 *            the arrcARMM_EMPNO7 to set
	 */
	public void setArrcARMM_EMPNO7(int index, String arrcARMM_EMPNO7) {
		this.arrcARMM_EMPNO7[index] = arrcARMM_EMPNO7;
	}

	/**
	 * @return the arrcARMM_EMPNO8
	 */
	public String[] getArrcARMM_EMPNO8() {
		return arrcARMM_EMPNO8;
	}

	/**
	 * @return the arrcARMM_EMPNO8
	 */
	public String getArrcARMM_EMPNO8(int index) {
		return arrcARMM_EMPNO8[index];
	}

	/**
	 * @param arrcARMM_EMPNO8
	 *            the arrcARMM_EMPNO8 to set
	 */
	public void setArrcARMM_EMPNO8(String[] arrcARMM_EMPNO8) {
		this.arrcARMM_EMPNO8 = arrcARMM_EMPNO8;
	}

	/**
	 * @param arrcARMM_EMPNO8
	 *            the arrcARMM_EMPNO8 to set
	 */
	public void setArrcARMM_EMPNO8(int index, String arrcARMM_EMPNO8) {
		this.arrcARMM_EMPNO8[index] = arrcARMM_EMPNO8;
	}

	/**
	 * @return the arrcARMM_EMPNO9
	 */
	public String[] getArrcARMM_EMPNO9() {
		return arrcARMM_EMPNO9;
	}

	/**
	 * @return the arrcARMM_EMPNO9
	 */
	public String getArrcARMM_EMPNO9(int index) {
		return arrcARMM_EMPNO9[index];
	}

	/**
	 * @param arrcARMM_EMPNO9
	 *            the arrcARMM_EMPNO9 to set
	 */
	public void setArrcARMM_EMPNO9(String[] arrcARMM_EMPNO9) {
		this.arrcARMM_EMPNO9 = arrcARMM_EMPNO9;
	}

	/**
	 * @param arrcARMM_EMPNO9
	 *            the arrcARMM_EMPNO9 to set
	 */
	public void setArrcARMM_EMPNO9(int index, String arrcARMM_EMPNO9) {
		this.arrcARMM_EMPNO9[index] = arrcARMM_EMPNO9;
	}

	/**
	 * @return the arrcARMM_EMPNO10
	 */
	public String[] getArrcARMM_EMPNO10() {
		return arrcARMM_EMPNO10;
	}

	/**
	 * @return the arrcARMM_EMPNO10
	 */
	public String getArrcARMM_EMPNO10(int index) {
		return arrcARMM_EMPNO10[index];
	}

	/**
	 * @param arrcARMM_EMPNO10
	 *            the arrcARMM_EMPNO10 to set
	 */
	public void setArrcARMM_EMPNO10(String[] arrcARMM_EMPNO10) {
		this.arrcARMM_EMPNO10 = arrcARMM_EMPNO10;
	}

	/**
	 * @param arrcARMM_EMPNO10
	 *            the arrcARMM_EMPNO10 to set
	 */
	public void setArrcARMM_EMPNO10(int index, String arrcARMM_EMPNO10) {
		this.arrcARMM_EMPNO10[index] = arrcARMM_EMPNO10;
	}

	/**
	 * @return the arrcARMM_JRCNT
	 */
	public String[] getArrcARMM_JRCNT() {
		return arrcARMM_JRCNT;
	}

	/**
	 * @return the arrcARMM_JRCNT
	 */
	public String getArrcARMM_JRCNT(int index) {
		return arrcARMM_JRCNT[index];
	}

	/**
	 * @param arrcARMM_JRCNT
	 *            the arrcARMM_JRCNT to set
	 */
	public void setArrcARMM_JRCNT(String[] arrcARMM_JRCNT) {
		this.arrcARMM_JRCNT = arrcARMM_JRCNT;
	}

	/**
	 * @param arrcARMM_JRCNT
	 *            the arrcARMM_JRCNT to set
	 */
	public void setArrcARMM_JRCNT(int index, String arrcARMM_JRCNT) {
		this.arrcARMM_JRCNT[index] = arrcARMM_JRCNT;
	}

	/**
	 * @return the arrcARMM_J1CNT
	 */
	public String[] getArrcARMM_J1CNT() {
		return arrcARMM_J1CNT;
	}

	/**
	 * @return the arrcARMM_J1CNT
	 */
	public String getArrcARMM_J1CNT(int index) {
		return arrcARMM_J1CNT[index];
	}

	/**
	 * @param arrcARMM_J1CNT
	 *            the arrcARMM_J1CNT to set
	 */
	public void setArrcARMM_J1CNT(String[] arrcARMM_J1CNT) {
		this.arrcARMM_J1CNT = arrcARMM_J1CNT;
	}

	/**
	 * @param arrcARMM_J1CNT
	 *            the arrcARMM_J1CNT to set
	 */
	public void setArrcARMM_J1CNT(int index, String arrcARMM_J1CNT) {
		this.arrcARMM_J1CNT[index] = arrcARMM_J1CNT;
	}

	/**
	 * @return the arrcARMM_LBLCT
	 */
	public String[] getArrcARMM_LBLCT() {
		return arrcARMM_LBLCT;
	}

	/**
	 * @return the arrcARMM_LBLCT
	 */
	public String getArrcARMM_LBLCT(int index) {
		return arrcARMM_LBLCT[index];
	}

	/**
	 * @param arrcARMM_LBLCT
	 *            the arrcARMM_LBLCT to set
	 */
	public void setArrcARMM_LBLCT(String[] arrcARMM_LBLCT) {
		this.arrcARMM_LBLCT = arrcARMM_LBLCT;
	}

	/**
	 * @param arrcARMM_LBLCT
	 *            the arrcARMM_LBLCT to set
	 */
	public void setArrcARMM_LBLCT(int index, String arrcARMM_LBLCT) {
		this.arrcARMM_LBLCT[index] = arrcARMM_LBLCT;
	}

	/**
	 * @return the arrcARMM_HTKN
	 */
	public String[] getArrcARMM_HTKN() {
		return arrcARMM_HTKN;
	}

	/**
	 * @return the arrcARMM_HTKN
	 */
	public String getArrcARMM_HTKN(int index) {
		return arrcARMM_HTKN[index];
	}

	/**
	 * @param arrcARMM_HTKN
	 *            the arrcARMM_HTKN to set
	 */
	public void setArrcARMM_HTKN(String[] arrcARMM_HTKN) {
		this.arrcARMM_HTKN = arrcARMM_HTKN;
	}

	/**
	 * @param arrcARMM_HTKN
	 *            the arrcARMM_HTKN to set
	 */
	public void setArrcARMM_HTKN(int index, String arrcARMM_HTKN) {
		this.arrcARMM_HTKN[index] = arrcARMM_HTKN;
	}

	/**
	 * @return the arrcARMM_YOBI
	 */
	public String[] getArrcARMM_YOBI() {
		return arrcARMM_YOBI;
	}

	/**
	 * @return the arrcARMM_YOBI
	 */
	public String getArrcARMM_YOBI(int index) {
		return arrcARMM_YOBI[index];
	}

	/**
	 * @param arrcARMM_YOBI
	 *            the arrcARMM_YOBI to set
	 */
	public void setArrcARMM_YOBI(String[] arrcARMM_YOBI) {
		this.arrcARMM_YOBI = arrcARMM_YOBI;
	}

	/**
	 * @param arrcARMM_YOBI
	 *            the arrcARMM_YOBI to set
	 */
	public void setArrcARMM_YOBI(int index, String arrcARMM_YOBI) {
		this.arrcARMM_YOBI[index] = arrcARMM_YOBI;
	}

	/**
	 * @return the arrcARMM_KUBUN1
	 */
	public String[] getArrcARMM_KUBUN1() {
		return arrcARMM_KUBUN1;
	}

	/**
	 * @return the arrcARMM_KUBUN1
	 */
	public String getArrcARMM_KUBUN1(int index) {
		return arrcARMM_KUBUN1[index];
	}

	/**
	 * @param arrcARMM_KUBUN1
	 *            the arrcARMM_KUBUN1 to set
	 */
	public void setArrcARMM_KUBUN1(String[] arrcARMM_KUBUN1) {
		this.arrcARMM_KUBUN1 = arrcARMM_KUBUN1;
	}

	/**
	 * @param arrcARMM_KUBUN1
	 *            the arrcARMM_KUBUN1 to set
	 */
	public void setArrcARMM_KUBUN1(int index, String arrcARMM_KUBUN1) {
		this.arrcARMM_KUBUN1[index] = arrcARMM_KUBUN1;
	}

	/**
	 * @return the arrcARMM_KUBUN2
	 */
	public String[] getArrcARMM_KUBUN2() {
		return arrcARMM_KUBUN2;
	}

	/**
	 * @return the arrcARMM_KUBUN2
	 */
	public String getArrcARMM_KUBUN2(int index) {
		return arrcARMM_KUBUN2[index];
	}

	/**
	 * @param arrcARMM_KUBUN2
	 *            the arrcARMM_KUBUN2 to set
	 */
	public void setArrcARMM_KUBUN2(String[] arrcARMM_KUBUN2) {
		this.arrcARMM_KUBUN2 = arrcARMM_KUBUN2;
	}

	/**
	 * @param arrcARMM_KUBUN2
	 *            the arrcARMM_KUBUN2 to set
	 */
	public void setArrcARMM_KUBUN2(int index, String arrcARMM_KUBUN2) {
		this.arrcARMM_KUBUN2[index] = arrcARMM_KUBUN2;
	}

	/**
	 * @return the arrcARMM_KUBUN3
	 */
	public String[] getArrcARMM_KUBUN3() {
		return arrcARMM_KUBUN3;
	}

	/**
	 * @return the arrcARMM_KUBUN3
	 */
	public String getArrcARMM_KUBUN3(int index) {
		return arrcARMM_KUBUN3[index];
	}

	/**
	 * @param arrcARMM_KUBUN3
	 *            the arrcARMM_KUBUN3 to set
	 */
	public void setArrcARMM_KUBUN3(String[] arrcARMM_KUBUN3) {
		this.arrcARMM_KUBUN3 = arrcARMM_KUBUN3;
	}

	/**
	 * @param arrcARMM_KUBUN3
	 *            the arrcARMM_KUBUN3 to set
	 */
	public void setArrcARMM_KUBUN3(int index, String arrcARMM_KUBUN3) {
		this.arrcARMM_KUBUN3[index] = arrcARMM_KUBUN3;
	}

	/**
	 * @return the arrcARMM_KUBUN4
	 */
	public String[] getArrcARMM_KUBUN4() {
		return arrcARMM_KUBUN4;
	}

	/**
	 * @return the arrcARMM_KUBUN4
	 */
	public String getArrcARMM_KUBUN4(int index) {
		return arrcARMM_KUBUN4[index];
	}

	/**
	 * @param arrcARMM_KUBUN4
	 *            the arrcARMM_KUBUN4 to set
	 */
	public void setArrcARMM_KUBUN4(String[] arrcARMM_KUBUN4) {
		this.arrcARMM_KUBUN4 = arrcARMM_KUBUN4;
	}

	/**
	 * @param arrcARMM_KUBUN4
	 *            the arrcARMM_KUBUN4 to set
	 */
	public void setArrcARMM_KUBUN4(int index, String arrcARMM_KUBUN4) {
		this.arrcARMM_KUBUN4[index] = arrcARMM_KUBUN4;
	}

	/**
	 * @return the arrcARMM_KUBUN5
	 */
	public String[] getArrcARMM_KUBUN5() {
		return arrcARMM_KUBUN5;
	}

	/**
	 * @return the arrcARMM_KUBUN5
	 */
	public String getArrcARMM_KUBUN5(int index) {
		return arrcARMM_KUBUN5[index];
	}

	/**
	 * @param arrcARMM_KUBUN5
	 *            the arrcARMM_KUBUN5 to set
	 */
	public void setArrcARMM_KUBUN5(String[] arrcARMM_KUBUN5) {
		this.arrcARMM_KUBUN5 = arrcARMM_KUBUN5;
	}

	/**
	 * @param arrcARMM_KUBUN5
	 *            the arrcARMM_KUBUN5 to set
	 */
	public void setArrcARMM_KUBUN5(int index, String arrcARMM_KUBUN5) {
		this.arrcARMM_KUBUN5[index] = arrcARMM_KUBUN5;
	}

	/**
	 * @return the arrcARMM_KUBUN6
	 */
	public String[] getArrcARMM_KUBUN6() {
		return arrcARMM_KUBUN6;
	}

	/**
	 * @return the arrcARMM_KUBUN6
	 */
	public String getArrcARMM_KUBUN6(int index) {
		return arrcARMM_KUBUN6[index];
	}

	/**
	 * @param arrcARMM_KUBUN6
	 *            the arrcARMM_KUBUN6 to set
	 */
	public void setArrcARMM_KUBUN6(String[] arrcARMM_KUBUN6) {
		this.arrcARMM_KUBUN6 = arrcARMM_KUBUN6;
	}

	/**
	 * @param arrcARMM_KUBUN6
	 *            the arrcARMM_KUBUN6 to set
	 */
	public void setArrcARMM_KUBUN6(int index, String arrcARMM_KUBUN6) {
		this.arrcARMM_KUBUN6[index] = arrcARMM_KUBUN6;
	}

	/**
	 * @return the arrcARMM_KUBUN7
	 */
	public String[] getArrcARMM_KUBUN7() {
		return arrcARMM_KUBUN7;
	}

	/**
	 * @return the arrcARMM_KUBUN7
	 */
	public String getArrcARMM_KUBUN7(int index) {
		return arrcARMM_KUBUN7[index];
	}

	/**
	 * @param arrcARMM_KUBUN7
	 *            the arrcARMM_KUBUN7 to set
	 */
	public void setArrcARMM_KUBUN7(String[] arrcARMM_KUBUN7) {
		this.arrcARMM_KUBUN7 = arrcARMM_KUBUN7;
	}

	/**
	 * @param arrcARMM_KUBUN7
	 *            the arrcARMM_KUBUN7 to set
	 */
	public void setArrcARMM_KUBUN7(int index, String arrcARMM_KUBUN7) {
		this.arrcARMM_KUBUN7[index] = arrcARMM_KUBUN7;
	}

	/**
	 * @return the arrcARMM_KUBUN8
	 */
	public String[] getArrcARMM_KUBUN8() {
		return arrcARMM_KUBUN8;
	}

	/**
	 * @return the arrcARMM_KUBUN8
	 */
	public String getArrcARMM_KUBUN8(int index) {
		return arrcARMM_KUBUN8[index];
	}

	/**
	 * @param arrcARMM_KUBUN8
	 *            the arrcARMM_KUBUN8 to set
	 */
	public void setArrcARMM_KUBUN8(String[] arrcARMM_KUBUN8) {
		this.arrcARMM_KUBUN8 = arrcARMM_KUBUN8;
	}

	/**
	 * @param arrcARMM_KUBUN8
	 *            the arrcARMM_KUBUN8 to set
	 */
	public void setArrcARMM_KUBUN8(int index, String arrcARMM_KUBUN8) {
		this.arrcARMM_KUBUN8[index] = arrcARMM_KUBUN8;
	}

	/**
	 * @return the arrcARMM_KUBUN9
	 */
	public String[] getArrcARMM_KUBUN9() {
		return arrcARMM_KUBUN9;
	}

	/**
	 * @return the arrcARMM_KUBUN9
	 */
	public String getArrcARMM_KUBUN9(int index) {
		return arrcARMM_KUBUN9[index];
	}

	/**
	 * @param arrcARMM_KUBUN9
	 *            the arrcARMM_KUBUN9 to set
	 */
	public void setArrcARMM_KUBUN9(String[] arrcARMM_KUBUN9) {
		this.arrcARMM_KUBUN9 = arrcARMM_KUBUN9;
	}

	/**
	 * @param arrcARMM_KUBUN9
	 *            the arrcARMM_KUBUN9 to set
	 */
	public void setArrcARMM_KUBUN9(int index, String arrcARMM_KUBUN9) {
		this.arrcARMM_KUBUN9[index] = arrcARMM_KUBUN9;
	}

	/**
	 * @return the arrcARMM_KUBUN10
	 */
	public String[] getArrcARMM_KUBUN10() {
		return arrcARMM_KUBUN10;
	}

	/**
	 * @return the arrcARMM_KUBUN10
	 */
	public String getArrcARMM_KUBUN10(int index) {
		return arrcARMM_KUBUN10[index];
	}

	/**
	 * @param arrcARMM_KUBUN10
	 *            the arrcARMM_KUBUN10 to set
	 */
	public void setArrcARMM_KUBUN10(String[] arrcARMM_KUBUN10) {
		this.arrcARMM_KUBUN10 = arrcARMM_KUBUN10;
	}

	/**
	 * @param arrcARMM_KUBUN10
	 *            the arrcARMM_KUBUN10 to set
	 */
	public void setArrcARMM_KUBUN10(int index, String arrcARMM_KUBUN10) {
		this.arrcARMM_KUBUN10[index] = arrcARMM_KUBUN10;
	}

	/**
	 * @return the listAUTCARMM
	 */
	public ArrayList<Autcarmm> getListAUTCARMM() {
		return listAUTCARMM;
	}

	/**
	 * @param listAUTCARMM
	 *            the listAUTCARMM to set
	 */
	public void setListAUTCARMM(ArrayList<Autcarmm> listAUTCARMM) {
		this.listAUTCARMM = listAUTCARMM;
	}

	/**
	 * @return the listAUTEMPFL
	 */
	public ArrayList<Autempfl> getListAUTEMPFL() {
		return listAUTEMPFL;
	}

	/**
	 * @param listAUTEMPFL
	 *            the listAUTEMPFL to set
	 */
	public void setListAUTEMPFL(ArrayList<Autempfl> listAUTEMPFL) {
		this.listAUTEMPFL = listAUTEMPFL;
	}

	/**
	 * @return the listAUTCARNM
	 */
	public ArrayList<Autcarnm> getListAUTCARNM() {
		return listAUTCARNM;
	}

	/**
	 * @param listAUTCARNM
	 *            the listAUTCARNM to set
	 */
	public void setListAUTCARNM(ArrayList<Autcarnm> listAUTCARNM) {
		this.listAUTCARNM = listAUTCARNM;
	}

	/**
	 * @return the listAUTMFOPM
	 */
	public ArrayList<Autmfopm> getListAUTMFOPM() {
		return listAUTMFOPM;
	}

	/**
	 * @param listAUTMFOPM
	 *            the listAUTMFOPM to set
	 */
	public void setListAUTMFOPM(ArrayList<Autmfopm> listAUTMFOPM) {
		this.listAUTMFOPM = listAUTMFOPM;
	}

	/**
	 * @return the submit
	 */
	public String getSubmit() {
		return submit;
	}

	/**
	 * @param submit
	 *            the submit to set
	 */
	public void setSubmit(String submit) {
		this.submit = submit;
	}

	/**
	 * @return the stt
	 */
	public Integer[] getStt() {
		return stt;
	}

	/**
	 * @return the stt
	 */
	public Integer getStt(int index) {
		return stt[index];
	}

	/**
	 * @param stt
	 *            the stt to set
	 */
	public void setStt(Integer[] stt) {
		this.stt = stt;
	}

	/**
	 * @param stt
	 *            the stt to set
	 */
	public void setStt(int index, Integer stt) {
		this.stt[index] = stt;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * set UTF-8
	 * 
	 * @param mapping
	 * @param request
	 */
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		try {
			request.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
