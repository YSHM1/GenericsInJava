package generic_class_practice;

public class StoreValue {
	
	public static void main(String[] args) {
		StoreIntegerValue siv = new StoreIntegerValue(10);
		Integer value1 = siv.getValue();
		System.out.println(value1);
		
		StoreDoubleVaue sdv = new StoreDoubleVaue(10.5);
		Double value2 = sdv.getValue();
		System.out.println(value1);
		
		StoreAnyValue sav = new StoreAnyValue(10);
		Integer value3 = (Integer) sav.getValue(); //problem need to cast Object Type to Integer Explicitly
		StoreAnyValue sav1 = new StoreAnyValue(10.5);
		Double value4 = (Double) sav1.getValue(); //problem need to cast Object Type to Double Explicitly
		
		//Solution ---------> Go for Generic Class
		StoreAnyValueWithGenerics<Integer> sg1 = new StoreAnyValueWithGenerics<Integer>(10);
		System.out.println(sg1.getValue());
		StoreAnyValueWithGenerics<Double> sg2 = new StoreAnyValueWithGenerics<Double>(10.6);
		System.out.println(sg2.getValue());
		StoreAnyValueWithGenerics<String> sg3 = new StoreAnyValueWithGenerics<String>("yash");
		System.out.println(sg3.getValue());
		
		StoreAnyValueWithGenerics<Integer> sg4 = new StoreAnyValueWithGenerics<>(10); //no need to declare type in constructor of class from java 1.7 and above
		System.out.println(sg4.getValue());
		StoreAnyValueWithGenerics<String> sg5 = new StoreAnyValueWithGenerics<>("abcd");
		System.out.println(sg5.getValue());
		
		//StoreAnyValueWithGenerics <T> -----> this is called type parameter
		//StoreAnyValueWithGenerics<Integer> ----> this is called type argument
		
		
		//we can declare multiple type parameter for class
		StoreAnyValueWithGenericsMultipleTypeParamenters<Boolean, Double> smt = new StoreAnyValueWithGenericsMultipleTypeParamenters<Boolean, Double>(true, 10.9, "abcd", 10);
		smt.printValue();
		
		//we can declare object without TypeParameter for Generic class but Return Type will be
		//Raw Type(Object type)	
		StoreAnyValueWithGenerics sg6 = new StoreAnyValueWithGenerics(10);
		Integer value5 = (Integer) sg6.getValue();
		
	}

}
