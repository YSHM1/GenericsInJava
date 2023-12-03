package generic_class_practice;

public class StoreAnyValueWithGenerics <T> {
	
	private T value;
	
	public StoreAnyValueWithGenerics(T value){
		this.value=value;
	}
	
	public T getValue() {
		return value;
	}

}
