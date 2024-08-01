package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StringOccurance {
	
	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		
		al.add("Shivraj");
		al.add("Bhagwat");
		al.add("Ghodke");
		al.add("Datta");
		al.add("Datta");
		al.add("Shivraj");
		
		HashMap<String, Integer> occurance = new HashMap<String, Integer>();
		
		Integer count =0;
		
		
		for(String a:al) {
			
			for(String b:al) {
				
				if(a.equals(b)) {
					
					count++;
				}
			}
			
			occurance.put(a, count);
			
			count=0;
		}
		
		System.out.println(occurance);
		
		
	}

}
