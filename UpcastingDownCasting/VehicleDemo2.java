/**  In upcasting we assign Child class object to Parent class Reference  **/

class Vehicle
{
	// Parent class with three common methods
	void start()
	{
		System.out.println("Vehicle is starting");
	}
	void stop()
	{
		System.out.println("Vehicle is stopping");
	}
	void fuel()
	{
		System.out.println("Vehicle is fueling");
	}
}

class Car extends Vehicle
{
	// Overriding methods in Car class
	void start()
	{
		System.out.println("Car is starting");
	}
	void stop()
	{
		System.out.println("Car is stopping");
	}
	void fuel()
	{
		System.out.println("Car needs petrol");
	}
	void airConditioner()
	{
		System.out.println("Car AC is ON");
	}
}

class Bike extends Vehicle
{
	// Overriding methods in Bike class
	void start()
	{
		System.out.println("Bike is starting");
	}
	void stop()
	{
		System.out.println("Bike is stopping");
	}
	void fuel()
	{
		System.out.println("Bike needs petrol");
	}
}

class Truck extends Vehicle
{
	// Overriding methods in Truck class
	void start()
	{
		System.out.println("Truck is starting");
	}
	void stop()
	{
		System.out.println("Truck is stopping");
	}
	void fuel()
	{
		System.out.println("Truck needs diesel");
	}
	void loadGoods()
	{
		System.out.println("Truck is loading goods");
	}
}

public class VehicleDemo2
{
	// Method accepting parent class reference (Upcasting)
	static void performDrive(Vehicle v)
	{
		v.start();  // Polymorphism - Runtime method overriding
		v.fuel();   // Polymorphism - Runtime method overriding
		v.stop();   // Polymorphism - Runtime method overriding
		
		// Downcasting Example
		if(v instanceof Car)
		{
			Car c = (Car) v;  // Downcasting Vehicle to Car
			c.airConditioner();
		}
		else if(v instanceof Truck)
		{
			Truck t = (Truck) v;  // Downcasting Vehicle to Truck
			t.loadGoods();
		}
	}

	public static void main(String args[])
	{
		// Upcasting - Child class object assigned to Parent class reference
		performDrive(new Car());    // Car methods will be called
		System.out.println("-------------------");
		performDrive(new Bike());   // Bike methods will be called
		System.out.println("-------------------");
		performDrive(new Truck());  // Truck methods will be called
	}
}
