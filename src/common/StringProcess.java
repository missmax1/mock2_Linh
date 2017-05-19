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
		if(s==null || s.length()==0) return true;
		return false;
	}
	
	/**
	 * Ham kiem tra xem xau co bao gom chi chu so hay khong
	 * @param s
	 * @return boolean
	 */
	public static boolean notVaildNumber(String s){
		if(notVaild(s)) return true;
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
		 	 * Ham kiem tra xau co do dai lon hon 20 ki tu
		 	 * @param s
		 	 * @return boolean
		 	 */
		 	public static boolean getMaxlength20String(String s) {
		 		if(s.length() >=20) return true;
		 		return false;
		 	} 

		 	/**
		 	 * Ham kiem tra xau co do dai lon hon 7 ki tu
		 	 * @param s
		 	 * @return boolean
		 	 */
		 	public static boolean getMaxlength7String(String s) {
		 		if(s.length() >=10) return true;
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
		 	
}