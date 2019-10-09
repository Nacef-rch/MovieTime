/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietimes.view.User;

import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author NACEF
 */
public class TicketController implements Initializable {

    private JFXComboBox<String> Cinema;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      Cinema.getItems().add("Cinema Star");
      Cinema.getItems().add("Cinema Palace");
      
    }    
    
}
