package Demo;

public class Palindrom {
	
	public static void main(String[] args) {
		
		String s = "BAB";
		
		char[] chars = s.toCharArray();
		
		StringBuffer reverse = new StringBuffer();
		
		for(int i=chars.length-1;i>=0;i--) {
			
			reverse.append(chars[i]);
		}
		
		System.out.println(reverse);
		
		if(s.equals(reverse.toString())) {
			System.out.println("It is Palindrom String");
		}else {
			System.out.println("It is a not POalindrom");
		}
	}

}
