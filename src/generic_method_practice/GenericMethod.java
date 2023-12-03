package generic_method_practice;

public class GenericMethod {
	
	public int getInt(int value) {
		return value;
	}
	
	public String getValue(String value) {
		System.out.println("return type String");
		return value;
	}
	
	public <T> T getValue(T value){
		System.out.println("Return Type generic");
		return value;
	}
	
	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		System.out.println(gm.getInt(10));
		
		int value = gm.getValue(10);
		System.out.println(value);
		
		System.out.println(gm.getValue("asdf")); //calling getValue of String type
	}

}
