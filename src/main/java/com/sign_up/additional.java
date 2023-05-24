package com.sign_up;

import java.util.*;

import com.sign_in.Sign_in;

public class additional extends scan {

	public static void option() {
		System.out.println("1.Sign Up \n2.Login");
		int op=sc.nextInt();
		switch (op) {
		
		case 1:
			System.out.println("Welcome to Sign up");
			User_details.userdetails();
			System.out.println("Successfully registered");
			Sign_in.signin();
			break;
			
		case 2:
			Sign_in in =new Sign_in();
			in.signin();
			break;
			
		default:
			System.out.println("Invalid option");
			option();
			break;	
			
		}
		
		
	}

}
