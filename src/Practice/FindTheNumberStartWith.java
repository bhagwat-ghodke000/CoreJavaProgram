package Practice;

import java.util.ArrayList;
import java.util.List;

public class FindTheNumberStartWith {
	
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>();
		
		al.add(12);
		al.add(23);
		al.add(23);
		al.add(15);
		
		List<Integer> newList = new ArrayList<Integer>();
		
		
		for(int i=0;i<=al.size();i++) {
			
			al.get(i);
		}
		
		//al.stream().
		
		for(Integer a:al) {
			
			if(a.toString().startsWith("1")) {
				
				newList.add(a);
			}
		}
		
		System.out.println(newList);
	}

}