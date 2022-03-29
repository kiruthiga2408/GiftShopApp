package com.giftshop.model;
import com.giftshop.dao.*;

import java.sql.Connection;
import java.sql.PreparedStatement;


	public class UserUpdate {
		public static void InsertUser(Registration user) throws Exception {
			
			try {
			Connection connection;
			PreparedStatement statement;
			connection=ConnectionUtil.sqlConnection();
			String query="insert into userDetailsGiftShop(name,email,password,mobile)values(?,?,?,?)";
			statement = connection.prepareStatement(query);
			statement.setString(1, user.getUserName());
			statement.setString(2, user.getUserEmail());

			statement.setString(3, user.getUserPassword());

			statement.setString(4, user.getUserMobile());
		//	statement.setInt(5, user.getUserId());
			
			int rows = statement.executeUpdate();
			System.out.println("You are Registered Successfully!!!!"+rows);
			UserFree.userlogin();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			}
		}

