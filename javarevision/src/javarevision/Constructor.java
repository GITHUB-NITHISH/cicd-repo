package javarevision;

public class Constructor {
	int a=23;
	
	protected Constructor() {
		System.out.println("Constructor 1");
	}
	
	public Constructor(int b) {
		System.out.println("P constructor 1");
		this.a=24;
		System.out.println(a);
	}
	
	public void Meth1() {
		System.out.println("Method 1");
	}
	
	public static void main (String[] args) {
//		new Constructor();
		Constructor nop = new Constructor();
		nop.Meth1();
		
		Constructor nop4 = new Constructor(3);
		
		
	}

}
