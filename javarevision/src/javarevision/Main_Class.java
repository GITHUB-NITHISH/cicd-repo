package javarevision;
import  java.util.Scanner;

public class Main_Class{
	 int a;   // Instance variable
	 static float ac;     //static variable
	 
	
	public void dataTypes(int i) {  // Local variable
		byte a = 127;
		short b = 32767;
		int c= 233323434;
		long d= 2346723784625890998l;
		float e= 2.4636443f;
		double f= 45.53453436357547;
		char g= 'I';
		boolean h= true;
		System.out.println (g);
		System.out.println(i);
	}
	
	public void variables() {
		System.out.println(Main_Class.ac);
	}
	
	public void conversion() {
		int a1= 12;
		String str2= "Im good";
		String str = Integer.toString(a1);
		System.out.println(str+12);
		
		String str1 = String.valueOf(a1);
		System.out.println(str1);
		
//		int num = Integer.parseInt(str2);
//		System.out.println(num);
		
	
		int x= 'R';
		System.out.println(x);
		
		char ch2 = (char)x;
		System.out.println(ch2);
	}
	
	public static void static_Method() {
			
	}
	
	public void control_Statements() {
		
		if(10>(16-6)) {
			if(5>7) {
				System.out.println("s1");
			}
			System.out.println("s2");
		}
		else if(10<6) {
			System.out.println("s3");
		}
		else {
			System.out.println("44");
		}
		
		
		int b4 = 65;
		while (b4<67) {
			System.out.println(b4);
			b4++;
		}
		
		do {
			System.out.println(b4);
			b4++;
		}while(b4>100);
		
		for(;b4<70;b4++) {
			System.out.println(b4);
		}
		
		switch(b4) {
		case 70:
			System.out.println("70 is");
		case 71:
			System.out.println("71");
			break;
		}
	}
	
	public void Scanner() {
		
		Scanner ref =new Scanner(System.in);
		System.out.println("Enter name : ");
		char nam =ref.next().charAt(3);
		System.out.println(nam);
		ref.close();
	}
	public static void main(String[] args) {
		System.out.println("Hi Nithish");	
		Main_Class ob = new Main_Class();   // Declaring reference variable and Object creation
		ob.dataTypes(2);			// Calling nonstatic method by ref datatype
		ob.variables();
		System.out.println(ob.a);   // calling instance variable 
		System.out.println(Main_Class.ac);
		System.out.println(ac);      // calling static variables
		ob.conversion();
		static_Method();    // Calling static method directly
		
		ob.control_Statements();
		
		ob.Scanner();
	}
}
