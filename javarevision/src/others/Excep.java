package others;

import java.io.FileNotFoundException;

public class Excep {

	
	private void meth() {
		
	try {
		int a=8/0;
	}
	catch(ArithmeticException xx){
		
	}
	catch(NullPointerException tt){
		
	}
	
	}
	
	private void meth2() {
		try {
			
		}
		finally {
			
		}
	}
	
	private void meth3() {
		try {
			
		}
		catch(ArrayIndexOutOfBoundsException uu){
			
		}
		finally {
			
		}

	}
	private void meth4() throws ArithmeticException{
		int x=6/0;
		System.out.println("Done");

	}
	
	private void meth5() {
		try {
			if(10>56) {
				throw new NullPointerException();
			}
			else {
				throw new ArithmeticException();
			}

		} catch (NullPointerException e) {
			System.out.println("Catched  " + e.getMessage());
		} catch(ArithmeticException f) {
			System.out.println("Catched  " + f.toString());
		} 
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	public static void main(String[] args) {
		Excep gg = new Excep();
//		gg.meth4();
		gg.meth5();
		
		Runtime.getRuntime().gc();
		System.gc();					// Garbage collector
	}
}
