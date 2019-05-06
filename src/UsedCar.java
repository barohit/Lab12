
public class UsedCar extends Car {
	
	private double mileage; 
	
	public UsedCar(String carMake, String carModel, int carYear, double carPrice,  double carMileage) {
		make = carMake; 
		model = carModel;  
		year = carYear; 
		price = carPrice; 
		mileage = carMileage; 
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public String toString () {
		return super.toString() + "Mileage: " + mileage;  
	}
}
