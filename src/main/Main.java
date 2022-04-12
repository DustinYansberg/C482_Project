package main;

import Model.InHouse;
import Model.Inventory;
import Model.Product;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/FirstScreen.fxml")));
        stage.setTitle("First Screen");
        stage.setScene(new Scene(root, 900, 346));
        stage.show();
    }

    public static void main(String[] args){

        // initialize InHouse items to later be displayed in the partTable TableView
        InHouse part1 = new InHouse(1,"Brakes",15.0,10,1,15,111);
        InHouse part2 = new InHouse(2,"Wheel",23.0,10,2,20,222);
        InHouse part3 = new InHouse(3,"Seat",34.0,15,3,30,333);
        // Add the InHouse items to the Inventory.
        // Inventory parts are pulled into the TableView in FirstScreen.java
        Inventory.addPart(part1);
        Inventory.addPart(part2);
        Inventory.addPart(part3);

        // Repeat the process for products
        Product product1 = new Product(1,"Giant bike",299.99,5,1,10);
        Product product2 = new Product(2,"Tricycle",99.99,3,1,10);
        Inventory.addProduct(product1);
        Inventory.addProduct(product2);

        launch(args);
    }
}
