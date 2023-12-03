package generic_interface_practice;

//will work only for Integer type value because interface is type parameterized with specific DataType
public class ObjectInfoUsage implements ObjectInfo<Integer>{

	@Override
	public Integer getObjectInfo(Integer value) {
		// TODO Auto-generated method stub
		return value;
	}
	
	public static void main(String[] args) {
		ObjectInfoUsage oiu = new ObjectInfoUsage();
		System.out.println(oiu.getObjectInfo(10));
		
		ObjectInfoUsage oiu2 = new ObjectInfoUsage();
//		oiu2.getObjectInfo("gdhj"); will give error as interface is type Parameterized with Integer
		
	}

}
