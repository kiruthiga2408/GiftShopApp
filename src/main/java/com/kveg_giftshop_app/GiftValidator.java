package com.kveg_giftshop_app;

GiftShopApp
* Gift

GiftValidator

*validateGiftDetails( String Name ,String emailId,String createPassword,String confirmPassword,String contactNumber) throws Exception{
 if( Name == null) {
		throw new Exception("Invalid GIFT Name "); //Raise
	}
}

GiftDAO:

addGift(Gift gift ) {
	try{
		//1. connect => Class.forName( "Driver") => ClassNotFoundException
		//2. insert into ... executing query ==> SQLException
	}
	catch(Exception e){

	}

}

main(){
  String Name = "dk";
  String emailId="kiru@gmail.com";
  String createPassword="";
   // Validate details
try{
  GiftValidator.validateGiftDetails(Name,emailId,createPassword,confirmPassword,contactPassword);

 
Gift gift = new Gift();
gift.setTitle(Name);
gift.set(10);
GiftDAO.addGift(gift);
  
	
}
catch(Exception e){

}

}