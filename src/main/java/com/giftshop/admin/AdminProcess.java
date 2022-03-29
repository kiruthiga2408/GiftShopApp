package com.kvcet.giftshopApp.model;

import java.util.Scanner;

import com.kvcet.giftshopApp.dao.AdminBookProcess;
import com.kvcet.giftshopApp.dao.AdminGiftProcess;
import com.kvcet.giftshopApp.dao.MemberBookProcess;

public class AdminProcess {
	public static void adminProcessGift() throws Exception
	{
		System.out.println("1. Add Gifts");
		System.out.println("2. Delete by gift Id");
		System.out.println("3. Delete by gift Name ");
		System.out.println("4.  Delete by gift Price");
		System.out.println("5. Show User Process");
		System.out.println("6. Show MemberShip process");
		System.out.println("7. Display all the  Gifts");
		System.out.println("8. logout");
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number==1) {
			AdminProcess.add();
			AdminProcess.adminProcessGift();
		}
		else if(number==2)
		{
			AdminGiftProcess.deletGiftId();
			AdminProcess.adminProcessGift();
		}
		
		else if(number==4)
		{	
			AdminGiftProcess.deleteGiftName();
			AdminProcess.adminProcessGift();
		}
		else if(number==5)
		{
			AdminGiftProcess.deleteGiftPrice();
			AdminProcess.adminProcessGift();
		}
		
		else if(number==6)
		{
			AdminGiftProcess.UserId();
			AdminProcess.adminProcessGift();
		}
		else if(number==7)
		{
			AdminGiftProcess.Memberid();
			AdminProcess.adminProcessGift();
		}
		
		else if(number==8)
		{
			MemberBookProcess.bookprocessMember();
			AdminProcess.adminProcessGift();
		}
		else
		{
			System.out.println("Your sucessfully log out");
		}
	}
	}

