package com.giftshop.test;

import java.util.Scanner;
public class GiftShopAppTest {
	public static void main(String[] args) throws  Exception{
		back();
	}
	
	public static void back() throws Exception{
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to Gift Shop App....Buy more! Gift more!!");
			System.out.println("1---> Register/Sign up");
			System.out.println("2--> Login");
			System.out.println("3--> Admin/Sign in");
			
			int num=sc.nextInt();
			if(num==1) {
				UserFree.userFreeRegister();
			}
			else if(num==2) {
				MemberShip.MemberLogin();
			}
			else if(num==3) {
				
			}
			else {
				System.out.println("Enter the valid option")
			}
		}
	}

	

}
