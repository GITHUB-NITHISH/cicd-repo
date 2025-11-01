package oops_rev;

public class Inherit_Three extends Inherit_two  {
	
	public Inherit_Three() {
		this(5);
		System.out.println("Constructor 3");
	}
	
	public Inherit_Three(int a) {
		System.out.println("Constructor 32");
	}

	@Override
	public void MethOne() {
		super.MethOne();
		System.out.println("Two add" + a);
	}
	
	@Override
	public void MethFour() {
		
		super.MethFour();
		System.out.println("Four plus one");
	}
	
	public static void main(String[] args) {
		System.out.println("Final output");
		Inherit_Three ob2= new Inherit_Three();
		ob2.MethOne();
	
	}
}
