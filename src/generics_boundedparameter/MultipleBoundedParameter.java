package generics_boundedparameter;

class A{
	
}

interface B{
	
}

interface C{
	
}

class D extends A implements B,C{
	
}

public class MultipleBoundedParameter {
	
	public static <T extends A & B & C> void getSum(T val1) {
		
	}
	
	public static <T extends B & C> void getSum1(T val1) {
		
	}
	
	public static <T extends A> void getSum2(T val1) {
		
	}
	
//	public static <T extends B & A & C> void getSum1(T val1) {
//			
//		in Multiple Bound 1st class should be extended followed by interface
//	
//	}
	
	public static void main(String[] args) {
		getSum(new D()); //Since D is extending A and implementing B and C  we can pass D type values
		getSum1(new D());
		getSum2(new D());
	}

}
