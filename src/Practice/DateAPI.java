package Practice;

import java.util.Date;

public class DateAPI {
	
	public static void main(String[] args) {
		
		String d= "2002/05/05";
		
		String[] split = d.split("/");
		
		
		String[] split2 = d.split(d, 0);
		
		System.out.println(split2.length);
		
		
		for(int i=0;i<=split.length-1;i++) {
			
			if(split[i].length()==4) {
				
				int int1 = Integer.parseInt(split[i]);
				
				if(int1 % 4==0) {
					
					System.out.println("This is a leap year");
				}else {
					
					System.out.println("This is a not leap year");
				}
			}
		}
		
		
	}

}
