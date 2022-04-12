package controller;

import Model.Inventory;
import Model.Part;
import Model.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class FirstScreen implements Initializable {

    public Button partAddBtn;
    public Button partModBtn;
    public Button partDeleteBtn;

    @FXML
    private TableView<Product> prdctTable;
    @FXML
    private TableColumn<Product, Integer> prdctTblPrdctID;
    @FXML
    private TableColumn<Product, String> prdctTblPrdctName;
    @FXML
    private TableColumn<Product, Integer> prdctTblInv;
    @FXML
    private TableColumn<Product, Double> prdctTblPrice;

    @FXML
    private TableView<Part> partTable;
    @FXML
    private TableColumn<Part, Integer> partTblPartID;
    @FXML
    private TableColumn<Part, String> partTblPartName;
    @FXML
    private TableColumn<Part, Integer> partTblInvLvl;
    @FXML
    private TableColumn<Part, Double> partTblPrice;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("I am initialized!");

        //pull the inventory part items that were set in the main function
        partTable.setItems(Inventory.getAllParts());
        partTblPartID.setCellValueFactory(new PropertyValueFactory<>("id"));
        partTblPartName.setCellValueFactory(new PropertyValueFactory<>("name"));
        partTblInvLvl.setCellValueFactory(new PropertyValueFactory<>("stock"));
        partTblPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

        prdctTable.setItems(Inventory.getAllProducts());
        prdctTblPrdctID.setCellValueFactory(new PropertyValueFactory<>("id"));
        prdctTblPrdctName.setCellValueFactory(new PropertyValueFactory<>("name"));
        prdctTblInv.setCellValueFactory(new PropertyValueFactory<>("stock"));
        prdctTblPrice.setCellValueFactory(new PropertyValueFactory<>("price"));

    }
    //  addPartButtonAction opens the add part screen
    public void addPartButtonAction() throws IOException {
        System.out.println("The part add button was pressed!");
        Parent part = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/PartAddScreen.fxml")));
        Stage addPart = new Stage();
        addPart.setTitle("Add Part Screen");
        addPart.setScene(new Scene(part, 725, 459));
        addPart.show();
    }
    //  modifyPartButtonAction opens the modify part screen
    public void modifyPartButtonAction() throws IOException {
        System.out.println("The add product button was pressed!");
        Parent part = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/PartModifyScreen.fxml")));
        Stage modifyPart = new Stage();
        modifyPart.setTitle("Add Part Screen");
        modifyPart.setScene(new Scene(part, 877, 631));
        modifyPart.show();
    }
    //  addProductButtonAction opens the add product screen
    public void addProductButtonAction() throws IOException {
        System.out.println("The add product button was pressed!");
        Parent part = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/ProductAddScreen.fxml")));
        Stage addProduct = new Stage();
        addProduct.setTitle("Add Part Screen");
        addProduct.setScene(new Scene(part, 877, 631));
        addProduct.show();
    }
    //  modifyProductButtonAction opens the add product screen
    public void modifyProductButtonAction() throws IOException {
        System.out.println("The add product button was pressed!");
        Parent part = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/view/ProductModifyScreen.fxml")));
        Stage modifyProduct = new Stage();
        modifyProduct.setTitle("Add Part Screen");
        modifyProduct.setScene(new Scene(part, 877, 631));
        modifyProduct.show();
    }
}
