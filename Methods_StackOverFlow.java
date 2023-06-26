package exception;

public class Methods_StackOverFlow {
	
	public void add() {
		this.sub();
	}
	public void sub() {
		this.add();
	}

}
