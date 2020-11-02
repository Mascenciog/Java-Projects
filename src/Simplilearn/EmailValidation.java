package Simplilearn;


public class EmailValidation {

	@SuppressWarnings("static-access")
	public static boolean main(String[] args, String email) {
		// Get an EmailValidator instance first
				EmailValidation validator = EmailValidation.getInstance();
		 
				// check valid email address
				if (!validator.isValid(email)) {
					return false;
				}
				return true;
			} 
		 
			private static EmailValidation getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

			/* driver function to check */
			public static void main(String[] args){ 
				String email1 = "admin@java2blog.com"; 
				String email2 = "@java2blog.com";
				String email3 = "arpit.mandliya@java2blog.com";
				String[] emails= {email1,email2,email3};
		 
				for (int i = 0; i < emails.length; i++) {
					String email=emails[i];
					if (isValid(email)) 
						System.out.print(email+" is valid email"); 
					else
						System.out.print(email+" is invalid email"); 
		 
					System.out.println();
				}// TODO Auto-generated method stub
		

	}

			private static boolean isValid(String email) {
				// TODO Auto-generated method stub
				return false;
			}

}
