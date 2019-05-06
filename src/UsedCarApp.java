import java.util.ArrayList;
import java.util.Scanner;

public class UsedCarApp {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in); 
		ArrayList<Car> cars = new ArrayList<Car>(); 
		cars.add(new Car("Ford", "Escape", 2010, 22000)); 
		cars.add(new UsedCar("Kia", "Forte", 2010, 10000, 15284)); 
		cars.add(new Car("Audi", "A6", 2017, 58000)); 
		cars.add(new UsedCar("Chevrolet", "Malibu Hybrid", 2016, 21000, 27058)); 
		cars.add(new Car("Toyota", "Rav4", 2016, 24500)); 
		cars.add(new UsedCar("BMW", "430x", 2014, 32000, 12477)); 
		char ans = 'y'; 
		char cont = 'y'; 
		
		while (ans == 'y') { // a choice of 7 on the user menu will break the outer loop so checking ans is not needed.
			for (int i = 0; i < cars.size(); i++) {
				System.out.print((i + 1) + ". ");
				System.out.printf("%-15s%-15s%-15s%-15s", cars.get(i).getMake(), cars.get(i).getModel(), cars.get(i).getYear(), cars.get(i).getPrice());
				if (cars.get(i) instanceof UsedCar) {
					System.out.printf("%-15s%-10s", "(Used)",  ((UsedCar) cars.get(i)).getMileage());
				}
				System.out.println(); 
			}
			System.out.println((cars.size() + 1) + "." + " Quit"); 
			
			
			System.out.println("Which car would you like? Enter the number: ");  
			int userInput = Validator.validateInt(scan); 
			if (userInput == cars.size() + 1) {
				System.out.println("Have a great day!"); 
				break; //
			}
			System.out.println("Below is the car you have selected, are you sure you would like to buy it? (y/n)"); 
			System.out.printf("%-15s%-15s%-15s%-15s", cars.get(userInput - 1).getMake(), cars.get(userInput - 1).getModel(), cars.get(userInput - 1).getYear(), cars.get(userInput - 1).getPrice());
			if (cars.get(userInput - 1) instanceof UsedCar) {
				System.out.printf("%-15s%-10s", "(Used)",  ((UsedCar) cars.get(userInput - 1)).getMileage());
			}
			
			cont = Validator.validateChar(scan); 
			if (cont == 'y') {
				System.out.println("Excellent! Our finance department will be with you shortly."); 
				cars.remove(userInput - 1); 
			}
			
		}

	}

}
