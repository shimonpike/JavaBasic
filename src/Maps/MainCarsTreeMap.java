import java.util.*;

public class MainCarsTreeMap {

public static void main(String[] args) {
TreeMap<Car,CarOwner> map1 = 
		         new TreeMap<>();
Car c1 = new Car("Toyota Camry", 2.5, "ABC123", "Blue", 2020);
Car c2 = new Car("Honda Civic", 1.8, "DEF456", "Silver", 2019);
Car c3 = new Car("Ford Mustang", 5.0, "GHI789", "Red", 2022);
Car c4 = new Car("Volkswagen Golf", 1.4, "JKL012", "White", 2021);
Car c5 = new Car("BMW X5", 3.0, "MNO345", "Black", 2023);
Car c6 = new Car("Mercedes-Benz C-Class", 2.0, "PQR678", "Gray", 2022);
Car c7 = new Car("Audi A4", 2.0, "STU901", "Green", 2020);
Car c8 = new Car("Chevrolet Corvette", 6.2, "VWX234", "Yellow", 2021);
Car c9 = new Car("Nissan Altima", 2.5, "YZA567", "Silver", 2019);
Car c10 = new Car("Subaru Outback", 2.4, "BCD890", "Blue", 2022);

CarOwner ow1 = new CarOwner("John Doe", "555-123-4567", 1);
CarOwner ow2 = new CarOwner("Alice Smith", "555-987-6543", 2);
CarOwner ow3 = new CarOwner("Bob Johnson", "555-234-5678", 3);
CarOwner ow4 = new CarOwner("Eva Brown", "555-876-5432", 4);
CarOwner ow5 = new CarOwner("David Lee", "555-345-6789", 5);

map1.put(c10, ow5);
map1.put(c9, ow5);
map1.put(c8, ow5);
map1.put(c7, ow4);
map1.put(c6, ow3);
map1.put(c5, ow3);
map1.put(c4, ow2);
map1.put(c3, ow2);
map1.put(c2, ow1);
map1.put(c1, ow1);

MainCarsMap.printCarsMap(map1);
Car c11 = new Car("Subaru Outback", 2.4, "BCD890", "Blue", 2022);

System.out.println(map1.get(c11));


	}

}
