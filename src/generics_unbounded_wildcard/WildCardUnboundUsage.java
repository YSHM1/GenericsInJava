package generics_unbounded_wildcard;

import java.util.Arrays;
import java.util.List;

public class WildCardUnboundUsage <T> {
	
	T var;
	
	public T returnValue(T val) {
		var=val;
		return var;
	}
	
	public void printList(List<T> list) {
		for(T obj:list) {
			System.out.println(obj);
		}
	}
	
	public void printListWithWildCard(List<?> list) {
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	
	public static void main(String[] args) {
		WildCardUnboundUsage<Integer> w1 = new WildCardUnboundUsage<>();
		List<Integer> list = Arrays.asList(1,2,3,4);
		w1.printList(list);
		
		List<String> list1 = Arrays.asList("yash", "xcvb");
//		w1.printList(list1); // error because w1 is specified as Integer type
		w1.printListWithWildCard(list1); //but with wildcard same can work
		
	}
	
}
