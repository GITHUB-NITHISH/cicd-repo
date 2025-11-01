package others;

public class Stringrevision {
	
	private void meth1() {
		
		String st = "My name is JK   ";
		String st10 = "my name is jk";
		String st11 = "";
		String st2 = new String("Be positive");
		char ch[] = {'e','y','r','e','x','d'};
		
		String st3 = new String(ch);
		System.out.println(st3);
		
		String st4 = new String(ch,0,3);
		System.out.println(st4);
		
		char ch1= st.charAt(3);
		System.out.println(ch1);
		
		int it = st.length();
		System.out.println(it);
		
		String st5 = st.substring(4,8);
		System.out.println(st5);
		
		String st6 = st.substring(7);
		System.out.println(st6);
		
		boolean bl = st.contains("x");
		System.out.println(bl);
		
		boolean eq = st.equals(st10);
		System.out.println(eq);
		
		boolean eq2 = st.equalsIgnoreCase(st10);
		System.out.println(eq2);
		
		Boolean eq3 = st11.isEmpty();
		System.out.println(eq3);
		
		if(st==st10) {
			System.out.println("Equals ==");
		}
		
		String st7 = st.concat(st10);
		System.out.println(st7);
		
		System.out.println(st+st10);
		
		String[] st8 = st.split(" ");
		for (int i=0; i< st8.length; i++) {
			System.out.println(st8[i]);
		}
		
		String[] st15 = st.split(" ",3);
		for (int i=0; i< st15.length; i++) {
			System.out.println(st15[i]);
		}
		
		String st9 = st.replace('J', 'N');
		System.out.println(st9);
		
		String st12 =st.replace("name", "peyar");
		System.out.println(st12);
		
		int it3 = st9.indexOf('N');
		System.out.println(it3);
		
		String up = st.toUpperCase();
		System.out.println(up);
		
		String lw = st10.toLowerCase();
		System.out.println(lw);
		
		String trm = st.trim();
		System.out.println(trm);
		
		
        Boolean bl4 = st.startsWith("My");
        System.out.println(bl4);
        
        Boolean bl5 = st.endsWith("Nk");
        System.out.println(bl5);
        
        int lsit = st.lastIndexOf('K');
        System.out.println(lsit);
        
        char[] ch5 = st.toCharArray();
        for (int i=0; i< ch5.length  ; i++) {
        	System.out.println(ch5[i]);
        }
        
        String st17 = st.replaceAll("My name", "Our namam");
        System.out.println(st17);
        	
        
	}
	
	private void meth2() {
		StringBuffer sb = new StringBuffer("Hello world");
		String s2 = "How are u";
		
		StringBuffer sb3 = new StringBuffer();
		sb3.append("Police station of india");
		
		sb3.insert(2, "Hai");
		System.out.println(sb3);
		
		sb3.replace(5, 8, "Soper");
		System.out.println(sb3);
		
		sb3.delete(2, 8);
		System.out.println(sb3);
		
		sb3.deleteCharAt(2);
		System.out.println(sb3);
		
//		sb3.reverse();
//		System.out.println(sb3);
		
		int ab = sb3.capacity();
		System.out.println(ab);
		
		int cd = sb3.length();
		System.out.println(cd);
		
		String sb4 = sb3.substring(7,10);
		System.out.println(sb4);
		
		String sb5 = sb3.substring(12);
		System.out.println(sb5);
		
        char ch = sb3.charAt(11);
        System.out.println(ch);
		
        int it6 = sb3.indexOf("i");
        System.out.println(it6);
        
        String st = sb3.toString();
		
		System.out.println(st+sb3);
		
	}
	
	
	public static void main(String[] args) {
		
		Stringrevision ob= new Stringrevision();
//		ob.meth1();
		ob.meth2();
		}

}
