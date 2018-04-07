package application.controller.ConfirmationController;



import java.net.URL;
import java.util.ResourceBundle;

import application.Main.Main;
import application.controller.MarketController.MarketController;
import application.model.Cart.Cart;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Controller for the confirmation.fxml. Replaces the text with the receipt name and
 * the cart total. Also allows the user to go to the market again to create a new cart.
 * @author David Avila
 *
 */
public class ConfirmationController implements Initializable {

	/**
	 * Declares variables. A new button, and text.
	 */
	Stage primaryStage = new Stage();
	@FXML private Button market;
	@FXML private Text total;
	@FXML private Text receipt;
	Cart newCart = Main.myCart;
	
	/** 
	 * On the start up of the scene the scene sets the text to the receipt name and the
	 * total price the user pays for their cart.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb){
		receipt.setText("Goodbye");
		total.setText(String.valueOf(newCart.total));
		
	}
	
	/**
	 * 
	 * @param event
	 */
	@FXML
	public void handle(ActionEvent event){
		market = (Button) event.getSource();
		
		if(market.getId().equals("market")){
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
