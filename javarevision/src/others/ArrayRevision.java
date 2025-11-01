package others;

import java.util.Arrays;
import java.util.List;

public class ArrayRevision {

	private void meth1() {

		int ab[] = new int[4]; // Allocation of memory
		ab[0] = 343;
		ab[1] = 67;
		ab[2] = 23;
		ab[3] = 66;
		

		int cd[] = { 2, 5, 4, 2, 8, 0, 1 };

		float ef[] = new float[] {  7.3f,2.4f, 13.1f, 21.9f, 6.6f , 5.2f, 34.1f };

		int gh[][] = new int[4][4];

		short bk[][] = { { 2, 4 }, { 4, 7 }, { 9, 3 } };

		Arrays.parallelSort(ab);
	
		for ( int i=0; i<ab.length; i++) {
			System.out.println(ab[i]);
		}
		
		int bb= Arrays.binarySearch(ab, 67);
		System.out.println(bb);
		
		int gg[] = Arrays.copyOf(ab, 5);
		
		for (int i=0; i<gg.length; i++) {
			System.out.println(gg[i]);
		}
		
		int yy[] = Arrays.copyOfRange(gg, 1, 3);
		for(int i=0; i< yy.length; i++) {
			System.out.println(yy[i]);
		}
		
		Boolean bl = Arrays.equals(yy, ab);
		System.out.println(bl);
		
		Arrays.fill(cd, 7);
		for (int i=0; i<cd.length ; i++) {
			System.out.println(cd[i]);
		}
		
		List<float[]> lst = Arrays.asList(ef);
		
		String sh = Arrays.toString(ef);
		System.out.println(sh);
		
//		Arrays.sort(ef);
//		for (int i=0; i<ef.length; i++) {
//			System.out.println(ef[i]);
//		}
		
		for (int j=0; j<ef.length; j++) {
			System.out.println(ef[j]);
		}
		
		Arrays.sort(ef,2,7);
		for (int j=0; j<ef.length; j++) {
			System.out.println(ef[j]);
		}
		
		int uu[] = ab.clone();
		
		
	}

	public static void main(String[] args) {

		ArrayRevision ob2 = new ArrayRevision();
		ob2.meth1();
	}

}
