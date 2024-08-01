package Practice;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = "Shivraj";
		
		char[] charArray = s.toCharArray();
		
		int length = charArray.length;
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=length-1;i>=0;i--) {
			
			sb.append(charArray[i]);
		}
		
		System.out.println(sb);
	
	}
	
	

}
