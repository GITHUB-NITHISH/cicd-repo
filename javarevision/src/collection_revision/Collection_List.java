package collection_revision;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Collection_List {
	
	List<Object> ab = new ArrayList<Object>();
	
	public static void main (String[] args) {
        Collection_List ob = new Collection_List();
        ob.ListMethods();
        ob.Meth2();
        ob.meth3();
        
        ob.LinkedL();
        
        ob.Collec_Set();
        
        ob.Map_Interface();
                 
	}
	
	private void ListMethods() {
		
	ab.add(4);
	ab.add(4.3f);
	ab.add(true);
	ab.add(null);      // Null element
	ab.add(12);
	ab.add("Nithish");
	ab.add(3,'f');
	ab.add(null);		// Multiple null
	ab.add(4.3f);      // Duplicate
		
	System.out.println(ab);
	
	List<Object> gg = new ArrayList<Object>();			
	gg.add(56);
	gg.addAll(ab);
	System.out.println(gg);
	
	int s1= ab.size();
	System.out.println(s1);
	
//	ab.clear();
	
	boolean bl = ab.contains(12);
	System.out.println(bl);
	
	boolean bl2 = ab.containsAll(gg);
	System.out.println(bl2);
	
	boolean bl3 = ab.equals(gg);
	System.out.println(bl3);
	
	Object ob1 = ab.get(4);
	System.out.println(ob1);
	
	Object ob2 = ab.set(5, 100);
	System.out.println(ob2);
	System.out.println(ab);
	
	int it1 = ab.indexOf(null);
	System.out.println(it1);
	
	int it2 = ab.lastIndexOf(null);
	System.out.println(it2);
	
	boolean bl4 = ab.isEmpty();
	System.out.println(bl4);
	
	Object ob3 = ab.remove(5);
	System.out.println(ob3);

	boolean bl5 = ab.remove("Nithish");
	System.out.println(bl5);
	
	System.out.println(ab);
	System.out.println();
	}
	
	private void Meth2() {
		
	List<Object> ef = new ArrayList<Object>();
	ef.add(0.99);
	ef.add('g');
	ef.add(678);
		
	List<Object> cd = new LinkedList<Object>();
    cd.add('y');
    cd.add(0.99);
    cd.add("SKY");
    cd.add(43);
    cd.add(45);
    cd.add("Why this");
    cd.add('g');
   
    
    System.out.println(cd);
    
//    boolean bl= cd.removeAll(ef);
//    System.out.println(bl);
//    
//    System.out.println(cd);
    
    boolean bl2 = cd.retainAll(ef);
    System.out.println(bl2);
    
    System.out.println(cd);
    System.out.println();
  
	}
	
	private void meth3() {
		List<Object> cd = new LinkedList<Object>();
	    cd.add('y');
	    cd.add(0.99);
	    cd.add("SKY");
	    cd.add(43);
	    cd.add(45);
	    cd.add("Why this");
	    cd.add('g');
	    
	    List<Object> lst = cd.subList(3, 6);
	    System.out.println(lst);
	    
	    
	    Object uu[] =  cd.toArray();
	    for(int i=0; i<uu.length; i++) {
	    	System.out.print(uu[i] + " ");
	    }
	    System.out.println();
	}
	
	private void LinkedL() {
		
		LinkedList<Object> op= new LinkedList<Object>();
		op.add("Nithish");
		op.addFirst(765);
		op.addLast(90);
		op.add('h');
	
		System.out.println(op);
		
		Object x = op.remove();
		Object y = op.removeLast();
		Object z = op.remove(1);
		
		System.out.println(op);
		
		op.add(43);
		op.add(5232);
		op.add('t');
		op.add("Kite");
		op.add(43);
		op.add('t');
		System.out.println(op);
		
		Boolean b1= op.removeFirstOccurrence(43);
		System.out.println(op);
		Boolean b2= op.removeLastOccurrence('t');
		System.out.println(op);
		
		System.out.println(op.get(3));		
		System.out.println(op.getFirst());
		System.out.println(op.getLast());
		
		System.out.println(op.size());
		
	    System.out.println(op);
	    
	    System.out.println(op.peek());
	    System.out.println(op.peekFirst());
	    System.out.println(op.peekLast());
	    
	    System.out.println(op);
	    
	    System.out.println(op.poll());
	    System.out.println(op.pollFirst());
	    System.out.println(op.pollLast());
		
	    System.out.println(op);
	    
	    System.out.println(op.offer("My"));
	    System.out.println(op.offerFirst("Wife"));
	    System.out.println(op.offerLast('g'));
	    
	    System.out.println(op);

	}
	
	private void Collec_Set() {
		
		Set<Object> st= new HashSet<Object>();
		
		st.add("Jb");
		st.add('J');
		st.add('J');
		st.add(null);
		st.add(null);
		
		System.out.println(st);
		
		for(Object ref : st) {
			System.out.println(ref);
		}
		
		Set<Object> st2 = new LinkedHashSet<Object>();
		st2.add(78);
		st2.add("ui");
		st2.add(null);
		st2.add(78);
		st2.add(null);
		
		System.out.println(st2);
		
		TreeSet<Object> st3 = new TreeSet<Object>();
		st3.add(3);
		st3.add(54);
		st3.add(8);
		st3.add(9);
		st3.add(1);
		st3.add(32);
		st3.add(54);
		st3.add(10);
		
		System.out.println(st3);
		
		System.out.println(st3.first());
		System.out.println(st3.last());
		
		SortedSet<Object> set2= st3.headSet(8);
		System.out.println(set2);
		
		SortedSet<Object> set3= st3.tailSet(8);
		System.out.println(set3);
		
		SortedSet<Object> set4 = st3.subSet(2,5);
		System.out.println(set4);
		
		System.out.println(st3.higher(10));
		System.out.println(st3.lower(10));
		
		System.out.println(st3.pollFirst());
		System.out.println(st3.pollLast());
		
		System.out.println(st3);

	}
	
	
	private void Map_Interface() {
		
		Map<Object,Object> mp = new HashMap<Object,Object>();
		
		mp.put("Hai", 5);
		mp.put("Hello", 7);
		mp.put("Namaste", 10);
		mp.put("Namaskar", 18);
		
		Map<Object,Object> mp2 = new HashMap<Object,Object>();
		mp.putAll(mp2);		
		
		System.out.println(mp);
		
		System.out.println(mp2.get("Namast"));
		
		boolean bl = mp2.containsKey("Namaskar");
		System.out.println(bl);
		
		boolean bl2 = mp2.containsValue(12);
		System.out.println(bl2);
		
		Object ob=  mp2.remove("Namaskar");
		System.out.println(ob +" "+ mp2);
		
		int it2 = mp2.size();
		System.out.println(it2);
		
		Set<Object> set4 = mp2.keySet();
		System.out.println(set4);
		
		Collection<Object> cl = mp2.values();
		System.out.println(cl);
		
		
		
	}
	


}
