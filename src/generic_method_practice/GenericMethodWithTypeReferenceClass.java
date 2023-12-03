package generic_method_practice;

public class GenericMethodWithTypeReferenceClass<S> {

	
	public <T> T getValue(T value, S value1){
		System.out.println("Return Type generic");
		System.out.println("Printing inside method ----------> "+value1);
		return value;
	}
	
	public static void main(String[] args) {
		GenericMethodWithTypeReferenceClass<String> gm = new GenericMethodWithTypeReferenceClass();		
		System.out.println(gm.getValue(10, "asdf"));
	}

}
