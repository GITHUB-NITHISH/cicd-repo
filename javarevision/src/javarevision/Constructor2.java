package javarevision;

public class Constructor2 extends Constructor{

	public Constructor2() {
		System.out.println("Constructor 2");
	}
	
	public Constructor2(int c) {
		this();
		System.out.println("P Constructor 2");
	}
	public void Meth2() {
		System.out.println("Method 2");
	}
	
	public static void main(String[] args) {
		Constructor2 nop2 = new  Constructor2(34);
		nop2.Meth2();
		
	}
}
