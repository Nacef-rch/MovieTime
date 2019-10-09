/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movietimes.view.User;

import BaseDonnee.Connecter;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import movietimes.view.MainViewController;

/**
 * FXML Controller class
 *
 * @author NACEF
 */
public class SeatController implements Initializable {
 Statement stmt;
    Connecter maconnexion=new Connecter();
    private JFXTextField HashCode;
    @FXML
    private HBox Hboxy;
    @FXML
    private JFXButton Confirm;
    String test;
    @FXML
    private JFXTextField visa;
    @FXML
    private ImageView image;
    @FXML
    private Label User;
    @FXML
    private Label Date;
    @FXML
    private Label Place;
    @FXML
    private Label Cinema;
    @FXML
    private Label Price;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        // TODO
    }    

    @FXML
    private void Confirm(ActionEvent event) {
          if ( visa.getText().length() != 16 ) 
              {
                    visa.setText("");
        
        
              }
              else {
        Hboxy.getChildren().remove(Confirm);
        Hboxy.getChildren().remove(visa);
        
        
        
        HashCode = new JFXTextField();
        test = visa.getText();
       
        HashCode.setPrefHeight(25.0);
     HashCode.setPrefWidth(350.0);
        HashCode.setLayoutX(10.0);
        HashCode.setLayoutY(10.0);
        HashCode.setStyle("-fx-text-inner-color: #93a4fd;-fx-alignment: center ;");
        
        HashCode.setFont(new Font("Calibri", 16.0));
        HashCode.setEditable(false);
        HashCode.setText("A5hgAZ@FA!I7FJNcA?Xk0Gad8BaJ");
        Hboxy.getChildren().add(HashCode);
        System.out.println(test);
                      }
    }
        public void myFunction3(int x ,String user,String salle,String date){
        User.setText(user);
         try {
             
                    stmt=maconnexion.ObtenirConnexion().createStatement();
                  
                    

                      ResultSet rs=stmt.executeQuery("select *from projection where id='"+x+"'");
                  // ResultSet pic=stmt.executeQuery("select * from film where id="+x+"");
                   /*while(pic.next()){
                      
                            image.setImage(new Image(getClass().getResource("Icons/MainView/Posters/"+pic.getString(7)).toExternalForm()));
                   }*/
                      while(rs.next()){
                          double prix=rs.getDouble(4);
                          
                           Price.setText(rs.getString(4));

                          System.out.println(rs.getString(4));
                      }

         }catch (SQLException ex) {
                    Logger.getLogger(MainViewController.class.getName()).log(Level.SEVERE, null, ex);
                }
         Date.setText(date);
         Cinema.setText(salle);
        System.out.print("Seat : "+x);
    }
    }
    

