	/**
	 * The {@code BMW} class extends {@code CarShop}.
	 * 
	 * @author Max Bryant (mbryant3@albany.edu)
	 */

public class BMW extends CarShop{
	public String carType; 
	public String interiorColor;
	public String engineType;
	public String windowTint;
	

	public BMW(String brand, String year, String color, String plateNumber, double price, String carType, String interiorColor, String engineType, String windowTint) {
		super(brand, year, color, plateNumber, price);
		this.carType = carType;
		this.interiorColor = interiorColor;
		this.engineType = engineType;
		this.windowTint = windowTint;
	}
}
