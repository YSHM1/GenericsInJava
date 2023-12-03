package generic_constructor;

public class GenericConstructor {
	
	public <T, S> GenericConstructor(T val, S val1) {
		System.out.println(val+" "+val1);
	}
	
	public static void main(String[] args) {
		GenericConstructor gc = new GenericConstructor(10, "YAsh");
	}

}
