
	/**
	 * The {@code Ford} class extends {@code CarShop}.
	 * 
	 * @author Max Bryant (mbryant3@albany.edu)
	 */

public class Ford extends CarShop {
	public String interiorColor;
	public String carType; 
	

	public Ford(String brand, String year, String color, String plateNumber, double price, String interiorColor, String carType) {
		super(brand, year, color, plateNumber, price);
		this.interiorColor = interiorColor;
		this.carType = carType;
	}
}
