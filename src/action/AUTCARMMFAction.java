package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import common.StringProcess;
import form.AUTCARMMForm;
import model.bean.Autcarmm;
import model.bean.Autcarnm;
import model.bean.Autempfl;
import model.bean.Autmfopm;
import model.bo.AutcarmmBO;
import model.bo.AutempflBO;
import model.bo.AutmcarnmBO;
import model.bo.AutmfopmBO;


/**
 * AUTCARMMFAction.java
 *
 * Version 1.1
 *
 * Date: 18-05-2017
 *
 * Copyright
 *
 * Modification Logs: 
 * DATE 			AUTHOR		 	DESCRIPTION
 * -----------------------------------------------------------------------
 * 22-05-2017 		LinhTN8 		Create
 */
public class AUTCARMMFAction extends Action {

	/**
	 * Method execute action form
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward addNew || addNewSuccess || addError || error
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// set mã UTF-8
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		AUTCARMMForm aUTCARMMForm = (AUTCARMMForm) form;

		// lay ds cac Autmfopm
		AutmfopmBO autmfopmBO = new AutmfopmBO();
		ArrayList<Autmfopm> listAUTMFOPM = autmfopmBO.listAUTMFOPM();
		aUTCARMMForm.setListAUTMFOPM(listAUTMFOPM);

		// lay ds cac Autcarnm
		AutmcarnmBO autmcarnmBO = new AutmcarnmBO();
		ArrayList<Autcarnm> listAUTCARNM = autmcarnmBO.listAUTCARNM();
		aUTCARMMForm.setListAUTCARNM(listAUTCARNM);

		// lay ds cac Autmpfl
		AutempflBO autempflBO = new AutempflBO();
		ArrayList<Autempfl> listAUTEMPFL = autempflBO.listAUTEMPFL();
		aUTCARMMForm.setListAUTEMPFL(listAUTEMPFL);

		// tao cac thuoc tinh cho doi tuong Autcarmm
		String cARMM_MKCD;
		String cARMM_SYCD;
		String cARMM_JRCNT;
		String cARMM_J1CNT;
		String cARMM_LBLCT;
		String cARMM_HTKN;
		String cARMM_YOBI;
		String cARMM_EMPNO1;
		String cARMM_EMPNO2;
		String cARMM_EMPNO3;
		String cARMM_EMPNO4;
		String cARMM_EMPNO5;
		String cARMM_EMPNO6;
		String cARMM_EMPNO7;
		String cARMM_EMPNO8;
		String cARMM_EMPNO9;
		String cARMM_EMPNO10;
		String eMPFL_EMPNM;
		String cARMM_KUBUN1;
		String cARMM_KUBUN2;
		String cARMM_KUBUN3;
		String cARMM_KUBUN4;
		String cARMM_KUBUN5;
		String cARMM_KUBUN6;
		String cARMM_KUBUN7;
		String cARMM_KUBUN8;
		String cARMM_KUBUN9;
		String cARMM_KUBUN10;
		int i = 1;

		AutcarmmBO autcarmmBO = new AutcarmmBO();
		ArrayList<Autcarmm> listAUTCARMM = AutcarmmBO.listAUTCARMM();
		aUTCARMMForm.setListAUTCARMM(listAUTCARMM);

		//  登録(Ｎ) kiểm tra các input khi insert vào DB
		if ("登録(Ｎ)".equals(aUTCARMMForm.getSubmit())) {
			ActionErrors actionErrors = new ActionErrors();
			int j = 1;
			
			// tạo vòng lặp từ 1 đến 10 bản ghi
			while (j < 11) {
				
				//lấy giá trị từ Form
				cARMM_MKCD = aUTCARMMForm.getArrcARMM_MKCD(j);
				cARMM_SYCD = aUTCARMMForm.getArrcARMM_SYCD(j);
				cARMM_JRCNT = aUTCARMMForm.getArrcARMM_JRCNT(j);
				cARMM_J1CNT = aUTCARMMForm.getArrcARMM_J1CNT(j);
				cARMM_LBLCT = aUTCARMMForm.getArrcARMM_LBLCT(j);
				cARMM_HTKN = aUTCARMMForm.getArrcARMM_HTKN(j);
				cARMM_EMPNO1 = aUTCARMMForm.getArrcARMM_EMPNO1(j);
				eMPFL_EMPNM = aUTCARMMForm.getArreMPFL_EMPNM(j);
				cARMM_EMPNO2 = aUTCARMMForm.getArrcARMM_EMPNO2(j);
				cARMM_EMPNO3 = aUTCARMMForm.getArrcARMM_EMPNO3(j);
				cARMM_EMPNO4 = aUTCARMMForm.getArrcARMM_EMPNO4(j);
				cARMM_EMPNO5 = aUTCARMMForm.getArrcARMM_EMPNO5(j);
				cARMM_EMPNO6 = aUTCARMMForm.getArrcARMM_EMPNO6(j);
				cARMM_EMPNO7 = aUTCARMMForm.getArrcARMM_EMPNO7(j);
				cARMM_EMPNO8 = aUTCARMMForm.getArrcARMM_EMPNO8(j);
				cARMM_EMPNO9 = aUTCARMMForm.getArrcARMM_EMPNO9(j);
				cARMM_EMPNO10 = aUTCARMMForm.getArrcARMM_EMPNO10(j);
				cARMM_YOBI = aUTCARMMForm.getArrcARMM_YOBI(j);
				cARMM_KUBUN1 = aUTCARMMForm.getArrcARMM_KUBUN1(j);
				cARMM_KUBUN2 = aUTCARMMForm.getArrcARMM_KUBUN2(j);
				cARMM_KUBUN3 = aUTCARMMForm.getArrcARMM_KUBUN3(j);
				cARMM_KUBUN4 = aUTCARMMForm.getArrcARMM_KUBUN4(j);
				cARMM_KUBUN5 = aUTCARMMForm.getArrcARMM_KUBUN5(j);
				cARMM_KUBUN6 = aUTCARMMForm.getArrcARMM_KUBUN6(j);
				cARMM_KUBUN7 = aUTCARMMForm.getArrcARMM_KUBUN7(j);
				cARMM_KUBUN8 = aUTCARMMForm.getArrcARMM_KUBUN8(j);
				cARMM_KUBUN9 = aUTCARMMForm.getArrcARMM_KUBUN9(j);
				cARMM_KUBUN10 = aUTCARMMForm.getArrcARMM_KUBUN10(j);

				// kiểm tra tất cả các trường trống
				if (!StringProcess.isBlankItem(cARMM_MKCD, cARMM_SYCD, cARMM_JRCNT, cARMM_J1CNT, cARMM_LBLCT,
						cARMM_HTKN, cARMM_EMPNO1, eMPFL_EMPNM, cARMM_EMPNO2, cARMM_EMPNO3, cARMM_EMPNO4, cARMM_EMPNO5,
						cARMM_EMPNO6, cARMM_EMPNO7, cARMM_EMPNO8, cARMM_EMPNO9, cARMM_EMPNO10, cARMM_YOBI)) {

					// kiem tra xem メーカー(*) có rỗng hay k?
					if (StringProcess.notVaild(aUTCARMMForm.getArrcARMM_MKCD(j))) {
						actionErrors.add("cARMM_MKCDError", new ActionMessage("error.car.trong"));
					}
					// kiem tra xem 車種(*) có rỗng hay không?
					if (StringProcess.notVaild(aUTCARMMForm.getArrcARMM_SYCD(j))) {
						actionErrors.add("cARMM_MKCDError", new ActionMessage("error.car.trong"));
					}
					// kiem tra cARMM_JRCNT nhap chu
					if (StringProcess.notVaildNumber(aUTCARMMForm.getArrcARMM_JRCNT(j))) {
						actionErrors.add("numberError", new ActionMessage("error.car.so"));
					}
					// kiem tra space nhap vao truong cARMM_JRCNT
					if (StringProcess.getValidateSpace(aUTCARMMForm.getArrcARMM_JRCNT(j).trim())) {
						actionErrors.add("numberError", new ActionMessage("error.car.so"));
					}
					// nhap ky tu dac biet cARMM_JRCNT
					if (StringProcess.isSpecialCharacters(aUTCARMMForm.getArrcARMM_JRCNT(j).trim())) {
						actionErrors.add("numberError", new ActionMessage("error.car.so"));
					}
					// nhap max >5 cARMM_JRCNT
					if (StringProcess.getMaxlength5String(aUTCARMMForm.getArrcARMM_JRCNT(j).trim())) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}

					// kiem tra cARMM_J1CNT nhap chu
					if (StringProcess.notVaildNumber(cARMM_J1CNT)) {
						actionErrors.add("numberError", new ActionMessage("error.car.so"));
					}
					// kiem tra space nhap vao truong cARMM_J1CNT
					if (StringProcess.getValidateSpace(cARMM_J1CNT)) {
						actionErrors.add("numberError", new ActionMessage("error.car.so"));
					}
					// nhap ky tu dac biet cARMM_J1CNT
					if (StringProcess.isSpecialCharacters(cARMM_J1CNT)) {
						actionErrors.add("numberError", new ActionMessage("error.car.so"));
					}
					// nhap max >5 cARMM_J1CNT
					if (StringProcess.getMaxlength5String(cARMM_J1CNT)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}

					// kiem tra cARMM_LBLCT nhap chu
					if (StringProcess.notVaildNumber(cARMM_LBLCT)) {
						actionErrors.add("numberError", new ActionMessage("error.car.so"));
					}
					// kiem tra space nhap vao truong cARMM_LBLCT
					if (StringProcess.getValidateSpace(cARMM_LBLCT)) {
						actionErrors.add("numberError", new ActionMessage("error.car.so"));
					}
					// nhap ky tu dac biet cARMM_LBLCT
					if (StringProcess.isSpecialCharacters(cARMM_LBLCT)) {
						actionErrors.add("numberError", new ActionMessage("error.car.so"));
					}
					// nhap max >3 cARMM_LBLCT
					if (StringProcess.getMaxlength3String(cARMM_LBLCT)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}

					// kiem tra cARMM_HTKN nhap chu
					if (StringProcess.notVaildNumber(cARMM_HTKN)) {
						actionErrors.add("numberError", new ActionMessage("error.car.so"));
					}
					// kiem tra space nhap vao truong cARMM_HTKN
					if (StringProcess.getValidateSpace(cARMM_HTKN)) {
						actionErrors.add("numberError", new ActionMessage("error.car.so"));
					}
					// nhap ky tu dac biet cARMM_HTKN
					if (StringProcess.isSpecialCharacters(cARMM_HTKN)) {
						actionErrors.add("numberError", new ActionMessage("error.car.so"));
					}
					// nhap max >2 cARMM_HTKN
					if (StringProcess.getMaxlength2String(cARMM_HTKN)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}
					// nhap max >10 cARMM_YOBI
					if (StringProcess.getMaxlength10String(cARMM_YOBI)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}
					// nhap ky tu dac biet cARMM_YOBI
					if (StringProcess.isSpecialCharacters(cARMM_YOBI)) {
						actionErrors.add("characterError", new ActionMessage("error.character"));
					}

					// kiem tra xem 計画(主)コード có rỗng hay k?
					if (StringProcess.notVaild(cARMM_EMPNO1)) {
						actionErrors.add("cARMM_MKCDError", new ActionMessage("error.car.trong"));
					}
					// nhap max >5 計画(主)コード
					if (StringProcess.getMaxlength5String(cARMM_EMPNO1)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}

					// nhap max >5 計画(主)名
					if (StringProcess.getMaxlength10String(eMPFL_EMPNM)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}
					// kiem tra xem 計画(主)名 có rỗng hay k?
					if (StringProcess.notVaild(eMPFL_EMPNM)) {
						actionErrors.add("cARMM_MKCDError", new ActionMessage("error.car.trong"));
					}
					// check 計画(主)コード and 計画(主)名 trong data co hay khong?
					if (!autcarmmBO.checkExist(cARMM_EMPNO1, eMPFL_EMPNM)) {
						actionErrors.add("existDBError", new ActionMessage("error.exist.db"));
					}

					// nhap max >5 計画(従)
					if (StringProcess.getMaxlength5String(cARMM_EMPNO2)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}
					// nhap ky tu dac biet 計画(従)
					if (StringProcess.isSpecialCharacters(cARMM_EMPNO2)) {
						actionErrors.add("characterError", new ActionMessage("error.character"));
					}
					// nhap max >5 主製造技術
					if (StringProcess.getMaxlength5String(cARMM_EMPNO3)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}
					// nhap ky tu dac biet 主製造技術
					if (StringProcess.isSpecialCharacters(cARMM_EMPNO3)) {
						actionErrors.add("characterError", new ActionMessage("error.character"));
					}

					// nhap max >5 副製造技術
					if (StringProcess.getMaxlength5String(cARMM_EMPNO4)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}
					// nhap ky tu dac biet 副製造技術
					if (StringProcess.isSpecialCharacters(cARMM_EMPNO4)) {
						actionErrors.add("characterError", new ActionMessage("error.character"));
					}
					// nhap max >5 主技術ｻｰﾋﾞｽ
					if (StringProcess.getMaxlength5String(cARMM_EMPNO5)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}
					// nhap ky tu dac biet 主技術ｻｰﾋﾞｽ
					if (StringProcess.isSpecialCharacters(cARMM_EMPNO5)) {
						actionErrors.add("characterError", new ActionMessage("error.character"));
					}

					// nhap max >5 副技術ｻｰﾋﾞｽ
					if (StringProcess.getMaxlength5String(cARMM_EMPNO6)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}
					// nhap ky tu dac biet 副技術ｻｰﾋﾞｽ
					if (StringProcess.isSpecialCharacters(cARMM_EMPNO6)) {
						actionErrors.add("characterError", new ActionMessage("error.character"));
					}
					// nhap max >5 主営業
					if (StringProcess.getMaxlength5String(cARMM_EMPNO7)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}
					// nhap ky tu dac biet 主営業
					if (StringProcess.isSpecialCharacters(cARMM_EMPNO7)) {
						actionErrors.add("characterError", new ActionMessage("error.character"));
					}

					// nhap max >5 副営業
					if (StringProcess.getMaxlength5String(cARMM_EMPNO8)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}
					// nhap ky tu dac biet 副営業
					if (StringProcess.isSpecialCharacters(cARMM_EMPNO8)) {
						actionErrors.add("characterError", new ActionMessage("error.character"));
					}
					// nhap max >5 主業務
					if (StringProcess.getMaxlength5String(cARMM_EMPNO9)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}
					// nhap ky tu dac biet 主業務
					if (StringProcess.isSpecialCharacters(cARMM_EMPNO9)) {
						actionErrors.add("characterError", new ActionMessage("error.character"));
					}

					// nhap max >5 副業務
					if (StringProcess.getMaxlength5String(cARMM_EMPNO10)) {
						actionErrors.add("maxcARMM_JRCNTError", new ActionMessage("error.jrcnt.max"));
					}
					// nhap ky tu dac biet 副業務
					if (StringProcess.isSpecialCharacters(cARMM_EMPNO10)) {
						actionErrors.add("characterError", new ActionMessage("error.character"));
					}

					saveErrors(request, actionErrors); // luu lai nhung dong loi
					if (actionErrors.size() > 0) {
						// chuyen qua trang them LanguaeScoer va hien ra cac loi
						return mapping.findForward("registerError");
					}
				}
				j++;
			}
		}

		// nhan nut 登録(Ｎ) o trang để insert vào DB
		if ("登録(Ｎ)".equals(aUTCARMMForm.getSubmit())) {

			while (i < 11) {
				ActionErrors actionErrors = new ActionErrors();
				cARMM_MKCD = aUTCARMMForm.getArrcARMM_MKCD(i);
				cARMM_SYCD = aUTCARMMForm.getArrcARMM_SYCD(i);
				cARMM_JRCNT = aUTCARMMForm.getArrcARMM_JRCNT(i);
				cARMM_J1CNT = aUTCARMMForm.getArrcARMM_J1CNT(i);
				cARMM_LBLCT = aUTCARMMForm.getArrcARMM_LBLCT(i);
				cARMM_HTKN = aUTCARMMForm.getArrcARMM_HTKN(i);
				cARMM_EMPNO1 = aUTCARMMForm.getArrcARMM_EMPNO1(i);
				cARMM_EMPNO2 = aUTCARMMForm.getArrcARMM_EMPNO2(i);
				cARMM_EMPNO3 = aUTCARMMForm.getArrcARMM_EMPNO3(i);
				cARMM_EMPNO4 = aUTCARMMForm.getArrcARMM_EMPNO4(i);
				cARMM_EMPNO5 = aUTCARMMForm.getArrcARMM_EMPNO5(i);
				cARMM_EMPNO6 = aUTCARMMForm.getArrcARMM_EMPNO6(i);
				cARMM_EMPNO7 = aUTCARMMForm.getArrcARMM_EMPNO7(i);
				cARMM_EMPNO8 = aUTCARMMForm.getArrcARMM_EMPNO8(i);
				cARMM_EMPNO9 = aUTCARMMForm.getArrcARMM_EMPNO9(i);
				cARMM_EMPNO10 = aUTCARMMForm.getArrcARMM_EMPNO10(i);
				cARMM_KUBUN1 = aUTCARMMForm.getArrcARMM_KUBUN1(i);
				cARMM_KUBUN2 = aUTCARMMForm.getArrcARMM_KUBUN2(i);
				cARMM_KUBUN3 = aUTCARMMForm.getArrcARMM_KUBUN3(i);
				cARMM_KUBUN4 = aUTCARMMForm.getArrcARMM_KUBUN4(i);
				cARMM_KUBUN5 = aUTCARMMForm.getArrcARMM_KUBUN5(i);
				cARMM_KUBUN6 = aUTCARMMForm.getArrcARMM_KUBUN6(i);
				cARMM_KUBUN7 = aUTCARMMForm.getArrcARMM_KUBUN7(i);
				cARMM_KUBUN8 = aUTCARMMForm.getArrcARMM_KUBUN8(i);
				cARMM_KUBUN9 = aUTCARMMForm.getArrcARMM_KUBUN9(i);
				cARMM_KUBUN10 = aUTCARMMForm.getArrcARMM_KUBUN10(i);
				eMPFL_EMPNM = aUTCARMMForm.getArreMPFL_EMPNM(i);
				cARMM_YOBI = aUTCARMMForm.getArrcARMM_YOBI(i);

				if (!StringProcess.isBlankItem(cARMM_MKCD, cARMM_SYCD, cARMM_JRCNT, cARMM_J1CNT, cARMM_LBLCT,
						cARMM_HTKN, cARMM_EMPNO1, eMPFL_EMPNM, cARMM_EMPNO2, cARMM_EMPNO3, cARMM_EMPNO4, cARMM_EMPNO5,
						cARMM_EMPNO6, cARMM_EMPNO7, cARMM_EMPNO8, cARMM_EMPNO9, cARMM_EMPNO10, cARMM_YOBI)) {

					// tách cARMM_YOBI để lưu từ cARMM_KUBUN1 đến cARMM_KUBUN10
					if (cARMM_YOBI.length() == 1) {
						cARMM_KUBUN1 = cARMM_YOBI;
					} else if (cARMM_YOBI.length() == 2) {
						cARMM_KUBUN1 = cARMM_YOBI.substring(0, 1);
						cARMM_KUBUN2 = cARMM_YOBI.substring(1);
					} else if (cARMM_YOBI.length() == 3) {
						cARMM_KUBUN1 = cARMM_YOBI.substring(0, 1);
						cARMM_KUBUN2 = cARMM_YOBI.substring(1, 2);
						cARMM_KUBUN3 = cARMM_YOBI.substring(2);
					} else if (cARMM_YOBI.length() == 4) {
						cARMM_KUBUN1 = cARMM_YOBI.substring(0, 1);
						cARMM_KUBUN2 = cARMM_YOBI.substring(1, 2);
						cARMM_KUBUN3 = cARMM_YOBI.substring(2, 3);
						cARMM_KUBUN4 = cARMM_YOBI.substring(3);
					} else if (cARMM_YOBI.length() == 5) {
						cARMM_KUBUN1 = cARMM_YOBI.substring(0, 1);
						cARMM_KUBUN2 = cARMM_YOBI.substring(1, 2);
						cARMM_KUBUN3 = cARMM_YOBI.substring(2, 3);
						cARMM_KUBUN4 = cARMM_YOBI.substring(3, 4);
						cARMM_KUBUN5 = cARMM_YOBI.substring(4);
					} else if (cARMM_YOBI.length() == 6) {
						cARMM_KUBUN1 = cARMM_YOBI.substring(0, 1);
						cARMM_KUBUN2 = cARMM_YOBI.substring(1, 2);
						cARMM_KUBUN3 = cARMM_YOBI.substring(2, 3);
						cARMM_KUBUN4 = cARMM_YOBI.substring(3, 4);
						cARMM_KUBUN5 = cARMM_YOBI.substring(4, 5);
						cARMM_KUBUN6 = cARMM_YOBI.substring(5);
					} else if (cARMM_YOBI.length() == 7) {
						cARMM_KUBUN1 = cARMM_YOBI.substring(0, 1);
						cARMM_KUBUN2 = cARMM_YOBI.substring(1, 2);
						cARMM_KUBUN3 = cARMM_YOBI.substring(2, 3);
						cARMM_KUBUN4 = cARMM_YOBI.substring(3, 4);
						cARMM_KUBUN5 = cARMM_YOBI.substring(4, 5);
						cARMM_KUBUN6 = cARMM_YOBI.substring(5, 6);
						cARMM_KUBUN7 = cARMM_YOBI.substring(6);
					} else if (cARMM_YOBI.length() == 8) {
						cARMM_KUBUN1 = cARMM_YOBI.substring(0, 1);
						cARMM_KUBUN2 = cARMM_YOBI.substring(1, 2);
						cARMM_KUBUN3 = cARMM_YOBI.substring(2, 3);
						cARMM_KUBUN4 = cARMM_YOBI.substring(3, 4);
						cARMM_KUBUN5 = cARMM_YOBI.substring(4, 5);
						cARMM_KUBUN6 = cARMM_YOBI.substring(5, 6);
						cARMM_KUBUN7 = cARMM_YOBI.substring(6, 7);
						cARMM_KUBUN8 = cARMM_YOBI.substring(7);
					} else if (cARMM_YOBI.length() == 9) {
						cARMM_KUBUN1 = cARMM_YOBI.substring(0, 1);
						cARMM_KUBUN2 = cARMM_YOBI.substring(1, 2);
						cARMM_KUBUN3 = cARMM_YOBI.substring(2, 3);
						cARMM_KUBUN4 = cARMM_YOBI.substring(3, 4);
						cARMM_KUBUN5 = cARMM_YOBI.substring(4, 5);
						cARMM_KUBUN6 = cARMM_YOBI.substring(5, 6);
						cARMM_KUBUN7 = cARMM_YOBI.substring(6, 7);
						cARMM_KUBUN8 = cARMM_YOBI.substring(7, 8);
						cARMM_KUBUN9 = cARMM_YOBI.substring(8);
					} else if (cARMM_YOBI.length() == 10) {
						cARMM_KUBUN1 = cARMM_YOBI.substring(0, 1);
						cARMM_KUBUN2 = cARMM_YOBI.substring(1, 2);
						cARMM_KUBUN3 = cARMM_YOBI.substring(2, 3);
						cARMM_KUBUN4 = cARMM_YOBI.substring(3, 4);
						cARMM_KUBUN5 = cARMM_YOBI.substring(4, 5);
						cARMM_KUBUN6 = cARMM_YOBI.substring(5, 6);
						cARMM_KUBUN7 = cARMM_YOBI.substring(6, 7);
						cARMM_KUBUN8 = cARMM_YOBI.substring(7, 8);
						cARMM_KUBUN9 = cARMM_YOBI.substring(8, 9);
						cARMM_KUBUN10 = cARMM_YOBI.substring(9);
					}

					Autcarmm autcarmm = new Autcarmm(cARMM_MKCD, cARMM_SYCD, cARMM_EMPNO1, cARMM_EMPNO2, cARMM_EMPNO3,
							cARMM_EMPNO4, cARMM_EMPNO5, cARMM_EMPNO6, cARMM_EMPNO7, cARMM_EMPNO8, cARMM_EMPNO9,
							cARMM_EMPNO10, cARMM_JRCNT, cARMM_J1CNT, cARMM_LBLCT, cARMM_HTKN, cARMM_KUBUN1,
							cARMM_KUBUN2, cARMM_KUBUN3, cARMM_KUBUN4, cARMM_KUBUN5, cARMM_KUBUN6, cARMM_KUBUN7,
							cARMM_KUBUN8, cARMM_KUBUN9, cARMM_KUBUN10);
					
					//kiểm tra cARMM_EMPNO1,eMPFL_EMPNM đã có trong DB hay chưa
					if (!autcarmmBO.checkExist(cARMM_EMPNO1, eMPFL_EMPNM)) {
						actionErrors.add("existDBError", new ActionMessage("error.exist.db"));
					}
					
					//kiểm tra trùng khóa chính cARMM_MKCD, cARMM_SYCD
					if (autcarmmBO.checkKey(cARMM_MKCD, cARMM_SYCD) == true) {

						actionErrors.add("accError", new ActionMessage("error.trung.khoa"));
						saveErrors(request, actionErrors);
						return mapping.findForward("registerError");

					} else {					
						autcarmmBO.register(autcarmm);
					}
				}
				i++;

			}
			return mapping.findForward("registerSuccess");
		} else {			
			return mapping.findForward("register");
		}

	}

}
