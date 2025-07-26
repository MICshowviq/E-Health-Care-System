/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tanjintia
 */
public class AddNewPatientController implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private ChoiceBox <String> myChoiceBox;
    
    private String[] gender;

    public AddNewPatientController() {
        this.gender = new String[]{"Female", "Male", "Others"};
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        boolean addAll = myChoiceBox.getItems().addAll(gender);
    }
   public void homeButtonPushed(ActionEvent event) throws Exception
    {
        Parent homeParent = FXMLLoader.load(getClass().getResource("home.fxml"));
        Scene homeScene = new Scene(homeParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(homeScene);
        window.show();
    }
    public void aboutUsButtonPushed(ActionEvent event) throws Exception
    {
        Parent aboutUsParent = FXMLLoader.load(getClass().getResource("aboutUs.fxml"));
        Scene aboutUsScene = new Scene(aboutUsParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(aboutUsScene);
        window.show();
    }
    
}
