package oops_rev;

public class Encap {
	
	private float a;
	
	public float getA() {
		return a;
	}
	
	public void setA(int valueA) {
		a=valueA;
		System.out.println(a);
	}
	
	public static void main(String [] args) {
		Encap obj = new Encap();
		obj.setA(34);
		
	}

}
