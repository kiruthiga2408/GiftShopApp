package com.kveg.giftshop.validate;
import com.kveg_giftshop_app.Register;

public class Validator {
	 public static void validateRegisterDetails(Register reg)throws Exception{
		 if(reg.getName()==null) {
		 throw new Exception("Invalid name");
	    }
		 else if(reg.getEmailId()==null) {
			 throw new Exception("invalid email");
		 }
		 else if(reg.getCreatePassword()==null) {
			 throw new Exception("invalid password");
		 }
		 else if(reg.getConfirmPassword()==null) {
			 throw new Exception("invalid password");
		 }else if(reg.getContactNumber()==null) {
			 throw new Exception("invalid number");
		 }
      System.out.println("validation passed");
	
   }
}
