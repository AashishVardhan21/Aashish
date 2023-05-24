package com.sign_up;
import java.util.regex.*;



public class Validation {
	public static void validate(int id) {
		if(String.valueOf(id).length()==6) {
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid Id");
			User_details.enter_id();
		}
	}
	
	public void validate(String name) {
		// TODO Auto-generated method stub
		if(name.equals(name.toUpperCase()))
		{		
			System.out.println("Valid format");
		}
		else
		{
			System.out.println("Please enter the name in uppercase format only");
		User_details.enter_name();
		}
	}
	
	public static boolean validatepass(String password)
	{
	
			// TODO Auto-generated method stub
			if(password.length()<5)
			{
//				System.out.println("re-enter the password");
				return false;
				
			}
			if(!password.matches(".*[a-z].*"))
			{
//				System.out.println("re-enter the password");
				return false;
				
			}
			if(!password.matches(".*[A-Z].*"))
				
			{
//				System.out.println("re-enter the password");
				return false;
			}
			if(!password.matches(".*[!@#$%^&*()'',.{}?/|].*"))
	       { 
//				System.out.println("re-enter the password");
				return false;
				
	        }
			
			else
				return true;
		}

	
		// TODO Auto-generated method stub
	    


//		public static boolean validateMobileNumber(String number) {
//			// TODO Auto-generated method stub
//			
//		        return Pattern.matches(MOBILE_NUMBER_PATTERN, number);
//		    }
		
	    
		public static boolean validateMobileNumber(String number) 
		{
			String MOBILE_NUMBER_PATTERN = "^[9|8|7|6]\\d{9}$";
			
		       return Pattern.matches(MOBILE_NUMBER_PATTERN, number);
		    }

		public void validateGmail(String gmail) {
			// TODO Auto-generated method stub
			if(gmail.endsWith("@gmail.com"))
			{
				if(gmail.length()>10)
				{
					System.out.println("vaid gmail");
				}
				else
				{
					System.out.println("invalid gmail");
				}
			}
			else
			{
				System.out.println("Should end with @gmail.com only");
				User_details.enter_gmail();
			}
			
		}
}
