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
public class HomeController implements Initializable {

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
    public void registerButtonPushed(ActionEvent event) throws Exception
    {
        Parent registerParent = FXMLLoader.load(getClass().getResource("register.fxml"));
        Scene registerScene = new Scene(registerParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(registerScene);
        window.show();
    }
    public void allDoctorsButtonPushed(ActionEvent event) throws Exception
    {
        Parent allDoctorsParent = FXMLLoader.load(getClass().getResource("allDoctors.fxml"));
        Scene allDoctorsScene = new Scene(allDoctorsParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(allDoctorsScene);
        window.show();
    }
  
    public void contactUsButtonPushed(ActionEvent event) throws Exception
    {
        Parent contactUsParent = FXMLLoader.load(getClass().getResource("contactUs.fxml"));
        Scene contactUsScene = new Scene(contactUsParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(contactUsScene);
        window.show();
    }
    public void patientButtonPushed(ActionEvent event) throws Exception
    {
        Parent patientParent = FXMLLoader.load(getClass().getResource("patient.fxml"));
        Scene patientScene = new Scene(patientParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(patientScene);
        window.show();
    }
    public void adminButtonPushed(ActionEvent event) throws Exception
    {
        Parent adminParent = FXMLLoader.load(getClass().getResource("admin.fxml"));
        Scene adminScene = new Scene(adminParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(adminScene);
        window.show();
    }
}
