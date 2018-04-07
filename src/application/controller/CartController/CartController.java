package application.controller.CartController;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main.Main;
import application.controller.MarketController.MarketController;
import application.model.Cart.Cart;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 * Cart Controller that handles what is displayed in the cart and contains two buttons
 * that let the user either return to the market or check out.
 * @author David Avila
 *
 */
public class CartController implements Initializable{

	/**
	 * Deceleration of variables. New buttons, a table, and text.
	 */
	Stage primaryStage = new Stage();
	@FXML private Button market;
	@FXML private Button out;
	@FXML private Text totalCost;
	@FXML private TableView<Cart> table;
	@FXML private TableColumn<Cart, String> item;
	@FXML private TableColumn<Cart, String> quant;
	@FXML private TableColumn<Cart, String> price;
	Cart newCart = Main.myCart;
	
	/**
	 * At the start of the scene being pulled up the text is changed to the total cost
	 * of all the items selected. The table is also created that holds all the items
	 * and what was mapped in the cart.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb){
		newCart.sortList();
		
		totalCost.setText(String.valueOf(newCart.total));
		
		item.setCellValueFactory(new PropertyValueFactory<Cart, String>("Item"));
		quant.setCellValueFactory(new PropertyValueFactory<Cart, String>("Quantity"));
		price.setCellValueFactory(new PropertyValueFactory<Cart, String>("Price"));
		
		System.out.println("Hello");
		//for(int i=0; i<newCart.cartList.size(); i++){
			//System.out.println(newCart.cartList.get(i).item + " " + newCart.cartList.get(i).quant + " " + newCart.cartList.get(i).price);
		//}
		//table.setItems(getCart());
	}
	
	/**
	 * Creates a new observable array list that contains an item, quantity of that item,
	 * and the total price for that item. Sends the array list tot the table to be set
	 * into the table
	 * @return
	 */
	public ObservableList<Cart> getCart(){
		ObservableList<Cart> carts = FXCollections.observableArrayList();
		for(int i=0; i<newCart.cartList.size(); i++){
			//carts.add(new Cart(newCart.cartList.get(i).item, newCart.cartList.get(i).quant, newCart.cartList.get(i).price));
		}
		return carts;
		
	}
	
	/**
	 * Handles what happens when the buttons are clicked. If the market button is
	 * clicked then replace the scene with market.fxml.
	 * If the check out button is clicked then replace the scene with the 
	 * confirmation.fxml.
	 * @param event
	 */
	@FXML
	public void handle(ActionEvent event){
		market = (Button) event.getSource();
		out = (Button) event.getSource();
		
		if(out.getId().equals("out")){
			try{
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MarketController.class.getResource("/Confirmation.fxml"));
				AnchorPane layout = (AnchorPane) loader.load();
				Scene scene = new Scene(layout);
				Main.stage.setScene(scene);
			} catch(Exception e){
				e.printStackTrace();
			}
		} else if(market.getId().equals("market")){
			table.getItems().clear();
			try{
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MarketController.class.getResource("/Market.fxml"));
				AnchorPane layout = (AnchorPane) loader.load();
				Scene scene = new Scene(layout);
				Main.stage.setScene(scene);
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
