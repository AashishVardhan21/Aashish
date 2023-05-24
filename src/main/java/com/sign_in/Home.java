package com.sign_in;



public class Home extends scan {
	public static void homePage(String mNumber) {
		// TODO Auto-generated method stub
		
		int Id=DAO.getId(mNumber);
		System.out.println("1.for all user details  2.for update the user details  3.for delete the user account   4.signup");
		
//		try {
		int option =sc.nextInt();
		switch (option) {
		
		case 1:
			DAO.readAllDats(Id);
			homePage(mNumber);
			
			break;
			
		case 2:
			DAO.update_Details(Id);
			homePage(mNumber);
			break;
		
		case 3:
			DAO.deleteUserAccount(Id);
			System.out.println("you account deleted succesfully");
			
		case 4:
			System.out.println("succesfully logOut");
			break;
			

		default:
			System.out.println("select correct option 1,2,,3,4");
			break;
		}
//		}
//		catch (Exception e) {
//       System.out.println("enter only numbers ");
//       homePage(mNumber);
		
//	}
}
	

}
