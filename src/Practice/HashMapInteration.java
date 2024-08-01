package Practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapInteration {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> al = new HashMap<Integer, String>();
		
		al.put(1, "Datta");
		al.put(2,"Ghodke");
		al.put(3, "Shivraj");
		
		
		for(Entry<Integer, String> a:al.entrySet()) {
			
			System.out.println("Key is "+a.getKey()+" Name "+a.getValue());
		}
	}

}
