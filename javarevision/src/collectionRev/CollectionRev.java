package collectionRev;

import java.util.ArrayList;

public class CollectionRev {
	
	ArrayList<Object> line1 = new ArrayList<Object>();
	ArrayList<Object> line2 = new ArrayList<Object>(4);
	ArrayList<Object> line3 = new ArrayList<Object>(line1);
	ArrayList line4 = new ArrayList();
	
	public void meth() {
		
		line1.add(5);
		line1.add(1,"rat");
		line3.addAll(line1);
		System.out.println(line3);
	}
	
	
	
	
	
	public static void main(String[] args) {
		CollectionRev ob= new CollectionRev();
		ob.meth();
		
	}

}
