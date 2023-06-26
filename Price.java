package exception;

public class Price {
	
	public static void main(String[] args)  {
		int price = -500;
		try {
		if(price>0) {
			System.out.println("valid Price");
			
		}
		else {
			throw new InvalidPrice("negative price") ;
		}
		}
		catch(InvalidPrice e) {
		System.out.println(e);
		e.printStackTrace();
		}
		System.out.println("EXECUTED");
	}
	

}
