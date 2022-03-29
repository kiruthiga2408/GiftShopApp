package com.giftshop.model;
import java.util.Scanner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.giftshop.dao.*;

public class MemberShip {

	public  static void memberShipRegister() {
		System.out.println("Member login Successful");
		
	}
	public static void memberLogin() {
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("Enter 1 To login user");
			
			int number = sc.nextInt();
			
			if(number==1)
			{
				UserFree.userlogin();
			}
		}

		public static  void loginValidator(String email,String password) throws Exception
		{
		Connection connection;
		PreparedStatement statement;
		connection=ConnectionUtil.sqlConnection();
		ResultSet rs = null;
		String query = "SELECT email,password, FROM userDetailsGiftShop WHERE email= ? ";
		statement = connection.prepareStatement(query);
		statement.setString(1,email);
		//statement.setString(2,email);
		rs = statement.executeQuery();
		String mail = null;
		String Password=null;
		//int memberId= 0;
		String number=null;
		while(rs.next())
		{
		mail=rs.getString("email");
		Password=rs.getString("password");
		
		}
		if(mail==null)
		{
		throw new Exception("No Records Found");
		}

		else if(Password.equals(password))
		{
			System.out.println("Successfully login");
			
		}
		else
		{
		throw new Exception("Invalid Credentials");
		}
		}
	}