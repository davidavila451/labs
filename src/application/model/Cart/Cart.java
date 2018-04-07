package application.model.Cart;

import java.util.ArrayList;
import java.util.HashMap;

import application.model.Item.Item;

public class Cart {
	
	public ArrayList<Cart> cartList;
	public String item;
	public int quant;
	public double price;
	public double total;
	public HashMap<String, Item> map = new HashMap<String, Item>();
	
	
	public void sortList(){
		System.out.println(map.get("apple").quantity);
			
	}
	
	public HashMap<String, Item> newApple(){
		Item apple = new Item("Apple", 0.89);
		map.put("apple", apple);
		map.get("apple").quantity++;
		return map;
	}
	
	public HashMap<String, Item> newBanana(){
		Item banana = new Item("Banana", 0.27);
		map.put("banana", banana);
		map.get("banana").quantity++;
		return map;
	}
	
	public HashMap<String, Item> newCarrot(){
		Item carrot = new Item("Carrot", 0.89);
		map.put("carrot", carrot);
		map.get("carrot").quantity++;
		return map;
	}
	
	public HashMap<String, Item> newFood(){
		Item food = new Item("Dog Food", 7.29);
		map.put("food", food);
		map.get("food").quantity++;
		return map;
	}
	
	public HashMap<String, Item> newEggplant(){
		Item eggplant = new Item("Eggplant", 2.69);
		map.put("eggplant", eggplant);
		map.get("eggplant").quantity++;
		return map;
	}
	
	public HashMap<String, Item> newFennel(){
		Item fennel = new Item("Fennel", 1.49);
		map.put("fennel", fennel);
		map.get("fennel").quantity++;
		return map;
	}
	public HashMap<String, Item> newGrapes(){
		Item grapes = new Item("Grapes", 3.99);
		map.put("grapes", grapes);
		map.get("grapes").quantity++;
		return map;
	}
	public HashMap<String, Item> newHorse(){
		Item horse = new Item("Horseradish", 0.59);
		map.put("horse", horse);
		map.get("horse").quantity++;
		return map;
	}
	public HashMap<String, Item> newIce(){
		Item ice = new Item("Ice", 0.50);
		map.put("ice", ice);
		map.get("ice").quantity++;
		return map;
	}
	
	public HashMap<String, Item> newJuice(){
		Item juice = new Item("Juice", 2.39);
		map.put("juice", juice);
		map.get("juice").quantity++;
		return map;
	}
	
	public HashMap<String, Item> newKale(){
		Item kale = new Item("Kale", 1.23);
		map.put("kale", kale);
		map.get("kale").quantity++;
		return map;
	}
	
	public HashMap<String, Item> newLemon(){
		Item lemon = new Item("Lemon", 0.16);
		map.put("lemon", lemon);
		map.get("lemon").quantity++;
		return map;
	}
	


	
	

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
