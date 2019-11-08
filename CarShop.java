
public class CarShop {	
	/**
	 * The brand of this {@code Car}.
	 */
	protected String brand;
	/**
	 * The model year of this {@code Car}.
	 */
	protected String year;
	
	/**
	 * The color of this {@code Car}.
	 */
	protected String color;
	
	/**
	 * The plate number of this {@code Car}.
	 */
	protected String plateNumber;
	
	/**
	 * The cost of this {@code Car}.
	 */
	protected double price;
	
	/**
	 * Constructs a {@code Car} instance.
	 * 
	 * @param plateNumber
	 *            the plate number of the {@code Car}.
	 */
	public CarShop(String brand, String year, String color, String plateNumber, double price) {
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.plateNumber = plateNumber;
		this.price = price;
	}

	/**
	 * Returns a string representation of this {@code Car}.
	 * 
	 * @return a string representation of this {@code Car}.
	 */
	public String toString() {
		return getClass().getSimpleName() + "\nBrand: " + brand + "\nCar Year: " + year + "\nCar Color: " + color + "\nPlate Number: " + plateNumber + "\nCar Price: " + price;
	}
	
	/**
	 * Returns a integer representation of a string value {@code Car}.
	 * 
	 * @return an integer {@code Car}.
	 */
	@Override
	public int hashCode() {
		return plateNumber.hashCode();
		}
	
	/**
	 * Returns a boolean expression whether if types are equal {@code Car}.
	 * 
	 * @return true if plate number and exterior color are equal, otherwise false {@code Car}.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CarShop) {
			CarShop e = (CarShop) obj;
			if (e.brand.equals(this.brand) && e.year.equals(this.year) && e.color.equals(this.color) && e.plateNumber.equals(this.plateNumber) && e.price == (this.price)) {
				return true;
			}		
		}
		return false;
		}
	
	/**
	 * The main method.
	 * 
	 * @param args
	 *            the program arguments.
	 */
	public static void main(String[] args) {
		LinkedList<CarShop> s = new LinkedList<CarShop>();
		s.addFirst(new CarShop("Mercedes", "1999", "Red", "1YN", 15000));
		s.addFirst(new CarShop("BMW", "2003", "Green", "26Z", 18000));
		s.addFirst(new CarShop("Ford", "2007", "Yellow", "15K", 22000));
        System.out.println(s);
        System.out.println();
        s.getFirst();
        s.contains(new CarShop("Mercedes", "1999", "Red", "1YN", 15000));
	}

}

