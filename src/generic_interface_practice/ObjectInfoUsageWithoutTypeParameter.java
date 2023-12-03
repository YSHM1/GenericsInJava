package generic_interface_practice;

// it will return Raw value(Object type) as it is not type parameterized
public class ObjectInfoUsageWithoutTypeParameter implements ObjectInfo{

	@Override
	public Object getObjectInfo(Object value) {
		// TODO Auto-generated method stub
		return value;
	}
	
	public static void main(String[] args) {
		ObjectInfoUsageWithoutTypeParameter owtp = new ObjectInfoUsageWithoutTypeParameter();
		Integer value = (Integer) owtp.getObjectInfo(10);
		System.out.println(value);
		
		String value1 = (String) owtp.getObjectInfo("asdf");
		System.out.println(value1);
	}

}
