package com.giftshop.model;
import com.giftshop.model.*;
import com.giftshop.dao.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

//import com.kvcet.giftshopApp.dao.ConnectionUtil;
//import com.kvcet.giftshopApp.dao.UserProcess;
//import com.kvcet.giftshopApp.model.Registration;


public class UserFree{
	
	public static void registerUser() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String userName=sc.nextLine();
		System.out.println("Enter Your Email ");
		String userEmail=sc.next();
		System.out.println("Enter Your Password  ");
		String userPassword=sc.next();
		System.out.println("Enter Your Mobile Number  ");
		String userMobile=sc.next();
		int num= (int)(Math.random()*(5000-8000+1)+5000);
		System.out.println("Enter Your captcha here it is  "+num);
		int userId=sc.nextInt();
		Registration user = new Registration();
		user.setUserName(userName);
		user.setUserEmail(userEmail);
		user.setUserPassword(userPassword);
		user.setUserMobile(userMobile);
		
		try
		{
			UserCheck.UserValidation(user);
		}
		catch(Exception e)
		{
			System.out.println("Once again registered");
			
			System.out.println("ERROR : " +e.getMessage());
			registerUser();
		}
		
		
		
	}
	public static void userlogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Gmail id");
		String UserGmail = sc.next();
		System.out.println("Enter your Password ");
		String UserPassword = sc.next();
		try {
			loginValidator(UserGmail, UserPassword);
		}
		catch(Exception e)
		{
			System.out.println("Enter correctly");
			System.out.println( e.getMessage());
			userlogin();
			
		}
	}
	public static  void loginValidator(String email,String password) throws Exception
	{
	Connection connection;
	PreparedStatement statement;
	connection=ConnectionUtil.sqlConnection();
	ResultSet rs = null;
	String query = "SELECT email,Password,id FROM userDetailsGiftShop WHERE email= ? ";
	statement = connection.prepareStatement(query);
	statement.setString(1,email);
	//statement.setString(2,password);
	rs = statement.executeQuery();
	String mail = null;
	String Password=null;
	int user_Id= 0;
	String number=null;
	while(rs.next())
	{
	mail=rs.getString("email");
	Password=rs.getString("Password");
	user_Id=rs.getInt("id");	
	}
	if(mail==null)
	{
	throw new Exception("No Records Found");
	}
	
	else if(Password.equals(password))
	{
		System.out.println("Successfully login");
		UserProcess.userGiftItem(user_Id);

	}
	else
	{
	throw new Exception("Invalid Credentials");
	}
	}
	
}