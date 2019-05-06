
public class Car {
	
	protected String make; 
	protected String model; 
	protected int year; 
	protected double price; 
	
	public Car() {
		make = ""; 
		model = ""; 
		year = 0; 
		price = 0.0; 
	}
	
	public Car(String carMake, String carModel, int carYear, double carPrice) {
		make = carMake; 
		model = carModel;  
		year = carYear; 
		price = carPrice; 
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		return "" + "Make: " + make + " Model: " + model + " Year: " + year + " Price: " + price; 
	}
	
	

}
