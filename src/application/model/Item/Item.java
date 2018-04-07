package application.model.Item;

public class Item {
	
	/**
	 * Deceleration of variables
	 */
	public String item;
	public double price;
	public int quantity;
	
	
	/**
	 * Constructor for a new Item containing the item name and price.
	 * @param item
	 * @param price
	 */
	public Item(String item, double price){
		this.item = item;
		this.price = price;
	}
}
