package exception;

public class LogIn {
	public static void main(String[] args) throws LogInvalidation {
		String username = "admin";
		String password ="abcd";
		try {
		if(username.equals("admin")&& password.equals("abc")) {
			System.out.println("login successful");
		}
		else {
			throw new LogInvalidation("Login failed");
			
		}
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Further Execution");
	}

}
