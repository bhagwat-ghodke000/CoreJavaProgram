package Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class getSecondHigest {
	
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(12);
		al.add(8);
		al.add(5);
		al.add(10);
		al.add(12);
		al.add(8);
		al.add(5);
		al.add(12);
		al.add(8);
		al.add(5);
		
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		int size = al.size()-2;
		
		System.out.println(size);
		
		
		System.out.println(al.get(size));
		
		
}

}
