package exception;

public class Null_Pointer_Exception {

	public static void main(String[] args) {
		
		String value = null;
		
		try {
			System.out.println(value.toUpperCase());
		}
		catch (ArithmeticException e) {
			System.out.println(e+" divided by zero");
			e.printStackTrace();
		}
		catch(NumberFormatException e1) {
			System.out.println(e1+" is chanding String to Integer");
			e1.printStackTrace();
		}
		catch(NullPointerException e2) {
			System.out.println(e2+" is null value");
			e2.printStackTrace();
		}
		catch(Exception e3) {
			System.out.println(e3+" some exception");
			e3.printStackTrace();
		}
		finally {
			System.out.println("***Excuted even when exception occurs or not****");
		}
	}
}
