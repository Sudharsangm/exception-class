package exception;

public class Number_format_exception {
	
	public static void main(String[] args) {
		
		String a = "sudharsan";
	
		
		try {
			int b = Integer.parseInt(a);
			System.out.println(b);
		}
		catch (Exception e) {
			System.out.println(e+" It is numberformat exception");
			e.printStackTrace();
		}
		finally {
			System.out.println("********");
		}
		
		
	}

}
