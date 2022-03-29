package com.giftshop.model;
import java.util.Scanner;

import com.giftshop.dao.TransactionValid;

public class Transaction{

		
		public static void transactionMethod() throws Exception {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Mode of Payment");
			System.out.println("1. UPI id");
			System.out.println("2. Debit/Credit card");
			System.out.println("3. Cash On Delivery");
			
			int a=sc.nextInt();
			if(a==1) {
				TransactionValid.payByUPI();
			}
			else if(a==2) {
				TransactionValid.payByCard();
			}
			else if(a==3) {
				
			}
			else 
			{
				System.out.println("Enter the VALID  input");
			}
			}

		
	}