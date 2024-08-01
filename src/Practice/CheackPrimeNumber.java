package Practice;

import Demo.PrimeCheacker;

public class CheackPrimeNumber {
	
	
	boolean primeCheacker(Integer s) {
		
         if(s == 0 || s==1) {
			
			return false;
		}
		
		for(int i=2;i * i<=s;i++) {
			
			if(s%i==0) {
				
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		
    CheackPrimeNumber c = new CheackPrimeNumber();
    
		if(c.primeCheacker(7)) {
			
			System.out.println("It is a prime number");
		}else {
			
			System.out.println("It is a not prime number");
		}
		
	}

}
