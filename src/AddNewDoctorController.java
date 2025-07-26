/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tanjintia
 */
public class AddNewDoctorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
