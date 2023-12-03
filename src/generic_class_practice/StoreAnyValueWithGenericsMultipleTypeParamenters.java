package generic_class_practice;

public class StoreAnyValueWithGenericsMultipleTypeParamenters <T, V> {
	
	private T value;
	private V value2;
	String value3;
	int value4;
	
	public StoreAnyValueWithGenericsMultipleTypeParamenters(T value, V value2, String value3, int value4){
		this.value=value;
		this.value2 = value2;
		this.value3 = value3;
		this.value4 = value4;
	}
	
	public void printValue() {
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);		
	}

}
