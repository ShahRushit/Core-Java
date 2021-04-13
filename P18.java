/*
	Create a class Vehicle with data member vehicle_type. Inherit the class in a class
	called car with data member model_type, company name etc.
	display the information of the vehicle by defining the display function in both
	super and sub class [ Method Overriding]
*/
class Vehicle
{
	String vehicle_type;
	Vehicle(String vType)
	{
		vehicle_type = vType;
	}
	void display()
	{
		System.out.println("Vehicle Type :"+vehicle_type);
	}
}
class Car extends Vehicle
{
	String model_type,company_name;
	Car(String model,String cname)
	{
		super("Car");
		model_type = model;
		company_name = cname;
	}
	void display()
	{
		System.out.println("-----Vehicle Information-----");
		System.out.println("Vehicle Type :"+super.vehicle_type);
		System.out.println("Model Type   :"+model_type);
		System.out.println("Company Name :"+company_name);
	}
}
class P18
{
	public static void main(String arg[]) 
	{
		Car c = new Car("Altroz","TATA");	
		c.display();
		Car c1 = new Car("Swift","Maruti Suzuki");	
		c.display();
		Car c2 = new Car("Duster","Renault");	
		c.display();
	}
}