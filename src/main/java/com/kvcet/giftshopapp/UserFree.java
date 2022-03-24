package com.kvcet.giftshopapp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;





public class UserFree 
{
	public static void userFreeRegister() throws Exception
	
	
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Name");
			String name=sc.nextLine();
			System.out.println("Enter emailId");
			String emailId=sc.next();
			System.out.println("Enter Your Password");
		
			
			System.out.println("Enter Contact Number");
			String contactNumber=sc.next();
			
			.setname(name);
			.setemaiId(emailId);
			.set
			.setcontactNumber(contactNumber);
			int count=0;
			try 
			{
				UserCheck.UserValidation();
			}
			catch(Exception e) {
				System.out.println("Once Agin Register");
				count++;
				System.out.println("Error: " +e.getMessage());
				registerUser();
			}
			if(count==0) {
				UserUpdate.Insertuser();
				UserProcess.userbook();
				
			}
			
		}
		public static void userLogin() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Email");
			String emailID=sc.next();
			System.out.println("Enter your Password");
			
			try {
				loginValidator(email,Password);
			}
			catch(Exception e)
			{
				System.out.println("Please Enter Valid EmailId");
				System.out.println(e.getMessage());
				userlogin();
			}
		}
		public static void  loginValidator(String emailId,String password) {
			Connection connection;
			PreparedStatement statement;
			connection=ConnectionUtil.sqlconnection();
			Result
		
	}

	
}
