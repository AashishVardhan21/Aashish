package com.sign_in;
import java.util.*;

import com.sign_up.User_details;

class scan{
	static Scanner sc=new Scanner(System.in);
}

public class Sign_in extends MobileValidation{
	public static void signin() {
		System.out.println("Welcome to login page");
		MobileValidation.validate();
	}

}

class MobileValidation extends scan{
	static int c=0;
	public static void validate() {
		System.out.println("Enter M-number");
		String mNumber=sc.next();
		String old_mobile=DAO.mobile(mNumber);
		if(mNumber.equals(old_mobile))
		{
			System.out.println("Valid M-number");
			Additional.pass(mNumber);
		}
		else if(c>=3) {
			System.out.println("M-number not found, please sign up");
			User_details.userdetails();
		}
		else
		{
			c++;
			System.out.println(c+" "+"M-number doesn't exist");
			validate();
		}
	}
}