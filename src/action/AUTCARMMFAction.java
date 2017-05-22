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


public class AUTCARMMFAction extends Action {

	/* (non-Javadoc)
	 * @see org.apache.struts.action.Action#execute(org.apache.struts.action.ActionMapping, org.apache.struts.action.ActionForm, javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		// set mã UTF-8
			request.setCharacterEncoding("UTF-8");
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
			ArrayList<Autempfl> listAUTEMPFL =autempflBO.listAUTEMPFL();
			aUTCARMMForm.setListAUTEMPFL(listAUTEMPFL);
		
			
			ActionErrors actionErrors = new ActionErrors();
			//nhan nut submit o trang them language
//			if("submit".equals(aUTCARMMForm.getSubmit())){ 
//				
//				//kiem tra xem メーカー(*)	 có rỗng hay k?
//				if(StringProcess.notVaild(aUTCARMMForm.getcARMM_SYCD())){
//					actionErrors.add("accError", new ActionMessage("error.acccc.trong"));
//				}
//				//kiem tra xem 車種(*) có rỗng hay không?
//				if(StringProcess.notVaild(aUTCARMMForm.getcARMM_MKCD())){
//					actionErrors.add("accError", new ActionMessage("error.acc.trong"));
//				}
				//kiem tra xem Account co dau cach hay khong, neu co se hien ra loi
//				if(StringProcess.trimspace(languagescoreForm.getAccount())){
//					actionErrors.add("accError", new ActionMessage("error.accc.trong"));
//				}
//				//nhap toi da 20 ki tu
//				if(StringProcess.getMaxlength20String(languagescoreForm.getFullName())){
//					actionErrors.add("fnError", new ActionMessage("error.max.trong"));
//				}
//				//nhap toi da 7 ki tu
//				if(StringProcess.getMaxlength7String(languagescoreForm.getAccount())){
//					actionErrors.add("accError", new ActionMessage("error.max7.trong"));
//				}
//				//kiem tra xem Fullname co trong hay khong, neu co se hien ra loi
//				if(StringProcess.notVaild(languagescoreForm.getFullName())){
//					actionErrors.add("fnError", new ActionMessage("error.fn.trong"));
//				}
//				//kiem tra xem Fullname co nhap dung voi dau space khong
//				if(StringProcess.getValidateSpace(languagescoreForm.getFullName())){
//					actionErrors.add("fnError", new ActionMessage("error.fnspace.trong"));
//				}
//				//kiem tra xem Departmentname co trong hay khong, neu co se hien ra loi
//				if(StringProcess.notVaild(languagescoreForm.getDepartmentName())){
//					actionErrors.add("dnError", new ActionMessage("error.dn.trong"));
//				}
//				//kiem tra xem Department nhap dung voi dau space khong
//				if(StringProcess.getValidateSpace(languagescoreForm.getDepartmentName())){
//					actionErrors.add("dnError", new ActionMessage("error.fnspace.trong"));
//				}
//				//kiem tra xem Departmentname  toi da 20 ky tu
//				if(StringProcess.getMaxlength20String(languagescoreForm.getDepartmentName())){
//					actionErrors.add("dnError", new ActionMessage("error.dn20.trong"));
//				}
//				//kiem tra xem LanguageName co trong hay khong, neu co se hien ra loi
//				if(StringProcess.notVaild(languagescoreForm.getLanguageName())){
//					actionErrors.add("lnError", new ActionMessage("error.ln.trong"));
//				}
//				//kiem tra xem LanguageName nhap dung voi dau space khong
//				if(StringProcess.getValidateSpace(languagescoreForm.getLanguageName())){
//					actionErrors.add("lnError", new ActionMessage("error.fnspace.trong"));
//				}
//				//nhap toi da 20 ky tu
//				if(StringProcess.getMaxlength20String(languagescoreForm.getLanguageName())){
//					actionErrors.add("lnError", new ActionMessage("error.ln20.trong"));
//				}
//				//kiem tra xem Score co trong hay khong, neu co se hien ra loi
//				if(StringProcess.notVaild(languagescoreForm.getScore())){
//					actionErrors.add("sError", new ActionMessage("error.s.trong"));
//				}
//				//kiem tra xem score co phai so hay khong, neu khong se hien ra loi
//				if(StringProcess.notVaildNumber(languagescoreForm.getScore())){
//					actionErrors.add("sError", new ActionMessage("error.score.so"));
//				}
//				//kiem tra xem ngay nhap dung dinh dang hay khong
//				if(StringProcess.validateJavaDate(languagescoreForm.getDate())){
//					actionErrors.add("dError", new ActionMessage("error.date.so"));
//				}
//					saveErrors(request, actionErrors); //luu lai nhung dong loi
//					if(actionErrors.size()>0){
//						//chuyen qua trang them LanguaeScoer va hien ra cac loi
//						return mapping.findForward("registerError"); 
//				}
//			}
//			
			
			AutcarmmBO autcarmmBO = new AutcarmmBO();
			ArrayList<Autcarmm> listAUTCARMM =AutcarmmBO.listAUTCARMM();
			aUTCARMMForm.setListAUTCARMM(listAUTCARMM);
			
			
			//nhan nut submit o trang Them them LanguaeScoer
			if("submit".equals(aUTCARMMForm.getSubmit())){		
			
				String cARMM_MKCD;
				String cARMM_SYCD;
				String cARMM_JRCNT = null;
				String cARMM_J1CNT = null;
				String cARMM_LBLCT = null;
				String cARMM_HTKN = null;
				String cARMM_YOBI = null;
				String cARMM_EMPNO1 = null;
				String cARMM_EMPNO2 = null;
				String cARMM_EMPNO3 = null;
				String cARMM_EMPNO4 = null;
				String cARMM_EMPNO5 = null;
				String cARMM_EMPNO6 = null;
				String cARMM_EMPNO7 = null;
				String cARMM_EMPNO8  = null;
				String cARMM_EMPNO9 = null;
				String cARMM_EMPNO10 = null;
				String eMPFL_EMPNM = null;
				String cARMM_KUBUN1 =null;
				String cARMM_KUBUN2 =null;
				String cARMM_KUBUN3 =null;
				String cARMM_KUBUN4 =null;
				String cARMM_KUBUN5 =null;
				String cARMM_KUBUN6 =null;
				String cARMM_KUBUN7 =null;
				String cARMM_KUBUN8 =null;
				String cARMM_KUBUN9 =null;
				String cARMM_KUBUN10 =null;
				

				//kiem tra xem account co ton tai hay khong
//				if(languageBO.checkAccount(account)) { 
//					//in ra dong loi
//					actionErrors.add("accError", new ActionMessage("error.trung.so")); 
//					
//				} saveErrors(request, actionErrors);
				
				int i = 0;								
				while(i <3)

				{
					String[] cARMM_MKCDarr = aUTCARMMForm.getcARMM_MKCD();
					String[] cARMM_SYCDarr = aUTCARMMForm.getcARMM_SYCD();
					String[] cARMM_JRCNTarr= aUTCARMMForm.getcARMM_JRCNT();
					String[] cARMM_J1CNTarr = aUTCARMMForm.getcARMM_J1CNT();		
					String[] cARMM_LBLCTarr = aUTCARMMForm.getcARMM_LBLCT();		
					String[] cARMM_HTKNarr = aUTCARMMForm.getcARMM_HTKN();	
					String[] cARMM_YOBIarr = aUTCARMMForm.getcARMM_YOBI();
					String[] cARMM_EMPNO1arr = aUTCARMMForm.getcARMM_EMPNO1();
					String[] eMPFL_EMPNMarr = aUTCARMMForm.geteMPFL_EMPNM();
					String[] cARMM_EMPNO2arr = aUTCARMMForm.getcARMM_EMPNO2();
					String[] cARMM_EMPNO3arr = aUTCARMMForm.getcARMM_EMPNO3();
					String[] cARMM_EMPNO4arr = aUTCARMMForm.getcARMM_EMPNO4();
					String[] cARMM_EMPNO5arr = aUTCARMMForm.getcARMM_EMPNO5();
					String[] cARMM_EMPNO6arr = aUTCARMMForm.getcARMM_EMPNO6();
					String[] cARMM_EMPNO7arr = aUTCARMMForm.getcARMM_EMPNO7();
					String[] cARMM_EMPNO8arr = aUTCARMMForm.getcARMM_EMPNO8();
					String[] cARMM_EMPNO9arr = aUTCARMMForm.getcARMM_EMPNO9();
					String[] cARMM_EMPNO10arr = aUTCARMMForm.getcARMM_EMPNO10();
					
					
					cARMM_MKCD = aUTCARMMForm.getcARMM_MKCD()[i];
					cARMM_SYCD = aUTCARMMForm.getcARMM_SYCD()[i];
					
					
					Autcarmm autcarmm = new Autcarmm(cARMM_MKCD, cARMM_SYCD, cARMM_JRCNT, cARMM_J1CNT,cARMM_LBLCT,cARMM_HTKN,cARMM_EMPNO1,cARMM_EMPNO2,cARMM_EMPNO3,cARMM_EMPNO4,cARMM_EMPNO5,
							cARMM_EMPNO6,cARMM_EMPNO7,cARMM_EMPNO8,cARMM_EMPNO9,cARMM_EMPNO10, cARMM_KUBUN1, cARMM_KUBUN2, cARMM_KUBUN3, cARMM_KUBUN4, cARMM_KUBUN5, cARMM_KUBUN6, cARMM_KUBUN7, cARMM_KUBUN8, cARMM_KUBUN9, cARMM_KUBUN10);
					
					System.out.println("kiem tra ne");
					if(autcarmmBO.checkKey(cARMM_MKCD,cARMM_SYCD)==true){
						System.out.println("ádfsa23423434");
						autcarmmBO.register(autcarmm);	
					}
					else {
						System.out.println("ádasdhjkasdhkas");
					}
					i++;
				
//				if(StringProcess.notVaildNumber(cARMM_JRCNT[i])){
//					actionErrors.add("accError", new ActionMessage("error.trung.so"));
//				}
//					
//				if(StringProcess.notVaildNumber(cARMM_J1CNT[i])){
//					actionErrors.add("accError", new ActionMessage("error.trung.so"));
//				}
//				if(StringProcess.notVaildNumber(cARMM_LBLCT[i])){
//					actionErrors.add("accError", new ActionMessage("error.trung.so"));
//				}
//				if(StringProcess.notVaildNumber(cARMM_HTKN[i])){
//					actionErrors.add("accError", new ActionMessage("error.trung.so"));
//				}saveErrors(request, actionErrors);
//				if(actionErrors.size()>0){
//					System.out.println("111");
//					//chuyen qua trang them Language Score
//					return mapping.findForward("register"); 
				//} else {
					System.out.println("toi day chua!!!!!");
//					int cARMM_JRCNT_int = Integer.parseInt(cARMM_JRCNT[i]);
//					int cARMM_J1CNT_int = Integer.parseInt(cARMM_JRCNT[i]);
//					int cARMM_LBLCT_int = Integer.parseInt(cARMM_JRCNT[i]);
//					int cARMM_HTKN_int = Integer.parseInt(cARMM_JRCNT[i]);
//				autcarmmBO.register(cARMM_MKCD, cARMM_SYCD, cARMM_JRCNT, cARMM_J1CNT,cARMM_LBLCT,cARMM_HTKN,cARMM_YOBI,cARMM_EMPNO1,eMPFL_EMPNM,cARMM_EMPNO2,cARMM_EMPNO3,cARMM_EMPNO4,cARMM_EMPNO5,
//						cARMM_EMPNO6,cARMM_EMPNO7,cARMM_EMPNO8,cARMM_EMPNO9,cARMM_EMPNO10);
				//chuyen qua trang danh sach Language Score
				
			//	}
				}
				return mapping.findForward("registerSuccess"); 
			} else {		
				//chuyen trang them Language Score
				return mapping.findForward("register"); 
			}
		
			
			
			
			
			
		
	}

	
	
}
