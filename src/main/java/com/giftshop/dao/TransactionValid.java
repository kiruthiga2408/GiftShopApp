package com.giftshop.dao;

import com.giftshop.model.Transaction;

import java.util.Scanner;

public class TransactionValid {
	static Scanner sc = new Scanner(System.in);

	public static String takeCaptcha1() {
		int a = (int) (Math.random() * (9000 - 100 + 1) + 100);
		String b = String.valueOf(a);
		return b;
	}

	public static int captchaVerification() {
		String captcha = takeCaptcha1();
		System.out.println(captcha);
		System.out.println("Enter the above captcha:");
		String input = sc.next();
		if (input.equals(captcha)) {
			System.out.println("Paid Successful");
			return 0;
		} else {
			captchaVerification();
		}
		return 1;
	}

	public static void payByUPI() {

		System.out.println("Enter your UPI id:");
		String upi = sc.next();
		if (!upi.contains("@") || !upi.contains(".")) {
			System.err.println("Invalid UPI");

			payByUPI();
		} else {

			captchaVerification();

		}
	}

	public static void payByCard() {

		System.out.println("Enter Debit/Credit Card number");
		String deb = sc.next();
		sc.nextLine();
		if (deb.length() == 16) {

			captchaVerification();

		}
		else {
			System.out.println("Invalid Details");
			payByCard();
		}

	}
}
