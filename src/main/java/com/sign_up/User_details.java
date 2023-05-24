package com.sign_up;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

class scan{
	static Scanner sc=new Scanner(System.in);
	static Validation u=new Validation();
	static DTO ref=new DTO();
	
}

public class User_details extends scan {
	public static void userdetails() {
		enter_id();
		enter_name();
		enter_password();
		enter_number();
		enter_gmail();
		
		System.out.println("Enter the age");
		int age=sc.nextInt();
		ref.setAge(age);
		
		System.out.println("Enter the gender");
		String gender=sc.next();
		ref.setGender(gender);
		
		System.out.println("Eneter the otp");
		int otp=sc.nextInt();
		ref.setOtp(otp);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("project");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		et.begin();
		em.persist(ref);
		et.commit();
	}
	
	public static void enter_gmail() {
		System.out.println("Enter mail id");
		String gmail=sc.next();
		u.validateGmail(gmail);
		ref.setGmail(gmail);
	}
	
	public static void enter_number() {
		System.out.println("Enter M-number");
		String number=sc.next();
		try {
			if(u.validateMobileNumber(number)) {
				ref.setNumber(number);
			}
			else {
				System.out.println("Enter valid M-number");
				enter_number();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			enter_number();
		}
		
	}

	public static void enter_password() {
		System.out.println("Enter Passkey");
		String password=sc.next();
		if(u.validatepass(password)) {
			System.out.println("Passkey Accepted");
			ref.setPassword(password);
		}
		else {
			System.out.println("Password must contain atleast one uppercase, one lowercase, number,symbol and length should be more then 4 characters");
			enter_password();	
		}
	}
	
	public static void enter_name() {
		// TODO Auto-generated method stub
		System.out.println("enter name");
		String name=sc.next();
		u.validate(name);
		ref.setName(name);
	}
	
	public static void enter_id() {
		// TODO Auto-generated method stub
		System.out.println("enter id");
		int id=sc.nextInt();
		u.validate(id);
		ref.setId(id);		
	}
}
