package Practice;

final class ImmutableClass {
	
	private String s;

	public ImmutableClass(String s) {
		super();
		this.s = s;
	}
	
	public String getString() {
		
		return s;
	}
	
	
	public static void main(String[] args) {
		
		ImmutableClass I = new ImmutableClass("Bhagwat");
		I.hashCode();
		
		System.out.println(I.getString());
		
		ImmutableClass I2 = new ImmutableClass("Shubham");
		System.out.println(I2.getString());
		
		System.out.println(I2);
	}
	
	
	

}
