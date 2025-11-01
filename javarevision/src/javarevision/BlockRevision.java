package javarevision;

public class BlockRevision extends FinalKeyword {
	int a=45;
	public static int aa;           

	public BlockRevision(){
		System.out.println("Constructor");
		aa=45;
		
		{
			int lc1 =231;                    // Local block
		}
	}
	
	{
		System.out.println("Instance block" + a + aa);   //Instance block
	}
	
	static {
		System.out.println("Static block222");
	}
	
	public void s1() {
		int c=67;
		System.out.println("Normal method");
	}
	
	public static void s2() {
		int c=67;
		System.out.println("Static method");
	}

		
	
	public static void main(String[] args) {
		System.out.println("Static main");
		BlockRevision org= new BlockRevision();
		BlockRevision org2= new BlockRevision();
	
//		BlockRevision.aa
//		org.aa                      // Static variable access in static method
//		aa
		
		
		
	}
}
