package controller;

import Model.InHouse;
import Model.Inventory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PartAddScreen {
    @FXML
    private Label partMachineIdLabel;
    @FXML
    private Label partCompanyNameLabel;
    @FXML
    private  TextField partCompanyNameTxt;
    @FXML
    private TextField partIdTxt;
    @FXML
    private TextField partPriceTxt;
    @FXML
    private TextField partMachineIdTxt;
    @FXML
    private TextField partMaxTxt;
    @FXML
    private TextField partMinTxt;
    @FXML
    private TextField partInvTxt;
    @FXML
    private Button savePart;
    @FXML
    private TextField partNameTxt;
    @FXML
    private RadioButton InHouseRdoBtn;
    @FXML
    private RadioButton OutsourcedRdoBtn;
    @FXML
    private javafx.scene.control.Button cancelButton;


    @FXML
    void onSaveButtonAction(ActionEvent event) {
        System.out.println("Save button pressed!");


        int id = 5;
                //Integer.parseInt(partIdTxt.getText());
        String name = partNameTxt.getText();
        int stock = Integer.parseInt(partInvTxt.getText());
        double price = Double.parseDouble(partPriceTxt.getText());
        int min = Integer.parseInt(partMinTxt.getText());
        int max = Integer.parseInt(partMaxTxt.getText());
        int machineId = Integer.parseInt(partMachineIdTxt.getText());
        String companyName = partCompanyNameTxt.getText();

        // if in house radio button is pressed, add inventory via In House class
        if (onInHouseRadioAction()){
            InHouse part = new InHouse(id,name,price,stock,min,max,machineId);
            Inventory.addPart(part);
        }
        if(onOutsourcedRdoBtnAction()){

        }

        // if OutSourced radio button is pressed, add inventory via In House class

    }



    @FXML
    void cancelButtonAction(){
        //close the window and don't save
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
    @FXML
    boolean onInHouseRadioAction() {
        boolean inHouse = true;
        partMachineIdLabel.setVisible(true);
        partMachineIdTxt.setVisible(true);
        return inHouse;
    }
    @FXML
    boolean onOutsourcedRdoBtnAction() {
        boolean outsourced = true;
        partCompanyNameLabel.setVisible(true);
        partCompanyNameTxt.setVisible(true);
        return outsourced;
    }
}
