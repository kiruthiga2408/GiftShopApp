package com.kveg_giftshop_app.test;
//import com.kveg_giftshop_app;
import com.kveg_giftshop_app.Register;



public class RegisterTestClass {
	
	public static void main(String[] args) {
		Register reg = new Register();
		reg.setName ("kiruthiga");
		reg.setEmailId ("kiru@gmail.com");
		reg.setCreatePassword ("pass123");
		reg.setConfirmPassword ("pass123");
		reg.setContactNumber ("1987552770");
		 System.out.println(reg);
	}

}
