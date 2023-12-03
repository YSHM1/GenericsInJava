package generics_boundedparameter;

public class BoundedParameter {
	
	public static <T> void  sum(T val1, T val2) {
//		System.out.println(val1+val2); CTE because compiler doesn't know what type of values will be stored in val1 and val2
	}
	
	
	
	//Number is a Abstract class which has many sub classes like Double, Integer, Float
	//Since T extends Number we can pass any type of value which is a sub class of Number and perform addition
	//But if we pass value which is not a sub class of Number then we will get CTE 
	
	public static <T extends Number> void getSum(T val1, T val2) {
		if (val1.getClass().getName().contains("Integer")) {
			System.out.println(val1.intValue()+val2.intValue());
		}
		else
			System.out.println("Not a Integer");
	}
	
	public static void main(String[] args) {
		getSum(10, 20);
//		getSum(10, "abcd"); CTE because String doesn't extends Number class
	}

}
