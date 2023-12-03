package generics_boundedparameter;

class A1{
	
}

interface B1{
	
}

interface C1{
	
}

class D1 extends A1 implements B1{
	
}

public class MultipleBoundedParameter2 {
	
	public static <T extends A1 & B1 & C1> void getSum(T val1) {
		
	}
	
	public static void main(String[] args) {
//		getSum(new D()); //Since D is not implementing C1 we cannot pass D type values
	}

}
