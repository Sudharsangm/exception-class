package exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Exception {
	public static void main(String[] args) throws IOException {
		
		try {
			File file = new File("C:\\Users\\Text.txt");
			FileReader f = new FileReader(file);
			int temp =0;
			while((temp=f.read())!=-1) {
				System.out.println((char)(temp));
			}
		}
	    catch(FileNotFoundException e ){
	    	System.out.println(e);
	    	e.printStackTrace();
	    	
	    }
		
		System.out.println("success");

}
}