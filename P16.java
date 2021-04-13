/*
Write programs in Java to use Wrapper class of each primitive data types
*/
class DemoWrapperClass
{
	// Premitive Datatypes

	boolean varBool = true;
	byte varByte = 10;
	int varInt = 20;
	char varChar = 'R';
	double varDouble = 101010;
	float varFloat = 34.5f;
	short varShort = 21;
	long varLong = 100;

	// Premitive Data store to Wrapper Class Object 

	Boolean objBool = new Boolean(varBool);
	Byte objByte = new Byte(varByte);
	Double objDouble = new Double(varDouble);
	Float objFloat = new Float(varFloat);
	Character objChar = new Character(varChar);
	Integer objInt = Integer.valueOf(varInt);
	Long objLong = Long.valueOf(varLong);
	Short objShort = Short.valueOf(varShort);

	// Wrapper Class Object to Premitive Data Type

	int unObjInt = objInt.intValue();
	char unObjChar = objChar.charValue();
	double unObjDouble = objDouble.doubleValue();
	float unObjFloat = objFloat.floatValue();
	byte unObjByte = objByte.byteValue();
	boolean unObjBool = objBool.booleanValue();
	short unObjShort = objShort.shortValue();
	long unObjLong = objLong.longValue();

	//	Autoboxing Wrapper Class
	void autoBoxing()
	{
		System.out.println("\n<---- Wrapper Class AutoBoxing Demo ----->\n");
		System.out.println("Byte Class Object Value     :"+objByte);
		System.out.println("Boolean Class Object Value   :"+objBool);
		System.out.println("Character Class Object Value :"+objChar);
		System.out.println("Short Class Object Value     :"+objShort);
		System.out.println("Long Class Object Value      :"+objLong);
		System.out.println("Integer Class Object Value   :"+objInt);
		System.out.println("Float Class Object Value     :"+objFloat);
		System.out.println("Double Class Object Value    :"+objDouble);
	}
	// Unboxing Wrapper Class
	void unBoxing()
	{
		System.out.println("\n<---- Wrapper Class UnBoxing Demo ----->\n");
		System.out.println("Byte Data Type Value      :"+unObjByte);
		System.out.println("Boolean Data Type Value   :"+unObjBool);
		System.out.println("Character Data Type Value :"+unObjChar);
		System.out.println("Short Data Type Value     :"+unObjShort);
		System.out.println("Long Data Type Value      :"+unObjLong);
		System.out.println("Integer Data Type Value   :"+unObjInt);
		System.out.println("Float Data Type Value     :"+unObjFloat);
		System.out.println("Double Data Type Value    :"+unObjDouble);
	}
}
class P16
{
	public static void main(String[] args)
	{
		DemoWrapperClass d = new DemoWrapperClass();
		d.autoBoxing();	
		d.unBoxing();
	}
}