package generic_constructor;

public class GenericConstructor1 <T> {
	
	public <S, U> GenericConstructor1(T val1, S val2, U val3){
		System.out.println(val1+"  "+val2+" "+val3);
	}
	
	public static void main(String[] args) {
		GenericConstructor1<Integer> gm1 = new GenericConstructor1<Integer>(10, 15.9999999, "String");
	}

}
