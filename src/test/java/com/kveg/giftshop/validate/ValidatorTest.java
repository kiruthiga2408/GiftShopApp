package com.kveg.giftshop.validate;
import com.kveg_giftshop_app.Register;


public class ValidatorTest {


	public static void main(String[] args) throws Exception {
		Register reg=new Register();
		reg.setName("kiruthiga");
		reg.setEmailId("kiru@gmail.com");
		reg.setCreatePassword("pass123");
		reg.setConfirmPassword("pass123");
		reg.setContactNumber("1987552770");
	  System.out.println(reg);	
	  
	  Validator.validateRegisterDetails(reg);
	
	}

}
