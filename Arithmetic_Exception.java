package exception;

public class Arithmetic_Exception {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
		int d = a/b;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae+" It is arithmetic Exception");
			ae.printStackTrace();     //to find in which line the exception occurs
		}
		finally {
			System.out.println("Excuted even when exception occurs or not");
		}
		
 System.out.println("********CODE EXECUTED********");
		
	}
}
