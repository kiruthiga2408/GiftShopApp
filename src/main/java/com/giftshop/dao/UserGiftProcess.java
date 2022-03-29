package com.giftshop.dao;
import com.giftshop.dao.*;
import com.giftshop.model.Transaction;

import java.sql.Connection; 
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class UserGiftProcess {
	static Scanner sc = new Scanner(System.in);
public static void giftProcessUser(int user_Id) throws Exception {
	
	Connection connection;
	connection=ConnectionUtil.sqlConnection();
	
	String query1 = "SELECT Gift_Item_id,Gift_Item_Name,Gift_Item_price FROM giftItemsDetails ";
	Statement stm = connection.createStatement();
	ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query1);
	System.out.println("GiftId \t  Gift_Name \t\t Price");
	while (rsm.next()) {
		System.out.println(rsm.getString("Gift_Item_id")+ "\t" + rsm.getString("Gift_Item_name")+"\t\t" +rsm.getString("Gift_Item_price"));

	}
	orderGift(user_Id);
}

public static void giftName(int user_Id ) throws Exception
{
	
		System.out.println("Enter gift Name ");
		Scanner sc = new Scanner(System.in);
		String Gift = sc.nextLine();
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		String query2 = "select Gift_Item_id,Gift_Item_Name FROM giftItemsDetails WHERE Gift_Item_Name ='"+Gift+"' order by Gift_Item_Name " ;
		Statement stm = connection.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query2);
		while (rsm.next()) {
			System.out.println(rsm.getString("Gift_Item_id")+ "\t" + rsm.getString("Gift_Item_Name"));

	}
}
public static void orderGift(int user_Id) throws Exception {
	
	System.out.println("Want to Order? Y/N");
	char option=sc.next().charAt(0);
	if(option=='y' || option=='Y') {
		
		try {
		System.out.println("Enter Gift ID to order...");
		int id=sc.nextInt();
		String giftName=null;
		Connection connection;
		connection=ConnectionUtil.sqlConnection();
		String query2 = "select Gift_Item_Name FROM giftItemsDetails WHERE Gift_Item_id='"+id+"' " ;
		Statement stm = connection.createStatement();
		ResultSet rsm = ((java.sql.Statement) stm).executeQuery(query2);
		while(rsm.next()) {
			giftName=rsm.getString("Gift_Item_Name");
		}
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Delivery Address");
		String address="";
		address+=sc1.nextLine();
		String query3="update  userDetailsGiftShop set Address='"+address+"' where id= '"+user_Id+"' ";
		stm.executeUpdate(query3);
		Transaction.transactionMethod();
		String query="update  userDetailsGiftShop set Gift='"+giftName+"' where id= '"+user_Id+"' ";
		stm.executeUpdate(query);
		System.out.println(giftName+" Order Purchased");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}else if(option=='n' || option=='N') {
	// UserProcess.userGiftItem();
	}
	else {
		System.out.println("INVALID option");
		giftProcessUser(user_Id);
	}
	
	
 }
}

