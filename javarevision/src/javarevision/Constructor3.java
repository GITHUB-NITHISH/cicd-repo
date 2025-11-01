package javarevision;

public class Constructor3 extends Constructor2 {
	
	
	public Constructor3() {
		System.out.println("Constructor 3");
	}
	
	public Constructor3(int d) {
		System.out.println("p Constructor 3");
	}
	public void Meth3() {
		System.out.println("Method 3");
	}
	
	public static void main(String[] args) {
		Constructor2 nop3 = new  Constructor2(3);
		
		
	}

}
