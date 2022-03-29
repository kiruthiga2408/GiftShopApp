package com.giftshop.dao;
	import java.util.Scanner;

	

	public class UserProcess {
	public static void userGiftItem(int user_Id) throws Exception
	{
		System.out.println("1. Display all  the gift items");
		System.out.println("2. search gift by gift_ name");
		System.out.println("3. logout");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number==1) {
			UserGiftProcess.giftProcessUser(user_Id);
		
		}
		else if(number==2)
		{
			UserGiftProcess.giftName(user_Id);
		}
		else if(number==3)
		{
			System.out.println("Logging Out");
			System.exit(0);
			
		}
	}
	}