package oops_rev;

public class Polymor {
	
	public  Polymor() {
		System.out.println("Constructor");
	}
	
	public static void meth1(int a, float b) {
		System.out.println("int float");
	}
	
	public void meth1(float c,int d) {
		System.out.println("float int");
	}
	
	public void meth1(int m, double n) {
		System.out.println("int double");
	}
	
	public void meth1(int p, int q, int r) {
		System.out.println("int int int");
	}
	
	public static void main(String[] args) {
		Polymor ab= new Polymor();
		ab.meth1(1,1.65);
		
	}

}
