package com.giftshop.model;

public class UserCheck {
	public static int count=0;
	
	public static void UserValidation(Registration user) throws Exception
	{
	UserNameCheck(user.getUserName());
	UserEmailCheck(user.getUserEmail());
	UserPasswordCheck(user.getUserPassword());
	UserMobileCheck(user.getUserMobile(),user);

	}
	
	public static void UserNameCheck(String userName) throws Exception
	{
		if(userName==null)
		throw new Exception("Enter Vaild Name");
		else
			count++;
		
	}
	public static void UserEmailCheck(String userEmail) throws Exception
	{
		if(!userEmail.contains("@"))
		throw new Exception("Enter Vaild Email");
		else
			
		count++;
		
	}
	public static void UserPasswordCheck(String  userPassword) throws Exception
	{
		if(userPassword.length()<8 || userPassword.length()>16)
		throw new Exception("Enter Vaild PassWord");
		else
			count++;
		
	}
	public static void UserMobileCheck(String userMobile,Registration user) throws Exception
	{
	int count1=0;
		char[] mobile=userMobile.toCharArray();
		if(userMobile.length()>10||userMobile.length()<10)
		{
			
		throw new Exception("Enter Only 10 Number ");
		
		}
		else
			count1++;
		for(char i:mobile)
		{
			if(Character.isAlphabetic(i))
			{
				//count++;
				throw new Exception("Enter Only Numeric Value");
				
				
			}
			else
				count1++;
		
		}
		if(count1==11)
		{
			count++;
		}
		if(count==4)
		{
			UserUpdate.InsertUser(user);
			System.out.println("Registration is Completed .....  Welcome");
			
			
		}
		
		
		
	}
	
}