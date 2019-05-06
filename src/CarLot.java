public class CarLot {
	
	int lotCapacity; 
	Car[][] lot = new Car[50][50]; 
	
	public void showLot() {
		for (int i = 0; i < lot.length; i++) {
			for (int j = 0; j < lot[i].length; j++)  {
				if (lot[i][j] != null) {
					System.out.println(lot[i][j].toString()); 
					System.out.println(""); 
				}
			}
		}
	}
	
	public void addCar(Car c) {
		if (lotCapacity < 2500) {
			int col = lotCapacity % 50; 
			int row = lotCapacity / 50; 
			if (col == 0) {
				lot[row + 1] [col] = c; 
			} else {
				lot[row][col + 1] = c; 
			}
			lotCapacity++; 
		} else {
			System.out.println("Sorry, lot is full"); 
		}
				
	}
	
	public void removeCar(int i, int j) {
		if (lot[i][j] != null) {
			lot[i][j] = null; 
			lotCapacity--; 
		} else {
			System.out.println("Error, there is no car in this position"); 
		}
	}
	
	public Car findCar(int i, int j) {
		return lot[i][j]; 
	}
	
	public void findCarByMake(String s) {
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				try {
					if (lot[i][j].getMake().equals(s)) {
						System.out.println(lot[i][j].toString()); 
					}
				} catch (NullPointerException e) {
				  }
			}
		}
	}
	
	public void findCarByYear(int s) {
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				try {
					if (lot[i][j].getYear() == s) {
						System.out.println(lot[i][j].toString()); 
					}
				} catch (NullPointerException e) {
				  }
			}
		}
	}
	
	public void findCarByPrice(double s) {
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				try {
					if (lot[i][j].getPrice() <= s) {
						System.out.println(lot[i][j].toString()); 
					}
				} catch (NullPointerException e) {
				  }
			}
		}
	}
	
	public void findUsedCars() {
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				try {
					if (lot[i][j] instanceof UsedCar) {
						System.out.println(lot[i][j].toString()); 
					}
				} catch (NullPointerException e) {
				  }
			}
		}
	}
	
	
	public void replaceCar(int i, int j, Car c) {
		lot[i][j] = c; 
	}
}


