/**
 * Returns the titles, price, and description of a product.
 * @author nylesgeiger
 *
 */
public class Product implements ProductListing{

	private String title;
	private double price;
	private String description;
	
	
	public Product(String title, double price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}

	@Override
	public String getTitle() {
		
		return this.title;
	}

	@Override
	public double getPrice() {
		
		return this.price;
	}

	@Override
	public String getDescription() {
		
		return this.description;
	}

}
