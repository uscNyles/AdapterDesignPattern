
import java.util.ArrayList;

public class Store {

	public void displayProducts() {
		ArrayList<ProductListing> listings = new ArrayList<ProductListing>();
		listings.add(new Product("Construction Paper", 20.99, "A 200 count pack of varying colors of construction paper"));
		listings.add(new Product("Crayons", 1.99, "A 24 count of crayons"));
		listings.add(new Product("Back Pack", 17.34, "A rainbow unicorn backpack"));
		listings.add(new Product("Pencil Case", 5.44, "A durable mini mouse pencil case."));
		
		ArrayList<ShoeListing> shoes = new ArrayList<ShoeListing>();
		shoes.add(new Shoe("Merrell", "Women's Hollyleaf Sandal", 69.95, "A seamless slip between casual and dressy, sporty and stylish."));
		shoes.add(new Shoe("Under Armour", "Men's Charged Assert 8 Running Shoe", 44.97, "For runners who need a balance of flexibility and cushioning."));
		shoes.add(new Shoe("Feethit", "Womens Slip on Walking Shoes", 27.99, "Breathable Mesh shoe which is perfect for long walks in hot weather."));
		shoes.add(new Shoe("find", "Men's Chunky Leather Boat Shoe", 52.49, "A casual and comfortable work or home shoe."));
		
		//adapt each shoe and add them to this product list
		for(ShoeListing shoe : shoes) {
			listings.add(new ShoeListingAdapter(shoe));
		}
		
		System.out.println("*********** Displaying Products ***************");
		for(ProductListing listing : listings) {
			displayProduct(listing);
		}
	}
	
	public void displayProduct(ProductListing product) {
		System.out.println(product.getTitle());
		System.out.println(product.getDescription());
		System.out.println("Price: $" + product.getPrice() + "\n");
	}
	
	public static void main(String[] args) {
		Store store = new Store();
		store.displayProducts();
		
	}
}
