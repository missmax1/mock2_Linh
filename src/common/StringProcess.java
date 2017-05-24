package common; 
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * StringProcess.java
 *
 * Version 1.0
 *
 * Date: 05-05-2017
 *
 * Copyright 
 *
 * Modification Logs:
 * DATE                 AUTHOR          DESCRIPTION
 * -----------------------------------------------------------------------
 * 05-05-2017        	TrucNT2          Create
 */


public class StringProcess {
	
	
	public static String getVaildString(String s) {
		if(s==null) return "";
		return s;
	}
	
	/**
	 * Ham kiem tra xau rong hay khong
	 * @param s
	 * @return boolean
	 */
	public static boolean notVaild(String s){
		if(s==null || s.length()==0 || "0".equals(s)) return true;
		return false;
	}
	
	/**
	 * Ham kiem tra xem xau co bao gom chi chu so hay khong
	 * @param s
	 * @return boolean
	 */
	public static boolean notVaildNumber(String s){
		if(notVaild(s)) return false;
		String regex = "[0-9]+"; 
		if(s.matches(regex)) return false;
		return true;
	}
	
	/**
	 * Ham kiem tra xem xau co dau cach  hay khong
	 * @param s
	 * @return boolean
	 */
	public static boolean trimspace(String str){
		String str1;
		str1 = str.replace(" ", "");
		if(str.length()>str1.length()) return true;
		return false;
	}
	
	/**
	 * Ham kiem tra xem xau co nhap dung ngay  hay khong
	 * @param s
	 * @return boolean
	 */
	
	 public static boolean validateJavaDate(String strDate)
	 {
	     if (strDate.trim().equals(""))
	     {
	         return true;
	     }
	     else
	     {
	         SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy/MM/dd");
	         sdfrmt.setLenient(false);
	         Date javaDate = null;
	         try
	         {
	             javaDate = sdfrmt.parse(strDate); 
	             System.out.println("Date after validation: " + javaDate);
	         }
	         catch (ParseException e)
	         {
	             System.out.println("The date you provided is in an " +"invalid date format.");
	             return true;
	         }
	         return false;
	     }
	 }

	 
	 /**
	 	 * Ham kiem tra xau co do dai lon hon 10 ki tu
	 	 * @param s
	 	 * @return boolean
	 	 */
	 	public static boolean getMaxlength10String(String s) {
	 		if(notVaild(s)) return false;
	 		if(s.length() >10) return true;
	 		return false;
	 	}
	 
	 /**
	 	 * Ham kiem tra xau co do dai lon hon 2 ki tu
	 	 * @param s
	 	 * @return boolean
	 	 */
	 	public static boolean getMaxlength2String(String s) {
	 		if(notVaild(s)) return false;
	 		if(s.length() >2) return true;
	 		return false;
	 	} 
	 
		 /**
		 	 * Ham kiem tra xau co do dai lon hon 3 ki tu
		 	 * @param s
		 	 * @return boolean
		 	 */
		 	public static boolean getMaxlength3String(String s) {
		 		if(notVaild(s)) return false;
		 		if(s.length() >3) return true;
		 		return false;
		 	} 

		 	/**
		 	 * Ham kiem tra xau co do dai lon hon 5 ki tu
		 	 * @param s
		 	 * @return boolean
		 	 */
		 	public static boolean getMaxlength5String(String s) {
		 		if(notVaild(s)) return false;
		 		if(s.length() >5) return true;
		 		return false;
		 	}
		 	
		 	/**
		 	 * Ham kiem tra xau co dau space dau tien hay cuoi chuoi hay tat ca co dau space
		 	 * @param s
		 	 * @return boolean
		 	 */
		 	public static boolean getValidateSpace(String s) {
		 		String s1=s.trim();
		 		String s2=s.replaceAll("  ", " ");
		 		return ((s.length()>s1.length())&&(s.length()>s2.length()))?true:false;
		 	}
		 	/**
		 	* Ham kiem tra xem xau co bao gom chu so hay ki tu dac biet
			 * @param s
			 * @return boolean
			 */
			public static boolean notVaildString(String s){
				if(notVaild(s)) return false;
				if(getValidateSpace(s)) return false;
				String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
				Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
				String s1 = pattern.matcher(temp).replaceAll("");
				String regex = "[a-zA-z0-9]+([ '-][a-zA-Z0-9]+)*"; 
				return (s1.matches(regex))?false:true;
			}
			public static boolean isSpecialCharacters(String str) {
				str = str.trim();
				str = str.replaceAll("\\s+", " ");
				String regex = (".*[\"\\.&,@!?%'$()/\\\\ \\_<>].*");
				return (str.matches(regex)) ? true : false;
			}

			public static boolean isBlankItem(String cARMM_MKCD, String cARMM_SYCD, String cARMM_JRCNT,
					String cARMM_J1CNT, String cARMM_LBLCT, String cARMM_HTKN, String cARMM_EMPNO1, String eMPFL_EMPNM,
					String cARMM_EMPNO2, String cARMM_EMPNO3, String cARMM_EMPNO4, String cARMM_EMPNO5,
					String cARMM_EMPNO6, String cARMM_EMPNO7, String cARMM_EMPNO8, String cARMM_EMPNO9,
					String cARMM_EMPNO10, String cARMM_YOBI) {
				
				if( "0".equals(cARMM_MKCD) && "0".equals(cARMM_SYCD) &&   (cARMM_JRCNT == null || cARMM_JRCNT.length() == 0 || "".equals(cARMM_JRCNT)) 
				&& 	 (cARMM_J1CNT == null || cARMM_J1CNT.length() == 0 || "".equals(cARMM_J1CNT))  && 	 (cARMM_LBLCT == null || cARMM_LBLCT.length() == 0 || "".equals(cARMM_LBLCT))
				&& 	 (cARMM_EMPNO1 == null || cARMM_EMPNO1.length() == 0 || "".equals(cARMM_EMPNO1))  && 	 (cARMM_HTKN == null || cARMM_HTKN.length() == 0 || "".equals(cARMM_HTKN))
				&& 	 (eMPFL_EMPNM == null || eMPFL_EMPNM.length() == 0 || "".equals(eMPFL_EMPNM))  && 	 (cARMM_EMPNO2 == null || cARMM_EMPNO2.length() == 0 || "".equals(cARMM_EMPNO2))
				&& 	 (cARMM_EMPNO4 == null || cARMM_EMPNO4.length() == 0 || "".equals(cARMM_EMPNO4))  && 	 (cARMM_EMPNO3 == null || cARMM_EMPNO3.length() == 0 || "".equals(cARMM_EMPNO3))
				&& 	 (cARMM_EMPNO5 == null || cARMM_EMPNO5.length() == 0 || "".equals(cARMM_EMPNO5))  && 	 (cARMM_EMPNO9 == null || cARMM_EMPNO9.length() == 0 || "".equals(cARMM_EMPNO9))
				&& 	 (cARMM_EMPNO6 == null || cARMM_EMPNO6.length() == 0 || "".equals(cARMM_EMPNO6))  && 	 (cARMM_EMPNO10 == null || cARMM_EMPNO10.length() == 0 || "".equals(cARMM_EMPNO10))
				&& 	 (cARMM_EMPNO7 == null || cARMM_EMPNO7.length() == 0 || "".equals(cARMM_EMPNO7))  && 	 (cARMM_YOBI == null || cARMM_YOBI.length() == 0 || "".equals(cARMM_YOBI))
				&& 	 (cARMM_EMPNO8 == null || cARMM_EMPNO8.length() == 0 || "".equals(cARMM_EMPNO8))){
				
					return true;
				}
				
				
				return false;
			}

}