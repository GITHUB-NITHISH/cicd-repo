package oops_rev;

public class Casting_two extends Casting{

	 int a=679;
	
	public void Meth2() {
		System.out.println("Meth2");
	}
	
	@Override
	public void Meth1() {
		super.Meth1();
		System.out.println("Overriden meth1");
		
	}
	
	public static void main(String[] args) {
		Casting_two ob = new Casting_two();
//		Casting_two ob = (Casting_two) new Casting();
//		Casting_two ob2 =(Casting_two)ob;
		ob.Meth2();
		ob.Meth4();
		ob.Meth1();
		System.out.println(ob.a);
	}
}
