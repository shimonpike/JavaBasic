package Arrays;

import Maps.Car;

public class MainCars {

public static void main(String[] args)
{
		Car c1 = new Car();
		c1.setModel("Kia");
		c1.setYear(2019);
		c1.setEngine(1.4);
		c1.display();
		
		Car c2 = new Car("Ford", 2020,1.6); 
		c2.display();
}

}
