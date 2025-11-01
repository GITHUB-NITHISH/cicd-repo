package oops_rev;

public class Inherit_two extends Inherit{
	int a=45;
	public Inherit_two() {
		System.out.println("Constructor 2");
	}
	@Override
	public void MethOne() {
		super.MethOne();
		System.out.println("Additional code of methone");
	}
	
	@Override
	public void MethThree() {
		super.MethThree();
		System.out.println("three plus one");
	}
	
//	public static void main(String[] args) {
//		Inherit_two ob = new Inherit_two();
//		ob.MethOne();
//	}
}
