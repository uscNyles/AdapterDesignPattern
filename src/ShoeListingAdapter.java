/**
 * Integrates shoe with the ability to use product listing methods.
 * @author nylesgeiger
 *
 */
public class ShoeListingAdapter implements ProductListing {

	private ShoeListing shoe;
	private String title;
	private String brand;
	private double price;
	private String description;

	public ShoeListingAdapter(ShoeListing shoe) {
		this.shoe = shoe;

	}

	/**
	 * uses the shoe objects toString to access the name of the shoe
	 */
	@Override
	public String getTitle() {
		return shoe.toString().substring(shoe.toString().indexOf("Shoe: ") + 6, shoe.toString().indexOf("\nBy: "));
	}

	/**
	 * uses the shoe objects toString to access the cost of the shoe
	 */
	@Override
	public double getPrice() {

		return Double.parseDouble(shoe.toString().substring(shoe.toString().indexOf("$") + 1));
	}

	/**
	 * uses the shoe objects toString to access the brand and description of the shoe
	 */
	@Override
	public String getDescription() {

		return ("Created by "
				+ shoe.toString().substring(shoe.toString().indexOf("By: ") + 4, shoe.toString().indexOf("\nDetails: "))
				+ ", " + shoe.toString().substring(shoe.toString().indexOf("Details: ") + 9,
						shoe.toString().indexOf("\n Cost: $")));
	}

}
