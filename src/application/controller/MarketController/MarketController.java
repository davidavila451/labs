package application.controller.MarketController;



import application.Main.Main;
import application.model.Cart.Cart;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MarketController {
	
	Stage primaryStage = new Stage();
	@FXML Button apple;
	@FXML Button banana;
	@FXML Button carrot;
	@FXML Button food;
	@FXML Button eggplant;
	@FXML Button fennel;
	@FXML Button grapes;
	@FXML Button horse;
	@FXML Button ice;
	@FXML Button juice;
	@FXML Button kale;
	@FXML Button lemon;
	@FXML Button cart;
	Cart newCart = Main.myCart;
	
	
	@FXML
	public void handle(ActionEvent event){
		apple = (Button) event.getSource();
		banana = (Button) event.getSource();
		carrot = (Button) event.getSource();
		food = (Button) event.getSource();
		eggplant = (Button) event.getSource();
		fennel = (Button) event.getSource();
		grapes = (Button) event.getSource();
		horse = (Button) event.getSource();
		ice = (Button) event.getSource();
		juice = (Button) event.getSource();
		kale = (Button) event.getSource();
		lemon = (Button) event.getSource();
		cart = (Button) event.getSource();
		
		if(apple.getId().equals("apple")){
			newCart.newApple();
		}else if(banana.getId().equals("banana")){
			newCart.newBanana();
		}else if(carrot.getId().equals("carrot")){
			newCart.newCarrot();
		}else if(food.getId().equals("food")){
			newCart.newFood();
		}else if(eggplant.getId().equals("eggplant")){
			newCart.newEggplant();
		}else if(fennel.getId().equals("fennel")){
			newCart.newFennel();
		}else if(grapes.getId().equals("grapes")){
			newCart.newGrapes();
		}else if(horse.getId().equals("horse")){
			newCart.newHorse();
		}else if(ice.getId().equals("ice")){
			newCart.newIce();
		}else if(juice.getId().equals("juice")){
			newCart.newJuice();
		}else if(kale.getId().equals("kale")){
			newCart.newKale();
		}else if(lemon.getId().equals("lemon")){
			newCart.newLemon();
		}else if(cart.getId().equals("cart")){	
			try{
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MarketController.class.getResource("/Cart.fxml"));
				AnchorPane layout = (AnchorPane) loader.load();
				Scene scene = new Scene(layout);
				Main.stage.setScene(scene);
			} catch(Exception e){
				e.printStackTrace();
			}
		}

	}
}
