import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int userInput = 0; 
		ArrayList<Car> cars = new ArrayList<Car>(); 
		
		System.out.println("Welcome to the Grand Circus Motors admin console!\nHow many cars are you entering?: "); 
		 
		userInput = Validator.validateInt(scan); 
		
		for (int i = 0; i < userInput; i++ ) {
			System.out.println("Enter car #" + (i + 1) + " Make: "); 
			String inputMake = Validator.validateString(scan);
			scan.nextLine(); 
			System.out.println("Enter car #" + (i + 1) + " Model: "); 
			String inputModel = Validator.validateString(scan);
			scan.nextLine(); 
			System.out.println("Enter car #" + (i + 1) + " Year: "); 
			int inputYear = Validator.validateYear(scan); 
			scan.nextLine(); 
			System.out.println("Enter car #" + (i + 1) + " Price: "); 
			double inputPrice = Validator.validateDouble(scan); 
			scan.nextLine(); 
			
			cars.add(new Car(inputMake, inputModel, inputYear, inputPrice));  
		}
		
		System.out.println("Current Inventory:"); 
		for (int i = 0; i < cars.size(); i++) {
			System.out.printf("%-10s %-10s %-10s %-10s\n", cars.get(i).getMake(), cars.get(i).getModel(), cars.get(i).getYear(), "$" + cars.get(i).getPrice());
		}
	}

}
