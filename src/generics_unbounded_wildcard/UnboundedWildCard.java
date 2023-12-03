package generics_unbounded_wildcard;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCard {

// WildCard can be used when we can implement Methods using functionality provided by Object Class	
// WildCard is denoted by ?
// WildCard means unknown
// eg List<?> here it means List of unknown type
// We can use WildCard with Collection only
	
	
	public static void printList(List<Object> list) {
		System.out.println("printList");
		for (Object object : list) {
			System.out.println(object);
		}
	}
	
	public static <T> void printListWithTypeParameter(List<T> list) {
		System.out.println("printListWithTypeParameter");
		for (T object : list) {
			System.out.println(object);
		}
	}
	
	
	public static <T> void printListWithTypeParameter(List<T> list, T item) {
		System.out.println("printListWithTypeParameter");
		list.add(item);
		
		//error because compiler doesn't know type of list
//		list.add(1);
//		list.add("abcd");
		
		//but we can add null
		list.add(null);
		
		for (T object : list) {
			System.out.println(object);
		}
	}
	
	public static void printListWithWildCard(List<?> list) {
		System.out.println("printListWithWildCard");
		for (Object obj: list) {
			System.out.println(obj);
		}
	}
	
//  Wildcard can be used only with collection
//	public static void printListWithWildCards(List<?> list, ? item) {
//		System.out.println("printListWithWildCards");
//		for (Object obj: list) {
//			System.out.println(obj);
//		}
//	}
	
	public static<T> void printListWithWildCard(List<?> list, T item) {
//		list.add(item); //error because we are not sure of types here
		System.out.println("printListWithWildCard");
		for (Object obj: list) {
			System.out.println(obj);
		}
	}
	
	public static void main(String[] args) {
		List<Object> list = Arrays.asList(1,2,"yash",false);
		printList(list);
		
		List<Integer> list1 = Arrays.asList(1,2,3,4);
//		printList(list1); //error because List<Object> is not asuper class of List<Integer>
		printListWithTypeParameter(list1);
		
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8);
		printListWithWildCard(list2);
		
		
	}

}
