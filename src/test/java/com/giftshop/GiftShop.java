package com.giftshop;

import com.giftshop.model.*;
import java.util.Scanner;

//import com.kvcet.giftshopApp.Admin;
//import com.kvcet.giftshopApp.MemberShip;

public class GiftShop {

	public static void main(String[] args) throws Exception {

		menu();
	}

	public static void menu() throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome.....!! to Gift Shop App");
		System.out.println("1: Register / Sign up");
		System.out.println("2: Login / sign in");

		int number = sc.nextInt();
		if (number == 1) {
			UserFree.registerUser();
		} else if (number == 2) {
			UserFree.userlogin();
		} else if (number == 3) {
			// Admin.adminlogin();
		} else {
			System.out.println(" Enter the above mentioned  Option ONLY");
			menu();

		}

	}
}
