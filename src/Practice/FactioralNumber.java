package Practice;

public class FactioralNumber {
	
	public static void main(String[] args) {
		
		int number=5;
		
		int factioralNumber=1;
		
		
		for(int i=1;i<=number;i++) {
			
			factioralNumber=factioralNumber * i;
		}
		
		System.out.println(factioralNumber);
	}

}
