import java.util.Scanner;

public class CarLotApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarLot lot = new CarLot(); 
		Scanner scan = new Scanner(System.in); 
			// assuming  they are putting cars in order and not randomly. 
			lot.addCar(new Car("Mercedes Benz", "E350", 2010, 58000)); 
			lot.addCar(new UsedCar("Kia", "Forte", 2011, 12040, 36589));
			lot.addCar(new Car("Ford", "Escape",  2015, 20589)); 
			lot.addCar(new UsedCar("BMW", "430i", 2014, 32000, 75000));  
			lot.addCar(new Car("Toyota", "Camry",  2012, 24000)); 
			lot.addCar(new UsedCar("Porsche", "Taycan", 2020, 150000, 34000));  
			
			System.out.println("Enter a Make to search"); 
			String make = Validator.validateString(scan); 
			lot.findCarByMake(make);
			System.out.println("Enter a Year to search"); 
			int year = Validator.validateYear(scan); 
			lot.findCarByYear(year);
			System.out.println("Enter a Price to search"); 
			double price = Validator.validateDouble(scan); 
			lot.findCarByPrice(price);
			System.out.println(); 
			lot.findUsedCars(); 
			
			
	
			
			
	}

}
