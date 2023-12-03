package generic_interface_practice;

//will work only for all type value because interface is not type parameterized 
//with specific DataType

public class ObjectInfoUsage2<T> implements ObjectInfo<T>{

	@Override
	public T getObjectInfo(T value) {
		// TODO Auto-generated method stub
		return value;
	}
	
	public static void main(String[] args) {
		ObjectInfoUsage2<Integer> oiu2 = new ObjectInfoUsage2<>();
		System.out.println(oiu2.getObjectInfo(10));
		
		ObjectInfoUsage2<String> oiu2_1 = new ObjectInfoUsage2<>();
		System.out.println(oiu2_1.getObjectInfo("ACVBNM"));
		
	}



}
