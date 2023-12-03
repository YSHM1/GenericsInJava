package generics_type_inference;

import java.io.Serializable;
import java.util.ArrayList;

public class TypeInference {
	
	public static <T> void getValues(T val1, T val2) {
		System.out.println(val1.getClass().getName());
		System.out.println(val2.getClass().getName());
	}
	
	public static <T> void getValues(ArrayList<T> list,T val1, T val2) {
		list.add(val1);
		list.add(val2);
		System.out.println(list.get(0).getClass().getName());
		System.out.println(list.get(1).getClass().getName());
	}
	
	public static <T> T getValueAndReturn(T n1, T n2) {
		return n1;
	}
	
	public static void main(String[] args) {
		getValues(10, 20);
		getValues("10", "20");
		getValues(10, "20");
		
		getValues(new ArrayList<>(), 10, 20);
		getValues(new ArrayList<>(), "10", 20);
		getValues(new ArrayList<>(), "10", "20");

		getValues(new ArrayList<Integer>(), 10, 20);
		getValues(new ArrayList<String>(), "10", "20");
//		getValues(new ArrayList<Integerasd>(), "10", "20");
//		getValues(new ArrayList<String>(), 10, 20);
		
		Integer value1 = getValueAndReturn(10, 20);
		String value2 = getValueAndReturn("10", "abcd");
		
		//because class Integer extends Number which is implementing Serializable interface
		//and also implements Comparable interface 
		Serializable value3 = getValueAndReturn(10,"asd");
		
		//class String implements Serializable interface
		Serializable value4 = getValueAndReturn("abcd", 10);
		
	}

}
