package Practice;

public class Comparsion {
	
	public static void main(String[] args) {
		
		String s="Java";
		
		String s1="Javac";
		
		StringBuffer sb = new StringBuffer();
		sb.append("Javaa");
		
		if(s.equals(s1)) {
			
			System.out.println("Equals");
		}
		
		if(s==s1) {
			
			System.out.println("in the == operator");
		}
		
		System.out.println(s.hashCode());
		System.out.println(sb.hashCode());
	}

}
