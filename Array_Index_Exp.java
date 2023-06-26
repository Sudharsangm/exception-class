package exception;

public class Array_Index_Exp {
	public static void main(String[] args) {
		
		String[] a = {"Sudharsan","Rahul","Raja"};
		try {
		System.out.println(a[5]);
		}
		catch(IndexOutOfBoundsException e ){
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
		System.out.println("*****Excuted even when exception occurs or not****");
		}
	}

}
