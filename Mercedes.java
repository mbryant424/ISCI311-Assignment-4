	/**
	 * The {@code Mercedes} class extends {@code CarShop}.
	 * 
	 * @author Max Bryant (mbryant3@albany.edu)
	 */

public class Mercedes extends CarShop{
	
	public String carType; 
	public String interiorColor;
	public String engineType;

	

	public Mercedes(String brand, String year, String color, String plateNumber, double price, String carType, String interiorColor, String engineType) {
		super(brand, year, color, plateNumber, price);
		this.carType = carType;
		this.interiorColor = interiorColor;
		this.engineType = engineType;
	}
	
	
}
