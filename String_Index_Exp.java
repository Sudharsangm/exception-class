package exception;

public class String_Index_Exp {
	public static void main(String[] args) {
		
	String a = "Sudharsan";
	try {
	System.out.println(a.charAt(14));
	}
	catch(StringIndexOutOfBoundsException e){
		System.out.println(e);
		e.printStackTrace();
		
	}
	finally {
	System.out.println("****Excuted even when exception occurs or not*****");
	}

}
}