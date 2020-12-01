/**
 * Defines the shape of a shoe object and how its information is printed to the
 * screen
 * 
 * @author nylesgeiger
 *
 */
public class Shoe implements ShoeListing {

	private String brand;
	private String name;
	private double cost;
	private String description;

	public Shoe(String brand, String name, double cost, String description) {
		this.brand = brand;
		this.name = name;
		this.cost = cost;
		this.description = description;
	}

	/**
	 * Prints the shoes brand, name, cost, and description in a specified format
	 */
	@Override
	public String toString() {
		return ("Shoe: " + this.name + "\nBy: " + this.brand + "\nDetails: " + this.description + "\n Cost: $"
				+ this.cost);
	}
}
