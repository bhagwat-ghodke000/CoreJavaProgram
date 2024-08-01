package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationElement {
	
	public static void main(String[] args) {
       List<Integer> al = new ArrayList<Integer>();
		
		al.add(2);
		al.add(7);
		al.add(5);
		al.add(3);
		al.add(10);
		al.add(15);
		al.add(9);
		
		Iterator<Integer> iterator = al.iterator();
		
		while(iterator.hasNext()) {
			
			Integer next = iterator.next();
			
			System.out.println(next);
		}
	}

}
