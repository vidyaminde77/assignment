package tddassignment.email;

public class Email {

	public static boolean Emailpass(String email,String password) {
		String email1="vids@gmail.com";
		String password1="vid@123";
		
		if(email.equals(email1)&&password.equals(password1))
		{
			return true;
		}else
		{
			return false;	
		}
		
		
		
	}
}
