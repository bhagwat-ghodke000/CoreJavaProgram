package Practice;

public class MethodOverriding1 {
	
	String name;
	
	String clas;
	
	
	
	@Override
	public String toString() {
		return "MethodOverriding1 [name=" + name + ", clas=" + clas + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public void methodOne() {
		
		System.out.println("Final Method2");
	}
	
	MethodOverriding1(){
		System.out.println("Default Constructor in parent method");
	}
	
	MethodOverriding1(int i){
		System.out.println("Second Integer Constructor in parent method");
	}
	
	


}
